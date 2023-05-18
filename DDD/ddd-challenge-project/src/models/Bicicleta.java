package models;

import java.time.LocalDate;
import java.util.List;
import java.awt.Color;

public class Bicicleta {
    
    //attributes
    private static int numeroBicicletas;
    private int id;
    private Usuario donoBicicleta;
    private int anoFabricacao;
    private String tipo;
    private Color cor;
    private int numeroSerie;
    private List<Reparos> reparos;

    //constructors
    public Bicicleta(Usuario usuario) {
        Bicicleta.numeroBicicletas += 1;
        this.id = Bicicleta.numeroBicicletas;
        this.donoBicicleta = usuario;
    }

    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int i) {
        this.anoFabricacao = i;
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
    public List<Reparos> getReparos() {
        return reparos;
    }
    public void setReparos(List<Reparos> reparos) {
        this.reparos = reparos;
    }
    public Usuario getDonoBicicleta() {
        return donoBicicleta;
    }
    public void setDonoBicicleta(Usuario donoBicicleta) {
        this.donoBicicleta = donoBicicleta;
    }
    

}
