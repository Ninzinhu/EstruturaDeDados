package Adpter.Solução;

import Adpter.ClientJarOperacoesContaCorrente;
import Adpter.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrenteAdpter {

    public static void main(String[] args) {


        JarOperacoesContaCorrenteAdpter jarContaAdpter = new JarOperacoesContaCorrenteAdpter();
        ClienteJarOperaceosCorrenteAdpter client = new ClienteJarOperaceosCorrenteAdpter(jarContaAdpter);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);


        client.saca(valorPretendidoParaSaque);
        client.deposita(BigDecimal.valueOf(500));
    }
}
