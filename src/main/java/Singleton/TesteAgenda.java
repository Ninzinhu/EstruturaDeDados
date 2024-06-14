package Singleton;

public class TesteAgenda {

    public static void main(String[] args) {

    }

    public static void reservaDia(String dia){
        Agenda agenda = new Agenda();
        agenda.ocupa(dia);
        System.out.println(agenda);
    }
}
