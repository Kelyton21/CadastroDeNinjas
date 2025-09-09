package dev.developer.CadastroDeNinja.Model.Ninjas;

import dev.developer.CadastroDeNinja.Model.Missoes.Missao;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "tb_ninja")
@Getter
@Setter
@EqualsAndHashCode(of = "id")
@NoArgsConstructor
@Entity
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    @Column(unique = true)
    private String email;
    @JoinColumn(name = "id_missao")
    @ManyToOne
    private Missao missao;

    public Ninja(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
    public Ninja(String nome, int idade, String email,Missao missao) {
        this(nome,idade,email);
        this.missao = missao;
    }
}
