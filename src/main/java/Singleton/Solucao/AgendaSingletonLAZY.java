package Singleton.Solucao;

import java.util.HashMap;
import java.util.Map;

public class AgendaSingletonLAZY {

    private static AgendaSingletonLAZY INSTANCE = null;

    private final Map<String, Boolean> diasDisponiveis = new HashMap<>();


    // Adicionando no Map
    public AgendaSingletonLAZY() {
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terça", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sábado", Boolean.TRUE);
    }

    public static AgendaSingletonLAZY getInstance() {
        return INSTANCE;
    }

    public Map<String, Boolean> getDias() {
        return diasDisponiveis;
    }

    public void ocupa(String dia) {
        diasDisponiveis.replace(dia, Boolean.FALSE);
    }
}
