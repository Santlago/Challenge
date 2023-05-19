package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sinistro {
    
    // attributes
    private static int quantidadeSinistros;
    private int id;
    private Usuario usuario;
    private String tipo;
    private String descricao;
    private Bicicleta bicicleta;
    private String data;
    private List<Pessoa> pessoas;

    // constructors
    public Sinistro(Usuario usuario) {
        Sinistro.quantidadeSinistros += 1;
        this.id = Sinistro.quantidadeSinistros;
        this.usuario = usuario;
        this.pessoas = new ArrayList<>();
    }

    // methods
    public void mostraInfoSinistro() {
        System.out.printf("%n----------------------------------Sinistro----------------------------------%n");
        System.out.printf("ID: %d%n", this.getId());
        System.out.printf("Dono do seguro: %s%n", this.getUsuario().getNome());
        System.out.printf("Tipo: %s%n", this.getTipo());
        System.out.printf("Descrição: %s%n", this.getDescricao());
        System.out.printf("Bicicleta: %s%n", this.getBicicleta());
        System.out.printf("Data: %s%n", this.getData());
        System.out.printf("Pessoas envolvidas: %s%n", this.getPessoa());
    }

    public void adicionaPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }

    // getters and setters
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
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public List<Pessoa> getPessoa() {
        return pessoas;
    }
    public void setPessoa(List<Pessoa> pessoa) {
        this.pessoas = pessoa;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
