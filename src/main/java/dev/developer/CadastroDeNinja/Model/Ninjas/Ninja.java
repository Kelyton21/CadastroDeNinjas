package dev.developer.CadastroDeNinja.Model.Ninjas;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table(name = "tb_ninja")
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;
    private String email;

    public Ninja(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }
}
