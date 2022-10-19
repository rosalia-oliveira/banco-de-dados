SELECT 
    *
FROM
    pratica.autor;
--

SELECT 
    nome, idade
FROM
    pratica.aluno;
--

SELECT 
    *
FROM
    pratica.aluno
WHERE
    carreira = 'informatica';
--

SELECT 
    *
FROM
    pratica.autor
WHERE
    nacionalidade = 'francesa'
        OR nacionalidade = 'italiana';
--

SELECT 
    COUNT(livro_id) AS quantidade
FROM
    pratica.livro
WHERE
    area = 'internet';
--

SELECT 
    *
FROM
    pratica.livro
WHERE
    editora = 'Salamandra';
--

SELECT 
    *
FROM
    pratica.aluno
WHERE
    idade > (SELECT 
            ROUND(AVG(idade), 2)
        FROM
            pratica.aluno);
--
		
SELECT 
    nome
FROM
    pratica.aluno
WHERE
    nome LIKE 'm%';
    
    -- falta a 9 aqui
    
SELECT 
    *
FROM
    pratica.autor
WHERE
    nacionalidade = 'argentina'
        OR nacionalidade = 'italiana';

-- falta a 11 aqui

SELECT 
    nome
FROM
    pratica.aluno
WHERE
    idade = (SELECT 
            MIN(idade)
        FROM
            pratica.aluno);
--

SELECT 
    al.nome
FROM
    pratica.aluno AS al
        INNER JOIN
    pratica.emprestimo AS emp ON al.aluno_id = emp.aluno_id
ORDER BY al.nome;

-- falta a 14

SELECT 
    liv.titulo
FROM
    pratica.livro AS liv
        INNER JOIN
    pratica.emprestimo AS emp ON liv.livro_id = emp.livro_id
WHERE
    YEAR(emp.data_devolucao) = 2021
        AND MONTH(emp.data_devolucao) = 09
        AND DAY(emp.data_devolucao) <= 23;