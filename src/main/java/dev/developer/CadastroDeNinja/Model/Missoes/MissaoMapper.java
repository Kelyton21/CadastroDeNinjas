package dev.developer.CadastroDeNinja.Model.Missoes;

import org.springframework.stereotype.Component;

@Component
public class MissaoMapper {

    public MissaoDTO toDTO(MissaoModel missao) {
        if (missao == null) return null;
        return new MissaoDTO(
                missao.getId(),
                missao.getNome(),
                missao.getDificuldade(),
                missao.getStatus(),
                missao.getDescricao()
        );
    }

    public MissaoModel toEntity(MissaoDTO dto) {
        if (dto == null) return null;
        MissaoModel missao = new MissaoModel();
        missao.setId(dto.id());
        missao.setNome(dto.nome());
        missao.setDificuldade(dto.dificuldade());
        missao.setStatus(dto.status());
        missao.setDescricao(dto.descricao());
        return missao;
    }
}

