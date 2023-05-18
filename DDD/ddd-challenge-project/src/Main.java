import java.awt.Color;

import models.Bicicleta;
import models.Endereco;
import models.Peca;
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
            Endereco enderecojoao = new Endereco("Rua das Flores", 223, "Floranópolis", "SC");
                joao.setEndereco(enderecojoao);
            joao.setIdade(36);
            joao.setGenero("Masculino");
            Bicicleta bicicleta1Joao = new Bicicleta(joao);
                bicicleta1Joao.setAnoFabricacao(2019);
                bicicleta1Joao.setTipo("Montain Bike");
                bicicleta1Joao.setCor(Color.BLACK);
                bicicleta1Joao.setNumeroSerie(46416);
                Reparos reparo1Bicicleta1Joao = new Reparos(bicicleta1Joao);
                    reparo1Bicicleta1Joao.setData("04/11/2021");
                    reparo1Bicicleta1Joao.setTipo("Troca de freios");
                    Peca peca1Reparo1Bicicleta1Joao = new Peca("Freio dianteiro");
                    Peca peca2Reparo1Bicicleta1Joao = new Peca("Freio traseiro");
                    reparo1Bicicleta1Joao.setObservacoes("Foi colocado um freio de outra marca");
                    reparo1Bicicleta1Joao.setCustoReparo(320);
            Bicicleta bicicleta2Joao = new Bicicleta(joao);
            Bicicleta bicicleta3Joao = new Bicicleta(joao);
                joao.adicionaBicicletaConta(bicicleta1Joao);
                joao.adicionaBicicletaConta(bicicleta2Joao);
                joao.adicionaBicicletaConta(bicicleta3Joao);
                joao.removeBicicletaConta(bicicleta2Joao);
        joao.mostraInfoConta();

        Seguro seguroJoao = new Seguro(joao);
        seguroJoao.adicionaBicicletaSeguro(bicicleta1Joao);
        seguroJoao.mostraInfoSeguro();
    }
}
