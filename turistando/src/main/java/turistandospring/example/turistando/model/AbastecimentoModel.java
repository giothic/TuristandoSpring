package turistandospring.example.turistando.model;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import turistandospring.example.turistando.Enum.CombustivelEnum;

@Entity
public class AbastecimentoModel {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id;
   private int quilometragem;
   private double valor;
   private double quantidade;
   @Enumerated(EnumType.STRING)
   private CombustivelEnum combustivelEnum;
   @ManyToOne
   @JoinColumn(
      name = "veiculo_id"
   )
   private VeiculoModel veiculo;

   public AbastecimentoModel() {
   }

   public AbastecimentoModel(int quilometragem, double valor, double quantidade, CombustivelEnum combustivelEnum) {
      this.quilometragem = quilometragem;
      this.valor = valor;
      this.quantidade = quantidade;
      this.combustivelEnum = combustivelEnum;
   }

   public Long getId() {
      return this.id;
   }

   public int getQuilometragem() {
      return this.quilometragem;
   }

   public void setQuilometragem(int quilometragem) {
      this.quilometragem = quilometragem;
   }

   public double getValor() {
      return this.valor;
   }

   public void setValor(double valor) {
      this.valor = valor;
   }

   public double getQuantidade() {
      return this.quantidade;
   }

   public void setQuantidade(double quantidade) {
      this.quantidade = quantidade;
   }

   public String getAbastecimento() {
      return "Quilometragem: " + this.quilometragem + ", Valor: R$ " + this.valor + ", Quantidade: " + this.quantidade + " litros";
   }

   public VeiculoModel getVeiculoModel() {
      return this.veiculo;
   }

   public void setVeiculoModel(VeiculoModel veiculo) {
      this.veiculo = veiculo;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public CombustivelEnum getCombustivelEnum() {
      return this.combustivelEnum;
   }

   public void setCombustivelEnum(CombustivelEnum combustivelEnum) {
      this.combustivelEnum = combustivelEnum;
   }

   public VeiculoModel getVeiculo() {
      return this.veiculo;
   }

   public void setVeiculo(VeiculoModel veiculo) {
      this.veiculo = veiculo;
   }
}
