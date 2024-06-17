package Adpter.Solução;

import Adpter.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class JarOperacoesContaCorrenteAdpter {


    private JarOperacoesContaCorrente jarConta;


    public JarOperacoesContaCorrenteAdpter(JarOperacoesContaCorrente jarConta) {
        this.jarConta = jarConta;
    }


    public void saca(BigDecimal valorPretendido) {
        if (jarConta.validaSaldo(valorPretendido)) {
            jarConta.saca(valorPretendido);
        } else {
            throw new IllegalArgumentException("Valor não permitido");
        }
        System.out.println("Sacando...");
    }

    public void deposita(BigDecimal valor) {
        jarConta.deposita(valor);
    }
}
