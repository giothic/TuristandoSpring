package turistandospring.example.turistando.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import turistandospring.example.turistando.Enum.CombustivelEnum;

@Entity
public class VeiculoModel {
   @Id
   private String placa;
   private String marca;
   private String modelo;
   private int anoModelo;
   private int anoFabricacao;
   private String cor;
   private long renavam;
   private double motorizacao;
   private double capacidadeTanque;
   private CombustivelEnum combustivel;

   public VeiculoModel() {
   }

   public String getPlaca() {
      return this.placa;
   }

   public void setPlaca(String placa) {
      this.placa = placa;
   }

   public String getMarca() {
      return this.marca;
   }

   public void setMarca(String marca) {
      this.marca = marca;
   }

   public String getModelo() {
      return this.modelo;
   }

   public void setModelo(String modelo) {
      this.modelo = modelo;
   }

   public int getAnoModelo() {
      return this.anoModelo;
   }

   public void setAnoModelo(int anoModelo) {
      this.anoModelo = anoModelo;
   }

   public int getAnoFabricacao() {
      return this.anoFabricacao;
   }

   public void setAnoFabricacao(int anoFabricacao) {
      this.anoFabricacao = anoFabricacao;
   }

   public String getCor() {
      return this.cor;
   }

   public void setCor(String cor) {
      this.cor = cor;
   }

   public long getRenavam() {
      return this.renavam;
   }

   public void setRenavam(long renavam) {
      this.renavam = renavam;
   }

   public double getMotorizacao() {
      return this.motorizacao;
   }

   public void setMotorizacao(double motorizacao) {
      this.motorizacao = motorizacao;
   }

   public double getCapacidadeTanque() {
      return this.capacidadeTanque;
   }

   public void setCapacidadeTanque(double capacidadeTanque) {
      this.capacidadeTanque = capacidadeTanque;
   }

   public CombustivelEnum getCombustivel() {
      return this.combustivel;
   }

   public void setCombustivel(CombustivelEnum combustivel) {
      this.combustivel = combustivel;
   }
}

