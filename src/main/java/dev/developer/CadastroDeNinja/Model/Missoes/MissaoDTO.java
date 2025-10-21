package dev.developer.CadastroDeNinja.Model.Missoes;

import dev.developer.CadastroDeNinja.Model.Missoes.enums.Dificuldade;
import dev.developer.CadastroDeNinja.Model.Missoes.enums.Status;

public record MissaoDTO(
        Long id,
        String nome,
        Dificuldade dificuldade,
        Status status,
        String descricao
) {}