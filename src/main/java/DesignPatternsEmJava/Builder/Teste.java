package DesignPatternsEmJava.Builder;

import java.time.LocalDate;

public class Teste {

    public static void main(String[] args) {
        new PessoaBuilder()
                .nome("João")
                .sobreNome("Victor")
                .documento("15715715757")
                .email("zé@gmail.com")
                .apelido("zé polvinho")
                .dataNacimento(LocalDate.of(2003, 04, 02))
                .criarPessoa()
    }


}
