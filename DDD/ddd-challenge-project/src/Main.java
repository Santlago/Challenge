import java.awt.Color;

import enums.Plano;
import enums.Resolucao;
import models.Avaliacao;
import models.Bicicleta;
import models.Endereco;
import models.Foto;
import models.Peca;
import models.Pessoa;
import models.Reparos;
import models.Seguro;
import models.Sinistro;
import models.SistemaVerificador;
import models.Usuario;

public class Main {
    public static void main(String[] args) throws Exception {

        // Creating users
        Usuario teste1 = new Usuario("lgteste1", 1234, "Teste1 da silva", "65498721345");
        Usuario teste2 = new Usuario("lgteste2", 4321, "Teste2 da Silva", "65473413131");

        Usuario joao = new Usuario("joaosilva456", 321231, "João da Silva", "12312313212");
        joao.setEmail("joaodasilva@gmail.com");
        joao.setTelefone("11968424467");
        Endereco enderecojoao = new Endereco("Rua das Flores", 223, "Floranópolis", "SC");
        joao.setEndereco(enderecojoao);
        joao.setIdade(36);
        joao.setGenero("Masculino");

        // Creating bicycles for João
        Bicicleta bicicleta1Joao = new Bicicleta(joao);
        bicicleta1Joao.setAnoFabricacao(2019);
        bicicleta1Joao.setTipo("Montain Bike");
        bicicleta1Joao.setCor(Color.BLACK);
        bicicleta1Joao.setNumeroSerie(46416);

        Bicicleta bicicleta2Joao = new Bicicleta(joao);
        Bicicleta bicicleta3Joao = new Bicicleta(joao);

        // Adding bicycles to João's account
        joao.adicionaBicicletaConta(bicicleta1Joao);
        joao.adicionaBicicletaConta(bicicleta2Joao);
        joao.adicionaBicicletaConta(bicicleta3Joao);
        joao.removeBicicletaConta(bicicleta2Joao);

        // Showing account information for João
        joao.mostraInfoConta();

        // Creating repairs for João's bicycle
        Reparos reparo1Bicicleta1Joao = new Reparos(bicicleta1Joao);
        reparo1Bicicleta1Joao.setData("04/11/2021");
        reparo1Bicicleta1Joao.setTipo("Troca de freios");
        Peca peca1Reparo1Bicicleta1Joao = new Peca("Freio dianteiro");
        Peca peca2Reparo1Bicicleta1Joao = new Peca("Freio traseiro");
        reparo1Bicicleta1Joao.adicionaPecas(peca1Reparo1Bicicleta1Joao);
        reparo1Bicicleta1Joao.adicionaPecas(peca2Reparo1Bicicleta1Joao);
        reparo1Bicicleta1Joao.setObservacoes("Foi colocado um freio de outra marca");
        reparo1Bicicleta1Joao.setCustoReparo(320);
        bicicleta1Joao.adicionaReparo(reparo1Bicicleta1Joao);

        // Creating insurance for João
        Seguro seguroJoao = new Seguro(joao);
        seguroJoao.adicionaBicicletaSeguro(bicicleta1Joao);
        seguroJoao.adicionaPlanos(Plano.seguroContraDanos);
        seguroJoao.adicionaPlanos(Plano.seguroContraRoubo);
        
        // Showing insurance information for João
        seguroJoao.mostraInfoSeguro();

        // Creating photo for João's bicycle
        Foto foto1Bicicleta1Joao = new Foto(joao, bicicleta1Joao, Resolucao.RESOLUCAO_1080P);
        Foto foto2Bicicleta1Joao = new Foto(joao, bicicleta1Joao, Resolucao.RESOLUCAO_720P);
        foto1Bicicleta1Joao.mostraInfoFoto();

        // Creating verify system for João's bicycle ensurance
        SistemaVerificador sistema1Foto1Bicicleta1Joao = new SistemaVerificador(seguroJoao);

        // Showing insurance information for João
        seguroJoao.mostraInfoSeguro();

        // Creating João's sinister
        Sinistro sinistroJoao = new Sinistro(joao);
        sinistroJoao.setTipo("Acidente leve");
        sinistroJoao.setDescricao("Esbarrão em outras duas bicicleta durante maratona");
        sinistroJoao.setBicicleta(bicicleta1Joao);
        sinistroJoao.setData("10/06/2021");
            // Creating João's sinister envolved people
            Pessoa maria = new Pessoa("Maria dos Santos", "26468452164");
            Pessoa carlos = new Pessoa("Carlos José", "16579811957");
        sinistroJoao.adicionaPessoa(maria);
        sinistroJoao.adicionaPessoa(carlos);
        
        // Showing João's sinister information
        sinistroJoao.mostraInfoSinistro();

        // Creating João's sinister avaliation
        Avaliacao avaliacaoSinistroJoao = new Avaliacao(seguroJoao);
        avaliacaoSinistroJoao.setAvaliacao("Acidente leve envolvendo terceiros, necessita troca de pneu");
        avaliacaoSinistroJoao.setNecessitaReparo(true);

        // Showing João's sinister avaliation information
        avaliacaoSinistroJoao.mostraInfoAvaliacao();

        // Adding new repair for João's bike
        Reparos novoReparoBicicletaJoao = new Reparos(bicicleta1Joao);
        novoReparoBicicletaJoao.setData("11/11/2021");
        novoReparoBicicletaJoao.setTipo("Troca de pneu");
        Peca peca3Joao = new Peca("Pneu");
        novoReparoBicicletaJoao.adicionaPecas(peca3Joao);
        novoReparoBicicletaJoao.setObservacoes("Pneu rasgou após acidente leve");
        novoReparoBicicletaJoao.setCustoReparo(350);

        // Showing João's bicycle repair
        novoReparoBicicletaJoao.mostraInfoReparo();

        // Adding new repair do bicycle's repair history
        bicicleta1Joao.adicionaReparo(novoReparoBicicletaJoao);

        // Showing new João's bicycle repair history
        bicicleta1Joao.mostraHistoricoReparos();
    }
}
