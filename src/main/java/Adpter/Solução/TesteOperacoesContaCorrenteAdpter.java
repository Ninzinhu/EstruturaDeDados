package Adpter.Solução;

import Adpter.ClientJarOperacoesContaCorrente;
import Adpter.JarOperacoesContaCorrente;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrenteAdpter {

    public static void main(String[] args) {


        JarOperacoesContaCorrente jarConta = new JarOperacoesContaCorrente();
        ClientJarOperacoesContaCorrente client = new ClientJarOperacoesContaCorrente(jarConta);

        BigDecimal valorPretendidoParaSaque = new BigDecimal(1000);

        if (client.validaSaldo(valorPretendidoParaSaque)){
            client.saca(valorPretendidoParaSaque);
        }
        client.deposita(BigDecimal.valueOf(500));
    }
}
