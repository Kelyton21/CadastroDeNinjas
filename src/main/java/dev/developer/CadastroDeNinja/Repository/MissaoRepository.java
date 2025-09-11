package dev.developer.CadastroDeNinja.Repository;

import dev.developer.CadastroDeNinja.Model.Missoes.MissaoModel;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissaoRepository extends JpaRepository<MissaoModel,Long> {
}
