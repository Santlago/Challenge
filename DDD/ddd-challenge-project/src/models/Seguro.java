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
        this.bicicletas = new ArrayList<>();
        this.planos = new ArrayList<>();
        this.status = Status.INATIVO;
    }

    //methods
    public void mostraInfoSeguro() {
        System.out.printf("%n----------------------------------Seguro----------------------------------%n");
        System.out.printf("ID: %d%n", this.getId());
        System.out.printf("Dono do seguro: %s%n", this.getUsuario().getNome());
        System.out.printf("Bicicletas seguradas: %d%n", this.getBicicleta().size());
        System.out.printf("Tipo de plano: %s%n", this.getPlanos());
        System.out.printf("Status do plano: %s%n", this.getStatus());
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
    public void adicionaPlanos(Plano plano) {
        this.planos.add(plano);
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
