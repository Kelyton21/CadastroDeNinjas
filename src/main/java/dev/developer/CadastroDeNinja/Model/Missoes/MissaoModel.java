package dev.developer.CadastroDeNinja.Model.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.developer.CadastroDeNinja.Model.Missoes.enums.Dificuldade;
import dev.developer.CadastroDeNinja.Model.Missoes.enums.Status;
import dev.developer.CadastroDeNinja.Model.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Setter
@Table(name = "tb_missao")
public class MissaoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Dificuldade dificuldade;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Column(columnDefinition = "TEXT")
    private String descricao;
    @JsonIgnore
    @OneToMany(mappedBy = "missao")
    Set<NinjaModel> ninjaModels = new HashSet<>();

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Dificuldade getDificuldade() {
        return dificuldade;
    }

    public Status getStatus() {
        return status;
    }

    public String getDescricao() {
        return descricao;
    }

    public Set<NinjaModel> getNinjaModels() {
        return ninjaModels;
    }
}
