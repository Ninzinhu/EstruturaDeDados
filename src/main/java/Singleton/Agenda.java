package Singleton;

import java.util.HashMap;
import java.util.Map;

public class Agenda {


    private Map<String, Boolean> diasDisponiveis = new HashMap<>();


    // Adicionando no Map
    public Agenda(){
        diasDisponiveis.put("Domingo", Boolean.TRUE);
        diasDisponiveis.put("Segunda", Boolean.TRUE);
        diasDisponiveis.put("Terça", Boolean.TRUE);
        diasDisponiveis.put("Quarta", Boolean.TRUE);
        diasDisponiveis.put("Quinta", Boolean.TRUE);
        diasDisponiveis.put("Sexta", Boolean.TRUE);
        diasDisponiveis.put("Sábado", Boolean.TRUE);
    }

    public Map<String, Boolean> getDias(){ return diasDisponiveis;}

    public void ocupa(String dia) { diasDisponiveis.replace(dia, Boolean.FALSE);}
}
