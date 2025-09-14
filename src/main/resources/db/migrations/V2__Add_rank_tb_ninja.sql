-- V2: Migration para adicionar rank na tabela ninja

ALTER TABLE tb_ninja
ADD COLUMN rank VARCHAR(255);