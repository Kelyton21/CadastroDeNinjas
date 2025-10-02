package dev.developer.CadastroDeNinja.Service;

import dev.developer.CadastroDeNinja.Model.Missoes.MissaoModel;
import dev.developer.CadastroDeNinja.Model.Ninjas.NinjaModel;
import dev.developer.CadastroDeNinja.Model.Ninjas.NinjaDTO;
import dev.developer.CadastroDeNinja.Repository.MissaoRepository;
import dev.developer.CadastroDeNinja.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {
    NinjaRepository ninjaRepository;
    MissaoRepository missaoRepository;

    public NinjaService(NinjaRepository ninjaRepository, MissaoRepository missaoRepository) {
        this.ninjaRepository = ninjaRepository;
        this.missaoRepository = missaoRepository;
    }

    public List<NinjaModel> listarNinja(){
        return ninjaRepository.findAll();
    }

    public NinjaModel listaNinjaId(Long id){
        var ninja = ninjaRepository.findById(id);
        return ninja.orElse(null);
    }
    public Long criarNinja(NinjaDTO ninja){
        MissaoModel missao = missaoRepository.findById(ninja.missao().id()).orElse(null);
        NinjaModel entity = new NinjaModel(null,ninja.nome(),ninja.idade(),ninja.email(),missao);
        ninjaRepository.save(entity);
        return entity.getId();
    }
}
