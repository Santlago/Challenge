package models;

import java.util.ArrayList;
import java.util.List;

public class Reparos {
    
    // attributes
    private String data;
    private String tipo;
    private List<Peca> pecas;
    private String observacoes;
    private double custoReparo;

    // constructors
    public Reparos(Bicicleta bicicleta) {
        this.pecas = new ArrayList<>();
    }

    // methods
    public void mostraInfoReparo() {
        System.out.printf("%n----------------------------------Novo Reparo----------------------------------%n");
        System.out.printf("Data: %s%n", this.getData());
        System.out.printf("Tipo: %s%n", this.getTipo());
        System.out.printf("Pecas reparadas/substituídas: %s%n", this.getPecas());
        System.out.printf("Observações: %s%n", this.getObservacoes());
        System.out.printf("Cursto do reparo: %s%n", this.getCustoReparo());
    }
    public void adicionaPecas(Peca peca) {
        this.pecas.add(peca);
    }

    // getters and setters
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
