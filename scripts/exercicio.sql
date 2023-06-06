--Selecionar todos os registros e atributos da entidade cargo.
select * from cargo;

--Selecionar a quantidade de vereadores da entidade cidade, ordenado pelo nome da cidade.
select nome, qt_vereadores from cidade order by nome asc;

--Quantidade de vereadores da entidade cidade, somente das cidades que possuem 9 vereadores.
select nome, qt_vereadores from cidade where qt_vereadores >= 9 order by qt_vereadores ASC;

--Quantidade de cidades que possuem mais de 9 vereadores.
select count(*) from cidade where qt_vereadores > 9;

--Quantidade máxima de vereadores que uma cidade possui.
select max(qt_vereadores) from cidade; 

--A cidade que possui mais vereadores.
select nome from cidade where qt_vereadores = (select max(qt_vereadores) from cidade);   

--O nome dos candidatos a prefeito ordenados pelo nome.
select c.nome, cargo.nome from candidato c
inner join cargo on cargo.id = c.cargo and cargo.nome = 'Prefeito'
order by c.nome;

--O nome dos candidatos a vereador que possuem "maria" no nome ordenados pelo nome
select c.nome from candidato c 
inner join cargo on cargo.id = c.cargo  and cargo.nome = 'Vereador'
where c.nome like '%MARIA %' 
order by c.nome;

--O nome dos candidatos a vereador que iniciam com 'Y' ordenado pelo nome
select c.nome from candidato c 
inner join cargo on cargo.id = c.cargo  and cargo.nome = 'Vereador'
where c.nome like 'Y%' 
order by c.nome;

--Selecionar o nome dos candidatos a prefeito de cada cidade, ordenado pelo nome da cidade e em seguida pelo nome do candidato
select cidade.nome Cidade, candidato.nome Candidato from cidade
inner join candidato on candidato.cidade = cidade.id 
inner join cargo on cargo.id = candidato.cargo and cargo.nome = 'Prefeito'
order by cidade.nome, candidato.nome;

--Selecionar o nome dos candidatos a prefeito da cidade 'TUBARÃO', ordenado pelo nome do candidato.
select cidade.nome Cidade, candidato.nome Candidato from cidade
inner join candidato on candidato.cidade = cidade.id and cidade.nome = 'TUBARÃO'
inner join cargo on cargo.id = candidato.cargo and cargo.nome = 'Prefeito'
order by cidade.nome, candidato.nome;

--Selecionar o nome dos candidatos a prefeito da cidade que tem o maior número de eleitores.
select candidato.nome Candidato, cidade.nome Cidade, cidade.qt_eleitores Eleitores from cidade
inner join candidato on candidato.cidade = cidade.id
inner join cargo on cargo.nome = 'Prefeito'
order by cidade.qt_eleitores desc;

--Selecionar a quantidade de candidatos a vereador da cidade de 'TUBARÃO'.
select count(*) TotalVereadores from (
  select cidade.nome Cidade, candidato.nome Candidato, count(*) as Total from cidade
  inner join candidato on candidato.cidade = cidade.id and cidade.nome = 'TUBARÃO'
  inner join cargo on cargo.id = candidato.cargo and cargo.nome = 'Vereador'
  group by cidade.nome, candidato.nome
) as subquery;

--Selecionar a quantidade de candidatos a vereador de cada cidade, ordenado pelo nome da cidade.
select count (*) TotalVereadores, cidade Cidade from (
  select cidade.nome Cidade, candidato.nome Candidato, count(*) as Total from cidade
  inner join candidato on candidato.cidade = cidade.id
  inner join cargo on cargo.id = candidato.cargo and cargo.nome = 'Vereador'
  group by cidade.nome, candidato.nome
) as subquery;