package models;

import java.util.List;

import enums.Status;

public class Seguro {
    
    //attributes
    private static int numeroSegurosAbertos;
    private int id;
    private Usuario usuario;
    private List<Bicicleta> bicicleta;
    private String plano;
    private Status status;

    //constructors
    public Seguro(Usuario usuario) {
        id = Seguro.numeroSegurosAbertos + 1;
        this.usuario = usuario;
    }

    //getters and setters
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public List<Bicicleta> getBicicleta() {
        return bicicleta;
    }
    public void setBicicleta(List<Bicicleta> bicicleta) {
        this.bicicleta = bicicleta;
    }
    public String getPlano() {
        return plano;
    }
    public void setPlano(String plano) {
        this.plano = plano;
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
