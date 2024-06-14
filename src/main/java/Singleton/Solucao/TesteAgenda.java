package Singleton.Solucao;

import Singleton.Agenda;

import java.util.Calendar;

public class TesteAgenda {
    public static void main(String[] args) {
//        AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
//        AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();
//        System.out.println(agenda1);
//        System.out.println(agenda2);
//
//
//        reservaDiaEAGER("Sexta");
//        reservaDiaEAGER("Sábado");


        AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
        AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();
        System.out.println(agenda1);
        System.out.println(agenda2);

        reservaDiaEAGER("Sexta");
        reservaDiaEAGER("Sábado");

    }

    public static void reservaDiaEAGER(String dia) {
        AgendaSingletonEAGER agenda = AgendaSingletonEAGER.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());

        Calendar.getInstance();
    }

    public static void reservaDiaLAZY(String dia) {
        AgendaSingletonLAZY agenda = AgendaSingletonLAZY.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());

        Calendar.getInstance();
    }
}

