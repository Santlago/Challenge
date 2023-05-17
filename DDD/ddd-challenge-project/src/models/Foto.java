package models;

import java.time.LocalDate;

import enums.Resolucao;

public class Foto {
    
    //attributes
    private LocalDate data;
    private int quantidade;
    private Resolucao resolucao;

    //getters and setters
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Resolucao getResolucao() {
        return resolucao;
    }
    public void setResolucao(Resolucao resolucao) {
        this.resolucao = resolucao;
    }

    
}
