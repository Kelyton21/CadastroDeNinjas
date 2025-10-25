package dev.developer.CadastroDeNinja.Model.Ninjas;

import dev.developer.CadastroDeNinja.Model.Missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "tb_ninja")
@EqualsAndHashCode(of = "id")
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private Integer idade;
    @Column(unique = true)
    private String email;
    @JoinColumn(name = "id_missao")
    @ManyToOne
    private MissaoModel missao;
    private String rank;

    public NinjaModel(Long id, String nome, int idade, String email, MissaoModel missao,String rank) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        this.missao = missao;
        this.rank = rank;
    }

    public NinjaModel() {
    }

}

