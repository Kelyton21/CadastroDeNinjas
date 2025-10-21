package dev.developer.CadastroDeNinja.Model.Ninjas;

import dev.developer.CadastroDeNinja.Model.Missoes.MissaoDTO;

public record NinjaDTO(String nome, int idade, String email, MissaoDTO missao,String rank) {
}
