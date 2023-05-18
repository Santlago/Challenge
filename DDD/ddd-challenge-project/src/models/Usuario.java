package models;

import java.util.ArrayList;
import java.util.List;

public class Usuario extends Pessoa{
    
    //attributes
    private static int numeroContasAbertas;
    private int id;
    private String login;
    private int senha;
    private int quantidadeBicicletas;
    private List<Bicicleta> bicicletas;

    //constructors
    public Usuario(String login, int senha) {
        Usuario.numeroContasAbertas += 1;
        this.setEndereco(null);
        this.id = Usuario.numeroContasAbertas;
        this.login = login;
        this.senha = senha;
        bicicletas = new ArrayList<>();
    }

    //methods    
    public void mostraInfoConta() {
        System.out.printf("%n----------------------------------Conta----------------------------------%n");
        System.out.printf("ID: %d%n", this.getId());
        System.out.printf("Login: %s%n", this.getLogin());
        System.out.printf("Quantidade de Bicicletas: %d%n", this.getBicicletas().size());
        System.out.printf("Nome: %s%n", this.getNome());
        System.out.printf("Email: %s%n", this.getEmail());
        System.out.printf("Telefone: %s%n", this.getTelefone());
        System.out.println("Endereco:");
        System.out.printf("   Rua: %s%n", this.getEndereco().getRua());
        System.out.printf("   Numero: %d%n", this.getEndereco().getNumero());
        System.out.printf("   Cidade: %s%n", this.getEndereco().getCidade());
        System.out.printf("   Estado: %s%n", this.getEndereco().getEstado());
        System.out.printf("Idade: %d%n", this.getIdade());
        System.out.printf("Genero: %s%n", this.getGenero());
    }

    public void adicionaBicicletaConta(Bicicleta bicicleta) {
        this.bicicletas.add(bicicleta);
    }
    public void removeBicicletaConta(Bicicleta bicicleta) {
        this.bicicletas.remove(this.bicicletas.indexOf(bicicleta));
    }

    //getters and setters
    public static int getNumeroContasAbertas() {
        return numeroContasAbertas;
    }
    public int getId() {
        return id;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public List<Bicicleta> getBicicletas() {
        return bicicletas;
    }
    
}
