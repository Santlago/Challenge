import models.Endereco;
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
        joao.mostraInfo();

        Seguro segurojoao = new Seguro(joao);
        System.out.println(segurojoao.getId());
    }
}
