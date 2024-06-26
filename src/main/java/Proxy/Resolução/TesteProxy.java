package Proxy.Resolução;

import DesignPatternsEmJava.Builder.Pessoa;
import DesignPatternsEmJava.Builder.PessoaBuilder;
import Proxy.PessoaRepository;
import Proxy.PessoaService;

import java.time.LocalDate;

public class TesteProxy {

    public static void main(String[] args) {
        PessoaRepositoryProxy pessoaRepositoryProxy = new PessoaRepositoryProxy();
        PessoaService pessoaService = new PessoaService(pessoaRepositoryProxy);

        Pessoa pessoa = new PessoaBuilder()
                .nome("João")
                .sobreNome("Victor")
                .documento("123456789")
                .email("joao.victor@example.com")
                .apelido("Jo")
                .dataNascimento(LocalDate.of(2003, 4, 2))
                .criarPessoa();

        pessoaService.save(pessoa);

        Pessoa pessoaRetornada = pessoaService.findById(1L);
        System.out.println(pessoaRetornada);


        Pessoa pessoaRetornadaCache = pessoaService.findById(1L);
        System.out.println(pessoaRetornadaCache);


    }
}
