package models;

import java.time.LocalDate;
import java.util.List;

public class Reparos {
    
    //attributes
    private LocalDate data;
    private String tipo;
    private List<Pecas> pecas;
    private String observacoes;
    private double custoReparo;

    //getters and setters
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public List<Pecas> getPecas() {
        return pecas;
    }
    public void setPecas(List<Pecas> pecas) {
        this.pecas = pecas;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    public double getCustoReparo() {
        return custoReparo;
    }
    public void setCustoReparo(double custoReparo) {
        this.custoReparo = custoReparo;
    }

}
