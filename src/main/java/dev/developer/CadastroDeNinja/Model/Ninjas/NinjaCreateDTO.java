package dev.developer.CadastroDeNinja.Model.Ninjas;

import dev.developer.CadastroDeNinja.Model.Missoes.MissaoDTO;

public record NinjaCreateDTO(String nome, Integer idade, String email, Long idmissao, String rank) {
}
