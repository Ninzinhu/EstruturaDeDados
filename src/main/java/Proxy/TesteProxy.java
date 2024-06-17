package Proxy;

import DesignPatternsEmJava.Builder.Pessoa;
import DesignPatternsEmJava.Builder.PessoaBuilder;

import java.time.LocalDate;

public class TesteProxy {

    public static void main(String[] args) {
        PessoaService pessoaService = new PessoaService(new PessoaRepository());

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

//        System.out.println("Nome: " + pessoa.getNome());
//        System.out.println("Sobrenome: " + pessoa.getSobreNome());
//        System.out.println("Documento: " + pessoa.getDocumento());
//        System.out.println("Email: " + pessoa.getEmail());
//        System.out.println("Apelido: " + pessoa.getApelido());
//        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
    }
}
