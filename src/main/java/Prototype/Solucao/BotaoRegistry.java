package Prototype.Solucao;

import Prototype.Botao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BotaoRegistry {

    private static BotaoRegistry botaoRegistry;

    // Esse Map é o cara que vai regitrar nosso prototipos.
    private static Map<String, Botao> REGISTRY = new HashMap<>();

// Comportamento Lazy
    public static BotaoRegistry getInstance(){
        if (Objects.isNull(botaoRegistry)){
            botaoRegistry = new BotaoRegistry();
            return botaoRegistry;
        }
        return botaoRegistry;
    }
}
