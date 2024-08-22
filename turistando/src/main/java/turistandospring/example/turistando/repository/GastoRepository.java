package turistandospring.example.turistando.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import turistandospring.example.turistando.model.GastoModel;

public interface GastoRepository extends JpaRepository<GastoModel, String> {
}

