package Adpter.Solução;

import Adpter.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class ClienteJarOperaceosCorrenteAdpter {

    private JarOperacoesContaCorrenteAdpter jarContaAdpter;


    public ClienteJarOperaceosCorrenteAdpter(JarOperacoesContaCorrenteAdpter jarContaAdpter) {
        this.jarContaAdpter = jarContaAdpter;
    }



    public void saca(BigDecimal valorPretendido) {
        jarContaAdpter.saca(valorPretendido);
    }

    public void deposita(BigDecimal valor) {
        jarContaAdpter.deposita(valor);
    }
}
