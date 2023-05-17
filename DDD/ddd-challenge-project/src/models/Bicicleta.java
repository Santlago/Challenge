package models;

import java.time.LocalDate;
import java.util.List;
import java.awt.Color;

public class Bicicleta {
    
    //attributes
    private int id;
    private LocalDate anoFabricacao;
    private String tipo;
    private Color cor;
    private int numeroSerie;
    private String status;
    private List<Reparos> reparos;

    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public LocalDate getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(LocalDate anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public Color getCor() {
        return cor;
    }
    public void setCor(Color cor) {
        this.cor = cor;
    }
    public int getNumeroSerie() {
        return numeroSerie;
    }
    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public List<Reparos> getReparos() {
        return reparos;
    }
    public void setReparos(List<Reparos> reparos) {
        this.reparos = reparos;
    }

}
