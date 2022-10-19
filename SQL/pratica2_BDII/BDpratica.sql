DROP DATABASE IF EXISTS pratica;

CREATE DATABASE IF NOT EXISTS pratica;

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

CREATE TABLE IF NOT EXISTS pratica.livro (
livro_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
titulo VARCHAR(100) NOT NULL,
editora VARCHAR(100) NOT NULL,
area VARCHAR(30) NOT NULL
);

CREATE TABLE IF NOT EXISTS pratica.departamento (
depto_nro INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
nome_depto VARCHAR(30) NOT NULL,
localizacao VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS pratica.autor (
autor_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
nome VARCHAR(100) NOT NULL,
nacionalidade VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS pratica.livro_autor (
autor_id INT NOT NULL REFERENCES pratica.autor(autor_id),
livro_id INT NOT NULL REFERENCES pratica.livro(livro_id),
PRIMARY KEY(autor_id, livro_id)
);

CREATE TABLE IF NOT EXISTS pratica.aluno (
aluno_id INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
nome VARCHAR(30) NOT NULL,
sobrenome VARCHAR(100) NOT NULL,
endereco VARCHAR(100) NOT NULL,
carreira VARCHAR(30),
idade INT NOT NULL
);

CREATE TABLE IF NOT EXISTS pratica.emprestimo (
aluno_id INT NOT NULL REFERENCES pratica.aluno(aluno_id),
livro_id INT NOT NULL REFERENCES pratica.livro(livro_id),
data_emprestimo DATE NOT NULL,
data_devolucao DATE NOT NULL,
retornou BOOLEAN,
PRIMARY KEY(aluno_id, livro_id)
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

INSERT INTO pratica.livro (titulo, editora, area) VALUES
('Mulherzinhas', 'Martin Claret',  'Literatura'),
('Artemis Fowl: O menino prodígio do crime', 'Galera', 'Ação e Aventura'),
('A tenda vermelha', 'Verus', 'Romance');

INSERT INTO pratica.autor (nome, nacionalidade) VALUES
('Anita Diamant', 'Americana'),
('Eoin Colfer', 'Irlandesa'),
('Louisa May Alcott', 'Norte-Americana');

INSERT INTO pratica.livro_autor (autor_id, livro_id) VALUES
(3, 1),
(2, 2),
(1, 3);

INSERT INTO pratica.aluno (nome, sobrenome, carreira, endereco, idade) VALUES
('César', 'Piñero', 'Vendedor', 'Campinas', 39),
('Yosep', 'Kowaleski', 'Analista', 'Jundiaí', 42),
('Mariela', 'Barrios', 'Diretor', 'Osasco', 28),
('Jonathan', 'Aguilera', 'Vendedor', 'Suzano', 21),
('Daniel', 'Brezezicki', 'Vendedor', 'Santo André', 18),
('Mito', 'Barchuk', 'Presidente','Marília', 33),
('Emilio', 'Galarza', 'Desenvolvedor', 'Guarulhos', 65);

INSERT INTO pratica.emprestimo (aluno_id, livro_id, data_emprestimo, data_devolucao, retornou) VALUES
(1, 3, '2022-10-15', '2022-10-20', false),
(7, 1, '2021-09-16', '2021-09-23', true),
(4, 3, '2022-05-24', '2022-05-30', true),
(6, 3, '2022-10-02', '2022-10-16', true),
(2, 2, '2022-10-13', '2022-10-21', false),
(5, 1, '2022-04-11','2022-04-19', true),
(3, 2, '2022-10-04', '2022-10-19', true);
