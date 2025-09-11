package dev.developer.CadastroDeNinja.Repository;

import dev.developer.CadastroDeNinja.Model.Ninjas.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel,Long> {
}
