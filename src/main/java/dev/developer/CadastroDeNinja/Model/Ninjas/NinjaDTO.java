package dev.developer.CadastroDeNinja.Model.Ninjas;

import dev.developer.CadastroDeNinja.Model.Missoes.MissaoIdDTO;

public record NinjaDTO(String nome, int idade, String email, MissaoIdDTO missao) {
}
