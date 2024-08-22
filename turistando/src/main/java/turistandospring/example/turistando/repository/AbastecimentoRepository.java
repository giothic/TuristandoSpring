package turistandospring.example.turistando.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import turistandospring.example.turistando.model.AbastecimentoModel;

public interface AbastecimentoRepository extends JpaRepository<AbastecimentoModel, Long> {

    boolean existsById(Long id);
}
