--Selecionar todos os registros e atributos da entidade cargo.
select * from cargo;

--Selecionar a quantidade de vereadores da entidade cidade, ordenado pelo nome da cidade.
select nome, qt_vereadores from cidade order by nome asc;

--Quantidade de vereadores da entidade cidade, somente das cidades que possuem 9 vereadores.
select nome, qt_vereadores from cidade where qt_vereadores >= 9 order by qt_vereadores ASC;

--Quantidade de cidades que possuem mais de 9 vereadores.
select nome, qt_vereadores from cidade where qt_vereadores > 9;

--Quantidade máxima de vereadores que uma cidade possui.
select max(qt_vereadores) from cidade; 

--A cidade que possui mais vereadores.
select nome from cidade where qt_vereadores = (select max(qt_vereadores) from cidade);   

--O nome dos candidatos a prefeito ordenados pelo nome.
select nome, cargo from candidato where cargo = 1 order by nome asc;

--O nome dos candidatos a vereador que possuem "maria" no nome ordenados pelo nome
select nome, cargo from candidato where cargo = 2 and nome like '%MARIA%' order by nome asc;

--O nome dos candidatos a vereador que iniciam com 'Y' ordenado pelo nome
select nome, cargo from candidato where cargo = 2 and nome like 'Y%' order by nome asc;

--Selecionar o nome dos candidatos a prefeito de cada cidade, ordenado pelo nome da cidade e em seguida pelo nome do candidato
select car.nome, car.cargo from candidato car where cargo = 1 
inner join cidade cid  