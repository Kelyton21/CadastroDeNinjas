package dev.developer.CadastroDeNinja.Controller;

import dev.developer.CadastroDeNinja.Model.Ninjas.NinjaCreateDTO;
import dev.developer.CadastroDeNinja.Model.Ninjas.NinjaDTO;
import dev.developer.CadastroDeNinja.Model.Ninjas.NinjaModel;
import dev.developer.CadastroDeNinja.Service.NinjaService;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/ninjas")
public class NinjaController {
    NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

    @GetMapping
    public List<NinjaModel> listarNinja(){
        return ninjaService.listarNinja();
    }

    @GetMapping("/{id}")
    public NinjaModel listarNinjaId(@PathVariable Long id){
        return ninjaService.listaNinjaId(id);
    }
    @PostMapping
    public Long criarNinja(@RequestBody NinjaCreateDTO ninjaDTO){
        Long ninjaId = ninjaService.criarNinja(ninjaDTO);
        return ninjaId;
    }
    @PutMapping("/{id}")
    public NinjaDTO atualizarNinja(@PathVariable Long id,@RequestBody NinjaDTO ninjaAtualizado){
        return  ninjaService.atualizarNinja(id,ninjaAtualizado);
    }
}
