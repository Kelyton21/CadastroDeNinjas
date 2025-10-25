package dev.developer.CadastroDeNinja.Service;

import dev.developer.CadastroDeNinja.Model.Missoes.MissaoModel;
import dev.developer.CadastroDeNinja.Model.Ninjas.NinjaCreateDTO;
import dev.developer.CadastroDeNinja.Model.Ninjas.NinjaMapper;
import dev.developer.CadastroDeNinja.Model.Ninjas.NinjaModel;
import dev.developer.CadastroDeNinja.Model.Ninjas.NinjaDTO;
import dev.developer.CadastroDeNinja.Repository.MissaoRepository;
import dev.developer.CadastroDeNinja.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {
    NinjaRepository ninjaRepository;
    MissaoRepository missaoRepository;
    NinjaMapper ninjaMapper;

    public NinjaService(NinjaRepository ninjaRepository, MissaoRepository missaoRepository,NinjaMapper ninjaMapper) {
        this.ninjaRepository = ninjaRepository;
        this.missaoRepository = missaoRepository;
        this.ninjaMapper = ninjaMapper;
    }

    public List<NinjaModel> listarNinja(){
        return ninjaRepository.findAll();
    }

    public NinjaModel listaNinjaId(Long id){
        var ninja = ninjaRepository.findById(id);
        return ninja.orElse(null);
    }
    public Long criarNinja(NinjaCreateDTO ninja){
        MissaoModel missao = missaoRepository.findById(ninja.idmissao()).orElse(null);
        NinjaModel entity = new NinjaModel(null,ninja.nome(),ninja.idade(),ninja.email(),missao,ninja.rank());
        ninjaRepository.save(entity);
        return entity.getId();
    }
    public NinjaDTO atualizarNinja(Long id,NinjaDTO ninjaDTO) {
        Optional<NinjaModel> ninjaExistente = ninjaRepository.findById(id);
        if (ninjaExistente.isPresent()) {
            NinjaModel ninjaAtualizado = ninjaExistente.get();
            if (ninjaDTO.nome() != null)
                ninjaAtualizado.setNome(ninjaDTO.nome());

            if (ninjaDTO.idade() != null) {
                ninjaAtualizado.setIdade(ninjaDTO.idade());
            }
            if (ninjaDTO.email() != null) {
                ninjaAtualizado.setEmail(ninjaDTO.email());
            }
            if (ninjaDTO.rank() != null) {
                ninjaAtualizado.setRank(ninjaDTO.rank());
            }
            if (ninjaDTO.missao() != null && ninjaDTO.missao().id() != null) {
                MissaoModel missao = missaoRepository.findById(ninjaDTO.missao().id()).orElse(null);
                ninjaAtualizado.setMissao(missao);
            }
            return ninjaMapper.map(ninjaAtualizado);
        }
        return null;
    }
}
