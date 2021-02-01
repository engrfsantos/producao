--td01_defeito
ALTER TABLE td01_defeito RENAME TO defeito;
ALTER TABLE defeito RENAME td01_defeito_id TO id;
ALTER TABLE defeito RENAME td01_descricao TO descricao;
ALTER TABLE defeito RENAME td01_ean TO ean_id;
ALTER TABLE defeito RENAME td01_grupo TO grupo_id;

--td01_identificador
ALTER TABLE td01_identificador RENAME TO posto;
ALTER TABLE posto RENAME td01_id TO id;
ALTER TABLE posto RENAME td01_desc_breve TO desc_breve;
ALTER TABLE posto RENAME td01_descricao TO descricao;
ALTER TABLE posto RENAME td01_status TO condicao_id;
ALTER TABLE posto RENAME td01_local TO setor_id;
ALTER TABLE posto RENAME td01_reparo TO reparo;

--td01_prod_defeito
ALTER TABLE td01_prod_defeito RENAME TO prod_defeito;
ALTER TABLE prod_defeito RENAME td01_prod_defeito_id TO id;
ALTER TABLE prod_defeito RENAME td01_analise TO analise;
ALTER TABLE prod_defeito RENAME td01_reparo TO reparo;
ALTER TABLE prod_defeito RENAME td01_status TO condicao_id;
ALTER TABLE prod_defeito RENAME td01_dt TO dt;
ALTER TABLE prod_defeito RENAME td01_hr TO hr;
ALTER TABLE prod_defeito RENAME td01_serie TO serie;
ALTER TABLE prod_defeito RENAME td01_producao_id TO producao_id;
ALTER TABLE prod_defeito RENAME td01_defeito_id TO defeito_id;


--td01_producao
ALTER TABLE td01_producao RENAME TO producao;
ALTER TABLE producao RENAME td01_producao_id TO id;
ALTER TABLE producao RENAME td01_leitura TO leitura;
ALTER TABLE producao RENAME td01_cod_produto TO produto_id;
ALTER TABLE producao RENAME td01_descricao TO descricao;
ALTER TABLE producao RENAME td01_status TO condicao_id;
ALTER TABLE producao RENAME td01_id TO posto_id;
ALTER TABLE producao RENAME td01_dt TO dt;
ALTER TABLE producao RENAME td01_hr TO hr;
ALTER TABLE producao RENAME td01_serie TO serie;
ALTER TABLE producao RENAME td01_re TO usuario_id;
ALTER TABLE producao RENAME td01_local TO setor_id;


--td01_grupo
ALTER TABLE ts01_grupo RENAME TO grupo;
ALTER TABLE grupo RENAME ts01_grupo TO id;
ALTER TABLE grupo RENAME ts01_descgrupo TO descricao;
ALTER TABLE grupo RENAME ts01_descbrevgrupo TO desc_breve;

--td01_local
ALTER TABLE ts01_local RENAME TO setor;
ALTER TABLE setor RENAME ts01_desc TO id;
ALTER TABLE setor ADD COLUMN descricao character;

--td01_produto
ALTER TABLE ts01_produto RENAME TO produto;
ALTER TABLE produto RENAME ts01_codigo TO id;
ALTER TABLE produto RENAME ts01_descricao TO descricao;
ALTER TABLE produto RENAME ts01_narrativa TO narrativa;
ALTER TABLE produto RENAME ts01_unidade TO unidade;
ALTER TABLE produto RENAME ts01_desc_esp TO desc_esp;
ALTER TABLE produto RENAME ts01_grupo TO grupo_id;
ALTER TABLE produto RENAME ts01_cod_barras TO ean;

--td01_produto_ean
ALTER TABLE ts01_produto_ean RENAME TO produto_ean;
ALTER TABLE produto_ean RENAME ean TO id;
ALTER TABLE produto_ean RENAME cod_produto TO produto_id;

--ts01_status
ALTER TABLE ts01_status RENAME TO condicao;
ALTER TABLE condicao RENAME ts01_status TO id;
ALTER TABLE condicao RENAME ts01_desc_breve TO desc_breve;
ALTER TABLE condicao RENAME ts01_descricao TO descricao;

--td01_tabelas
ALTER TABLE ts01_tabelas RENAME TO tabelas;
ALTER TABLE tabelas RENAME ts01_tabela TO id;
ALTER TABLE tabelas RENAME ts01_tipo TO tipo;

--td01_usuario
ALTER TABLE ts01_usuario RENAME TO usuario;
ALTER TABLE usuario RENAME re TO idd;
ALTER TABLE usuario RENAME status TO condicao_id;
ALTER TABLE usuario RENAME local TO setor_id;







