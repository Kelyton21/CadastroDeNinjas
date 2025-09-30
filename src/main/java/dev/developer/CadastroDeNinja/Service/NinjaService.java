package dev.developer.CadastroDeNinja.Service;

import dev.developer.CadastroDeNinja.Model.Ninjas.NinjaModel;
import dev.developer.CadastroDeNinja.Repository.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {
    NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    public List<NinjaModel> listarNinja(){
        return ninjaRepository.findAll();
    }
}
