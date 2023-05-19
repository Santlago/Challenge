package models;

import java.util.ArrayList;
import java.util.List;

import enums.Status;

public class SistemaVerificador {
    
    // attributes
    private String url;
    private List<Foto> fotos;

    // methods
    public SistemaVerificador(Seguro seguro) {
        seguro.setStatus(Status.ATIVO);
    }

    // getters and setters
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
}
