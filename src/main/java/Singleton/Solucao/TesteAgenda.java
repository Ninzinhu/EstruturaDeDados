package Singleton.Solucao;

import Singleton.Agenda;

import java.util.Calendar;

public class TesteAgenda {
    public static void main(String[] args) {

        reservaDiaEAGER("Sexta");
        reservaDiaEAGER("Sábado");

    }

    public static void reservaDiaEAGER(String dia) {
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());

        Calendar.getInstance();
    }
}

