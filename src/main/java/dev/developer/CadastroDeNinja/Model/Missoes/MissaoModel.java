package dev.developer.CadastroDeNinja.Model.Missoes;

import dev.developer.CadastroDeNinja.Model.Missoes.enums.Dificuldade;
import dev.developer.CadastroDeNinja.Model.Missoes.enums.Status;
import dev.developer.CadastroDeNinja.Model.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
@NoArgsConstructor
@Entity
@Data
@Getter
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
    @OneToMany(mappedBy = "missao")
    Set<NinjaModel> ninjaModels = new HashSet<>();


    public MissaoModel(String nome, Dificuldade dificuldade, Status status, String descricao) {
        this.nome = nome;
        this.dificuldade = dificuldade;
        this.status = status;
        this.descricao = descricao;
    }
}
