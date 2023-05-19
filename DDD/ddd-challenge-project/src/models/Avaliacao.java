package models;

import enums.Status;

public class Avaliacao {
    
    // attributes
    private String avaliacao;
    private Seguro seguro;
    private boolean necessitaReparo;

    // constructors
    public Avaliacao(Seguro seguro) {
        this.seguro = seguro;
    }

    // methods
    public void mostraInfoAvaliacao() {
        System.out.printf("%n----------------------------------Avaliação----------------------------------%n");
        System.out.printf("Avaliação: %s%n", this.getAvaliacao());
        System.out.printf("Necessita de reparo: %b%n", this.getNecessitaReparo());
    }

    // getters and setters
    public String getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(String avaliacao) {
        if (this.seguro.getStatus() == Status.ATIVO) {
            this.avaliacao = avaliacao;
        } else {
            this.avaliacao = "Seugro inativo";
        }
    }
    public boolean getNecessitaReparo() {
        return necessitaReparo;
    }
    public void setNecessitaReparo(boolean necessitaReparo) {
        this.necessitaReparo = necessitaReparo;
    }

    
}
