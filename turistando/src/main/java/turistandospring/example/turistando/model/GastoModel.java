package turistandospring.example.turistando.model;


import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import turistandospring.example.turistando.Enum.TipoGasto;

import java.time.LocalDate;

@Entity
public class GastoModel {
   @Id
   @GeneratedValue(
      strategy = GenerationType.IDENTITY
   )
   private Long id;
   @Enumerated(EnumType.STRING)
   private TipoGasto tipoGasto;
   private String descricao;
   private double valor;
   private LocalDate data;

   public GastoModel() {
   }

   public GastoModel(TipoGasto tipoGasto, String descricao, double valor, LocalDate data) {
      this.tipoGasto = tipoGasto;
      this.descricao = descricao;
      this.valor = valor;
      this.data = data;
   }

   public Long getId() {
      return this.id;
   }

   public String getDescricao() {
      return this.descricao;
   }

   public double getValor() {
      return this.valor;
   }

   public LocalDate getData() {
      return this.data;
   }

   public void setData(LocalDate data) {
      this.data = data;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public void setValor(double valor) {
      this.valor = valor;
   }

   public TipoGasto getTipoGasto() {
      return this.tipoGasto;
   }

   public void setTipoGasto(TipoGasto tipoGasto) {
      this.tipoGasto = tipoGasto;
   }

   public String toString() {
      return String.format("%s: %s - R$ %.2f em %s", this.tipoGasto, this.descricao, this.valor, this.data);
   }
}
