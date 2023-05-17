package models;

public class Avaliacao {
    
    //attributes
    private String avaliacao;
    private boolean necessitaReparo;

    //getters and setters
    public String getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }
    public boolean isNecessitaReparo() {
        return necessitaReparo;
    }
    public void setNecessitaReparo(boolean necessitaReparo) {
        this.necessitaReparo = necessitaReparo;
    }

    
}
