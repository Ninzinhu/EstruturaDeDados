package Adpter.Solução;

import Adpter.ClientJarOperacoesContaCorrente;
import Adpter.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrenteAdpter {

    public static void main(String[] args) {

        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        JarOperacoesContaCorrenteAdpter jarContaAdpter = new JarOperacoesContaCorrenteAdpter(jarConta);
        ClienteJarOperaceosCorrenteAdpter client = new ClienteJarOperaceosCorrenteAdpter(jarContaAdpter);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);


        client.saca(valorPretendidoParaSaque); // 1 Chamada

        client.deposita(BigDecimal.valueOf(500)); // 2 Chamada
    }
}
