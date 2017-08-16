USE stockers;

CREATE USER IF NOT EXISTS 'admSistema'@'localhost' IDENTIFIED BY 'senha123';
CREATE USER IF NOT EXISTS 'lojaSistema'@'localhost' IDENTIFIED BY 'senha123';

GRANT ALL ON stockers.* TO 'admSistema'@'localhost';

GRANT SELECT ON stockers.produto TO 'lojaSistema'@'localhost';
GRANT INSERT, UPDATE ON stockers.loja TO 'lojaSistema'@'localhost';
GRANT SELECT, INSERT, UPDATE, DELETE ON stockers.pedido TO 'lojaSistema'@'localhost';
GRANT SELECT, INSERT, UPDATE, DELETE ON stockers.pagamento TO 'lojaSistema'@'localhost';
GRANT SELECT, INSERT, UPDATE, DELETE ON stockers.item_produto TO 'lojaSistema'@'localhost';