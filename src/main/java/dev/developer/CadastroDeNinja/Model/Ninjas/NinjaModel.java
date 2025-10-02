package dev.developer.CadastroDeNinja.Model.Ninjas;

import dev.developer.CadastroDeNinja.Model.Missoes.MissaoModel;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "tb_ninja")
@AllArgsConstructor
@Setter
@NoArgsConstructor
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

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    public MissaoModel getMissao() {
        return missao;
    }
}
