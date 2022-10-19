DROP DATABASE IF EXISTS pratica1;

CREATE DATABASE pratica;

CREATE TABLE IF NOT EXISTS pratica.funcionario (
cod_func INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
nome VARCHAR(30) NOT NULL,
sobrenome VARCHAR(100) NOT NULL,
cargo VARCHAR(30) NOT NULL,
data_alta VARCHAR(30),
salario DOUBLE NOT NULL,
comissao DOUBLE NOT NULL,
depto_nro INT NOT NULL,
CONSTRAINT
FOREIGN KEY (depto_nro) REFERENCES pratica.departamento(depto_nro)
);

CREATE TABLE IF NOT EXISTS pratica.departamento (
depto_nro INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
nome_depto VARCHAR(30) NOT NULL,
localizacao VARCHAR(50) NOT NULL
);

INSERT INTO pratica.departamento(nome_depto, localizacao) VALUES
('Software', 'Los Tigres'),
('Sistemas', 'Guadalupe'),
('Contabilidade', 'La Roca'),
('Vendas', 'Plata');

INSERT INTO pratica.funcionario (nome, sobrenome, cargo, data_alta, salario, comissao, depto_nro) VALUES
('César', 'Piñero', 'Vendedor', '12/05/2018', 80000, 15000, 4),
('Yosep', 'Kowaleski', 'Analista', '14/07/2015', 140000, 0, 2),
('Mariela', 'Barrios', 'Diretor', '05/06/2014', 185000, 0, 3),
('Jonathan', 'Aguilera', 'Vendedor', '03/06/2015', 85000, 10000, 4),
('Daniel', 'Brezezicki', 'Vendedor', '03/03/2018', 83000, 10000, 4),
('Mito', 'Barchuk', 'Presidente','05/06/2014', 190000, 0, 3),
('Emilio', 'Galarza', 'Desenvolvedor', '02/08/2014', 60000, 0, 1);
