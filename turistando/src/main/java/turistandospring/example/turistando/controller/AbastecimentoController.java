package turistandospring.example.turistando.controller;

import turistandospring.example.turistando.model.AbastecimentoModel;
import turistandospring.example.turistando.repository.AbastecimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/abastecimento")
public class AbastecimentoController {

   @Autowired
   private AbastecimentoRepository abastecimentoRepository;

   @PostMapping("/cadastrar")
   public ResponseEntity<AbastecimentoModel> cadastrarAbastecimento(@RequestBody AbastecimentoModel abastecimento) {
      AbastecimentoModel savedAbastecimento = abastecimentoRepository.save(abastecimento);
      return new ResponseEntity<>(savedAbastecimento, HttpStatus.CREATED);
   }

   @GetMapping("/listar")
   public ResponseEntity<List<AbastecimentoModel>> listarAbastecimentos() {
      List<AbastecimentoModel> abastecimentos = abastecimentoRepository.findAll();
      return new ResponseEntity<>(abastecimentos, HttpStatus.OK);
   }

   @PutMapping("/modificar/{id}")
   public ResponseEntity<AbastecimentoModel> modificarAbastecimento(@PathVariable Long id, @RequestBody AbastecimentoModel abastecimento) {
      if (abastecimentoRepository.existsById(id)) {
         abastecimento.setId(id); // Atualiza o ID do abastecimento para garantir que seja a mesma entidade
         AbastecimentoModel updatedAbastecimento = abastecimentoRepository.save(abastecimento);
         return new ResponseEntity<>(updatedAbastecimento, HttpStatus.OK);
      } else {
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
   }

   @DeleteMapping("/apagar/{id}")
   public ResponseEntity<Void> apagarAbastecimento(@PathVariable Long id) {
      if (abastecimentoRepository.existsById(id)) {
         abastecimentoRepository.deleteById(id);
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      } else {
         return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
   }
}
