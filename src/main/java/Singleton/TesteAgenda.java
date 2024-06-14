package Singleton;

import java.util.Calendar;

public class TesteAgenda {

    public static void main(String[] args) {

        reservaDia("Sexta");
        reservaDia("Sábado");

    }

    public static void reservaDia(String dia) {
        Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());

        Calendar.getInstance();
    }
}
