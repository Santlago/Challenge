import java.awt.Color;

import models.Bicicleta;
import models.Endereco;
import models.Reparos;
import models.Seguro;
import models.Usuario;

public class Main {
    public static void main(String[] args) throws Exception {

        Usuario teste1 = new Usuario("lgteste1", 1234);

        Usuario teste2 = new Usuario("lgteste2", 4321);

        Usuario joao = new Usuario("joaosilva456", 321231);
        joao.setNome("João da Silva");
        joao.setCpf("12312313212");
        joao.setEmail("joaodasilva@gmail.com");
        joao.setTelefone("11968424467");
        //Endereco João
        Endereco enderecojoao = new Endereco("Rua das Flores", 223, "Floranópolis", "SC");
        joao.setEndereco(enderecojoao);
        joao.setIdade(36);
        joao.setGenero("Masculino");
        //Bicicletas João
        Bicicleta bicicletaJoao1 = new Bicicleta(joao);
        bicicletaJoao1.setAnoFabricacao(2019);
        bicicletaJoao1.setTipo("Montain Bike");
        bicicletaJoao1.setCor(Color.BLACK);
        bicicletaJoao1.setNumeroSerie(46416);
        //Reparos bicicleta1 João
        Reparos reparo1BicicletaJoao1 = new Reparos(bicicletaJoao1);
        reparo1BicicletaJoao1.setData("04/11/2021");
        reparo1BicicletaJoao1.tipo
        joao.mostraInfoConta();

        Seguro segurojoao = new Seguro(joao);
        segurojoao.mostraInfoSeguro();
    }
}
