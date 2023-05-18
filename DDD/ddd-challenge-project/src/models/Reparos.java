package models;

import java.util.List;

public class Reparos {
    
    //attributes
    private Bicicleta bicicleta;
    private String data;
    private String tipo;
    private List<Peca> pecas;
    private String observacoes;
    private double custoReparo;

    //constructors
    public Reparos(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    //getters and setters
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public List<Peca> getPecas() {
        return pecas;
    }
    public void setPecas(List<Peca> pecas) {
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
