--1. Selecionar todos os registros e atributos da entidade cargo.
select * from cargo;

--2. Selecionar a quantidade de vereadores da entidade cidade, ordenado pelo nome da cidade.
select nome, qt_vereadores from cidade order by nome asc;

--3. Quantidade de vereadores da entidade cidade, somente das cidades que possuem 9 vereadores.
select nome, qt_vereadores from cidade where qt_vereadores >= 9 order by qt_vereadores ASC;

--4. Quantidade de cidades que possuem mais de 9 vereadores.
select count(*) from cidade where qt_vereadores > 9;

--5. Quantidade máxima de vereadores que uma cidade possui.
select max(qt_vereadores) from cidade; 

--6. A cidade que possui mais vereadores.
select nome from cidade where qt_vereadores = (select max(qt_vereadores) from cidade);   

--7. O nome dos candidatos a prefeito ordenados pelo nome.
select c.nome, cargo.nome from candidato c
inner join cargo on cargo.id = c.cargo and cargo.nome = 'Prefeito'
order by c.nome;

--8. O nome dos candidatos a vereador que possuem "maria" no nome ordenados pelo nome
select c.nome from candidato c 
inner join cargo on cargo.id = c.cargo  and cargo.nome = 'Vereador'
where c.nome like '%MARIA %' 
order by c.nome;

--9. O nome dos candidatos a vereador que iniciam com 'Y' ordenado pelo nome
select c.nome from candidato c 
inner join cargo on cargo.id = c.cargo  and cargo.nome = 'Vereador'
where c.nome like 'Y%' 
order by c.nome;

--10 .Selecionar o nome dos candidatos a prefeito de cada cidade, ordenado pelo nome da cidade e em seguida pelo nome do candidato
select cidade.nome Cidade, candidato.nome Candidato from cidade
inner join candidato on candidato.cidade = cidade.id 
inner join cargo on cargo.id = candidato.cargo and cargo.nome = 'Prefeito'
order by cidade.nome, candidato.nome;

--11. Selecionar o nome dos candidatos a prefeito da cidade 'TUBARÃO', ordenado pelo nome do candidato.
select cidade.nome Cidade, candidato.nome Candidato from cidade
inner join candidato on candidato.cidade = cidade.id and cidade.nome = 'TUBARÃO'
inner join cargo on cargo.id = candidato.cargo and cargo.nome = 'Prefeito'
order by candidato.nome;

--12. Selecionar o nome dos candidatos a prefeito da cidade que tem o maior número de eleitores.
select candidato.nome Candidato, cidade.nome Cidade from candidato 
inner join cargo on cargo.id = candidato.cargo  
inner join cidade on cidade.id = candidato.cidade  and cidade.qt_eleitores = (select max(qt_eleitores) from cidade);

--13. Selecionar a quantidade de candidatos a vereador da cidade de 'TUBARÃO'.
select count(*) TotalVereadores from (
    select cidade.nome Cidade, candidato.nome Candidato, count(*) as Total from cidade
    inner join candidato on candidato.cidade = cidade.id and cidade.nome = 'TUBARÃO'
    inner join cargo on cargo.id = candidato.cargo and cargo.nome = 'Vereador'
    group by cidade.nome, candidato.nome
) as subquery;

--14. Selecionar a quantidade de candidatos a vereador de cada cidade, ordenado pelo nome da cidade.
select cidade.nome, count (*) from candidato 
inner join cargo on cargo.id = candidato.cargo and cargo.nome = 'Vereador'
inner join cidade on cidade.id = candidato.cidade
group by cidade.nome
order by cidade.nome;

--15. Selecionar a quantidade de votos nulos e branco para prefeito e para vereador em Tubarão.
select cargo.nome, vi.nulos, vi.brancos from cargo
inner join voto_invalido vi on vi.cargo = cargo.id
inner join cidade on cidade.id = vi.cidade and cidade.nome = 'TUBARÃO';

--16. Quantidade de votos Invalidos (brancos+nulos) para prefeito da cidade de Tubarão.
select vi.nulos + vi.brancos as total
from cargo
inner join voto_invalido vi on vi.cargo = cargo.id and cargo.nome = 'Prefeito'
inner join cidade on cidade.id = vi.cidade and cidade.nome = 'TUBARÃO';

--17. Quantidade de votos válidos para cada candidato a prefeito da cidade de Tubarão, ordenado pela maior qtd de voto
select candidato.nome, voto.voto as votos from candidato 
inner join voto on voto.candidato = candidato.id 
inner join cargo on cargo.id = candidato.cargo and cargo.nome = 'Prefeito'
inner join cidade on cidade.id = candidato.cidade and cidade.nome = 'TUBARÃO'
order by votos desc;

--18. Quantidade de votos válidos p/ vereador de Tubarão.
select candidato.nome, voto.voto as votos from candidato 
inner join voto on voto.candidato = candidato.id 
inner join cargo on cargo.id = candidato.cargo and cargo.nome = 'Vereador'
inner join cidade on cidade.id = candidato.cidade and cidade.nome = 'TUBARÃO'
order by votos desc;

--19. Maior quantidade de votos para prefeito de cada cidade.
select cidade.nome, max(voto.voto) from cidade 
inner join candidato on candidato.cidade = cidade.id  
inner join cargo on cargo.id = candidato.cargo and cargo.nome = 'Prefeito'
inner join voto on voto.candidato = candidato.id 
group by cidade.nome;

--20. Selecionar os partidos e qtd de votos p/ cada um em Tubarão ordernado pela maior qtd de votos.
select partido.sigla, sum(voto.voto) as votos from partido 
inner join candidato on candidato.partido = partido.id 
inner join cidade on cidade.id = candidato.cidade and cidade.nome = 'TUBARÃO'
inner join voto on voto.candidato = candidato.id 
group by partido.sigla
order by votos desc;

--21. Qtd de votos registrados p/ pref. da cidade de Tubarão. s votos registrados são considerados votos p/ candidatos, + votos brancos e nulos.



--22. Qtd de eleitores que deixaram de votar na cidade de Tubarão.
select sum (vi.nulos + vi.brancos) as total from cargo
inner join voto_invalido vi on vi.cargo = cargo.id 
inner join cidade on cidade.id = vi.cidade and cidade.nome = 'TUBARÃO';

--23. Qtd de eleitores que deixaram de votar em cada cidade, ordenado pela maior quantidade de faltantes.
select cidade.nome, sum (vi.nulos + vi.brancos) as total from cargo
inner join voto_invalido vi on vi.cargo = cargo.id 
inner join cidade on cidade.id = vi.cidade
group by cidade.nome
order by total desc;

--24. Selecionar o percentual de faltantes em cada cidade, ordenado pelo maior percentual.


--25. Selecionar o candidato a prefeito eleito de cada cidade, ordenado pelo nome da cidade. Terminar
select cidade.nome, candidato.nome, max(voto.voto) from cidade 
inner join candidato on candidato.cidade = cidade.id  
inner join cargo on cargo.id = candidato.cargo and cargo.nome = 'Prefeito'
inner join voto on voto.candidato = candidato.id 
group by cidade.nome, candidato.nome
order by cidade.nome, candidato.nome;