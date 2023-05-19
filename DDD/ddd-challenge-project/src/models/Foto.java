package models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import enums.Resolucao;

public class Foto {
    
    // attributes
    private static int quantidadeFotos;
    private int id;
    private Usuario usuario;
    private Bicicleta bicicleta;
    private LocalDateTime data;
    private Resolucao resolucao;

    // constructors
    public Foto(Usuario usuario, Bicicleta bicicleta, Resolucao resolucao) {
        Foto.quantidadeFotos += 1;
        this.id = Foto.quantidadeFotos;
        this.usuario = usuario;
        this.bicicleta = bicicleta;
        this.data = LocalDateTime.now();
        this.resolucao = resolucao;
    }

    // methods
    public void mostraInfoFoto() {
        System.out.printf("%n----------------------------------Foto----------------------------------%n");
        System.out.printf("Usuario: %s%n", this.usuario.getNome());
        System.out.printf("Bicicleta: %s%n", this.bicicleta.getId());
        System.out.printf("Horário que foi tirada: %s%n", this.data);
        System.out.printf("Resolução: %s%n", this.resolucao);
    }

    // getters and setters
    public LocalDateTime getData() {
        return data;
    }
    public Resolucao getResolucao() {
        return resolucao;
    }
    public void setResolucao(Resolucao resolucao) {
        this.resolucao = resolucao;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    
}
