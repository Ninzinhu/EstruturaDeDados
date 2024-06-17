package Prototype.Solucao;

import Prototype.Botao;

public class TesteBotaoPrototype {


    public static void main(String[] args) {

        // Aqui no registy fica registrado nossos protoipos
//   NÃO SERÁ NECESSÁRIO AGORA BotaoRegistry registry = BotaoRegistry.getInstance();

        Botao botaoVermelho = BotaoRegistry.getBotao("BOTAO_VERMELHO");
        System.out.println(botaoVermelho);

        Botao botaoAzul = BotaoRegistry.getBotao("BOTAO_AZUL");
        System.out.println(botaoAzul);

        Botao botaoAmarelo = BotaoRegistry.getBotao("BOTAO_AMARELO");
        System.out.println(botaoAmarelo);
        botaoAmarelo.setLargura(200);
        System.out.println(botaoAmarelo);



    }
}
