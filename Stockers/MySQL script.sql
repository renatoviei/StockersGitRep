CREATE SCHEMA IF NOT EXISTS stockers;
USE stockers;

DROP TABLE IF EXISTS ADM;
CREATE TABLE ADM(
	login varchar(20),
	senha varchar(20) not null,
	primary key (login)
);

DROP TABLE IF EXISTS PRODUTO;
CREATE TABLE PRODUTO(
	nome varchar(20) not null,
	preco numeric(6,2) not null,
	codigo varchar(30),
	informacoes varchar(50) not null,
	categoria varchar(20),
	cor varchar(20),
	tamanho varchar(10),
	primary key (codigo)
);

DROP TABLE IF EXISTS LOJA;
CREATE TABLE LOJA(
	nomeResponsavel varchar(20) not null,
    telefoneEmpresa int(11) not null,
    rua varchar(20) not null,
    cidade varchar(20) not null,
    estado varchar(20) not null,
    pais varchar(20) not null,
    cep varchar(11) not null,
    cnpj varchar(11) not null,
    razaoSocial varchar(20) not null,
    email varchar(40),
    nomeEmpresa varchar(20) not null,
    senha varchar(20) not null,
    primary key (email)
);

DROP TABLE IF EXISTS PAGAMENTO;
CREATE TABLE PAGAMENTO(
	codigo varchar(30),
    status_pag enum('PAGO','NÃO PAGO') not null,
    vencimento date default null,
    valor numeric(6,2) not null,
    primary key (codigo)
);

DROP TABLE IF EXISTS PEDIDOS;
CREATE TABLE PEDIDOS(
	id int(11),
    valor numeric(6,2) not null,
    observacao varchar(50),
    emailLoja varchar(20) not null,
    codPag varchar(30) not null,
    primary key (id),
    constraint FK_PED_LOJA foreign key (emailLoja) references LOJA(email),
    constraint FK_PED_PAG foreign key (codPag) references PAGAMENTO(codigo)
);

DROP TABLE IF EXISTS ITEM_PRODUTO;
CREATE TABLE ITEM_PRODUTO(
	id int(11),
    codigoProd varchar(30),
    quantidade int(11) not null,
    primary key (id,codigoProd),
    constraint FK_ITEMP_PED foreign key (id) references PEDIDOS(id),
    constraint FK_ITEMP_PROD foreign key (codigoProd) references PRODUTO(codigo)
);
