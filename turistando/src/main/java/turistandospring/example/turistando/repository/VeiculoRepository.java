package turistandospring.example.turistando.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import turistandospring.example.turistando.model.VeiculoModel;

public interface VeiculoRepository extends JpaRepository<VeiculoModel, String> {
}
