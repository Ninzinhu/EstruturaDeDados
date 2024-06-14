package Singleton.Solucao;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public enum AgendaSingletonEnum {

    INSTANCE;

    private final Map<String, Boolean> diasDisponiveis = new HashMap<>();


    // Adicionando no Map
    private AgendaSingletonEnum() {
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terça", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sábado", Boolean.TRUE);
    }

    public static AgendaSingletonEnum getInstance() {

        return INSTANCE;
    }


    public Map<String, Boolean> getDias() {
        return diasDisponiveis;
    }

    public void ocupa(String dia) {
        diasDisponiveis.replace(dia, Boolean.FALSE);
    }
}
