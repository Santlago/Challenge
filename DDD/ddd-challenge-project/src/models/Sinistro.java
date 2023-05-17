package models;

import java.time.LocalDate;
import java.util.List;

public class Sinistro {
    
    //attributes
    private int id;
    private String tipo;
    private String descricao;
    private Bicicleta bicicleta;
    private LocalDate data;
    private List<Pessoa> pessoa;
    private Foto foto;

    //getters and setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Bicicleta getBicicleta() {
        return bicicleta;
    }
    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }
    public LocalDate getData() {
        return data;
    }
    public void setData(LocalDate data) {
        this.data = data;
    }
    public List<Pessoa> getPessoa() {
        return pessoa;
    }
    public void setPessoa(List<Pessoa> pessoa) {
        this.pessoa = pessoa;
    }
    public Foto getFoto() {
        return foto;
    }
    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    
}
