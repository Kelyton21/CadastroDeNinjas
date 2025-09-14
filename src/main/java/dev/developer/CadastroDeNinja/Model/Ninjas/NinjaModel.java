package dev.developer.CadastroDeNinja.Model.Ninjas;

import dev.developer.CadastroDeNinja.Model.Missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "tb_ninja")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@Entity
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    @Column(unique = true)
    private String email;
    @JoinColumn(name = "id_missao")
    @ManyToOne
    private MissaoModel missao;

    public NinjaModel() {
    }

    public NinjaModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
    public NinjaModel(String nome, int idade, String email, MissaoModel missao) {
        this(nome,idade,email);
        this.missao = missao;
    }
}
