package models;

import java.util.List;

public class Usuario extends Pessoa{
    
    //attributes
    private static int numeroContasAbertas;
    private int id;
    private String login;
    private int senha;
    private List<Bicicleta> bicicletas;

    //constructors
    public Usuario(String login, int senha) {
        Usuario.numeroContasAbertas += 1;
        this.setEndereco(null);
        this.id = Usuario.numeroContasAbertas;
        this.login = login;
        this.senha = senha;
    }

    //methods
    public void mostraInfoConta() {
        System.out.printf(
            "ID: %d%n" +
            "Login: %s%n" +
            "Bicicletas: %s%n" +
            "Nome: %s%n" +
            "Email: %s%n" +
            "Telefone: %s%n" +
            "Endereco: %n" +
            "   %s%n" +
            "   %s%n" +
            "   %s%n" +
            "   %s%n" +
            "Idade: %d%n" +
            "Genero: %s%n",
            this.getId(),
            this.getLogin(),
            this.getBicicletas(),
            this.getNome(),
            this.getEmail(),
            this.getTelefone(),
            this.getEndereco().getRua(),
            this.getEndereco().getNumero(),
            this.getEndereco().getCidade(),
            this.getEndereco().getEstado(),
            this.getIdade(),
            this.getGenero()
        );
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
