

CREATE TABLE ADM(
login varchar(20),
senha varchar(20) not null,
primary key (login));

CREATE TABLE PRODUTO(
nome varchar(20) not null,
preco numeric(6,2) not null,
codigo varchar(30),
informacoes varchar(50) not null,
cor varchar(20),
tamanho varchar(10),
primary key(codigo));

CREATE TABLE LOJA(

);

CREATE TABLE PEDIDOS(

);

CREATE TABLE ITEM_PRODUTO(

);

CREATE TABLE PAGAMENTO(

);