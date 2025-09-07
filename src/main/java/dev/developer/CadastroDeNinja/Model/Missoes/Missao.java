package dev.developer.CadastroDeNinja.Model.Missoes;

import dev.developer.CadastroDeNinja.Model.Missoes.enums.Dificuldade;
import dev.developer.CadastroDeNinja.Model.Missoes.enums.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "tb_missao")
public class Missao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Dificuldade dificuldade;
    private Status status;
    private String descricao;

    public Missao(String nome, Dificuldade dificuldade, Status status, String descricao) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.status = status;
        this.descricao = descricao;
    }

}
