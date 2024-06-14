package Singleton.Solucao;

import Singleton.Agenda;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;

public class TesteAgenda {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//        AgendaSingletonEAGER agenda1 = AgendaSingletonEAGER.getInstance();
//        AgendaSingletonEAGER agenda2 = AgendaSingletonEAGER.getInstance();
//        System.out.println(agenda1);
//        System.out.println(agenda2);
//
//
//        reservaDiaEAGER("Sexta");
//        reservaDiaEAGER("Sábado");


//        AgendaSingletonLAZY agenda1 = AgendaSingletonLAZY.getInstance();
//        AgendaSingletonLAZY agenda2 = AgendaSingletonLAZY.getInstance();
//        System.out.println(agenda1);
//        System.out.println(agenda2);

        // reflection Lazy
//        Constructor<AgendaSingletonLAZY> construtorTravesso= AgendaSingletonLAZY.class.getDeclaredConstructor();
//        construtorTravesso.setAccessible(true);
//        AgendaSingletonLAZY agendaTravessa = construtorTravesso.newInstance();
//        AgendaSingletonLAZY agendaTravessa2 = construtorTravesso.newInstance();
//
//        System.out.println(agendaTravessa2);
//        System.out.println(agendaTravessa);
//
//        reservaDiaEAGER("Sexta");
//        reservaDiaEAGER("Sábado");


        AgendaSingletonEnum agenda1 = AgendaSingletonEnum.getInstance();
        AgendaSingletonEnum agenda2 = AgendaSingletonEnum.getInstance();
        System.out.println(agenda1.hashCode());
        System.out.println(agenda2.hashCode());

        // reflection Enum (Proteção contra isso utiliza o ENum)
        Constructor<AgendaSingletonEnum> construtorTravesso= AgendaSingletonEnum.class.getDeclaredConstructor();
        construtorTravesso.setAccessible(true);
        AgendaSingletonEnum agendaTravessa = construtorTravesso.newInstance();
        AgendaSingletonEnum agendaTravessa2 = construtorTravesso.newInstance();

        System.out.println(agendaTravessa2.hashCode());
        System.out.println(agendaTravessa.hashCode());

        reservaDiaEnum("Sexta");
        reservaDiaEnum("Sábado");

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

    public static void reservaDiaEnum(String dia) {
        AgendaSingletonEnum agenda = AgendaSingletonEnum.getInstance();
        agenda.ocupa(dia);
        System.out.println(agenda.getDias());

        Calendar.getInstance();
    }
}

