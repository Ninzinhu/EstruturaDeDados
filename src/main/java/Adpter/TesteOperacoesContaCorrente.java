package Adpter;

import java.math.BigDecimal;

public class TesteOperacoesContaCorrente {

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
