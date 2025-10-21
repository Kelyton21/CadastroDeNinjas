package dev.developer.CadastroDeNinja.Model.Ninjas;

import dev.developer.CadastroDeNinja.Model.Missoes.MissaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NinjaMapper {

    @Autowired
    MissaoMapper missaoMapper;
    public NinjaModel map(NinjaDTO ninjaDTO){
        NinjaModel ninjaModel = new NinjaModel();
        ninjaModel.setNome(ninjaDTO.nome());
        ninjaModel.setEmail(ninjaModel.getEmail());
        ninjaModel.setRank(ninjaModel.getRank());
        ninjaModel.setMissao(missaoMapper.toEntity(ninjaDTO.missao()));
        ninjaModel.setIdade(ninjaModel.getIdade());
        return ninjaModel;
    }
    public NinjaDTO map(NinjaModel ninjaModel){
        return new NinjaDTO(
        ninjaModel.getNome(),
        ninjaModel.getIdade(),
        ninjaModel.getEmail(),
        missaoMapper.toDTO(ninjaModel.getMissao()),
        ninjaModel.getRank());
    }
}
