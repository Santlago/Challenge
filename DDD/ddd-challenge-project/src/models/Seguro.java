package models;

import java.util.ArrayList;
import java.util.List;

import enums.Plano;
import enums.Status;

public class Seguro {
    
    //attributes
    private static int numeroSegurosAbertos;
    private int id;
    private Usuario usuario;
    private List<Bicicleta> bicicletas;
    private List<Plano> planos;
    private Status status;

    //constructors
    public Seguro(Usuario usuario) {
        id = Seguro.numeroSegurosAbertos + 1;
        this.usuario = usuario;
        bicicletas = new ArrayList<>();
    }

    //methods
    public void mostraInfoSeguro() {
        System.out.printf(
            "ID: %d%n" +
            "Dono do seguro: %s%n" +
            "Bicicletas seguradas: %s%n" +
            "Tipo de plano: %s%n" +
            "Status do plano: %s%n",
            this.getId(),
            this.getUsuario().getNome(),
            this.getBicicleta().size(),
            this.getPlanos(),
            this.getStatus()
        );
    }

    public void adicionaBicicletaSeguro(Bicicleta bicicleta) {
        this.bicicletas.add(bicicleta);
    }
    public void removeBicicletaSeguro(Bicicleta bicicleta) {
        this.bicicletas.remove(this.bicicletas.indexOf(bicicleta));
    }

    //getters and setters
    public Usuario getUsuario() {
        return usuario;
    }
    public List<Plano> getPlanos() {
        return planos;
    }
    public void setPlanos(List<Plano> planos) {
        this.planos = planos;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public List<Bicicleta> getBicicleta() {
        return this.bicicletas;
    }
    public void setBicicleta(List<Bicicleta> bicicleta) {
        this.bicicletas = bicicleta;
    }
    public Status getStatus() {
        return status;
    }
    public void setStatus(Status status) {
        this.status = status;
    }
    public static int getNumeroSegurosAbertos() {
        return numeroSegurosAbertos;
    }
    public int getId() {
        return id;
    }
}
