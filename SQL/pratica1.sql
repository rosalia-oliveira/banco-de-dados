-- 1. Selecione o nome, cargo e localização dos departamentos onde os vendedores
-- trabalham.

SELECT emp.nome as nome, emp.cargo as cargo, dep.localizacao as localizacao
FROM pratica.departamento as dep 
INNER JOIN pratica.funcionario as emp
ON emp.depto_nro = dep.depto_nro
WHERE emp.cargo like 'vendedor';

-- 2. Visualize departamentos com mais de cinco funcionários.

SELECT COUNT(emp.depto_nro) as quantidade_funcionarios, dep.nome_depto as departamento
FROM pratica.funcionario as emp
INNER JOIN pratica.departamento as dep
ON emp.depto_nro = dep.depto_nro
GROUP BY dep.nome_depto
HAVING quantidade_funcionarios > 2;

-- 3. Exiba o nome, salário e nome do departamento dos funcionários que têm o mesmo
-- cargo que 'Mito Barchuk'.

SELECT emp.nome AS nome, emp.salario AS salario, dep.nome_depto AS depto
FROM pratica.funcionario AS emp
INNER JOIN pratica.funcionario AS emp2
ON emp2.nome Like 'Mito Barchuk'
INNER JOIN pratica.departamento AS dep
ON emp.depto_nro = dep.depto_nro
WHERE emp.cargo = emp2.cargo;

-- 4. Mostre os dados dos funcionários que trabalham no departamento de contabilidade,
-- ordenados por nome.

SELECT emp.*
FROM pratica.funcionario AS emp
INNER JOIN pratica.departamento AS dep
ON dep.nome_depto LIKE 'contabilidade'
WHERE emp.depto_nro = dep.depto_nro
ORDER BY emp.nome;

-- 5. Mostre o nome do funcionário que tem o menor salário.

SELECT nome
FROM pratica.funcionario
ORDER BY salario 
LIMIT 1;

-- 6. Mostre os dados do funcionário que tem o maior salário no departamento 'Vendas'.

SELECT emp.nome as nome, emp.cargo, emp.salario as salario
FROM pratica.departamento as dep 
INNER JOIN pratica.funcionario as emp
ON emp.depto_nro = dep.depto_nro
WHERE emp.cargo like 'vendedor'
ORDER BY emp.salario DESC
LIMIT 1;
