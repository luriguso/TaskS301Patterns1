package level2.exercise1.classManagement;

import level2.exercise1.classData.Agenda;
import level2.exercise1.factories.AgendaBoliviaFactory;
import level2.exercise1.factories.AgendaFactory;
import level2.exercise1.factories.AgendaJapanFactory;
import level2.exercise1.factories.AgendaSpainFactory;

import java.util.ArrayList;
import java.util.List;

public class AgendaManagement {
    private final List<Agenda> agenda;

    public AgendaManagement() {
        agenda = new ArrayList<>();
    }

    public void addContactBolivia(){
        AgendaFactory agendaBolivia = new AgendaBoliviaFactory();
        Agenda boliviaContact = new Agenda(
                agendaBolivia.createAddress("Esteban Arce", "5", "Cochabamba"),
                agendaBolivia.createTelephone("60712595")
        );
        agenda.add(boliviaContact);
    }

    public void addContactJapan(){
        AgendaFactory agendaJapan = new AgendaJapanFactory();

        Agenda japanContact = new Agenda(
                agendaJapan.createAddress("Tokyo-to", "Shibuya-ku", "Jinnan", "2-chome", "24-12", "Shibuya Scramble Square"),
                agendaJapan.createTelephone("09012345678")
        );

        agenda.add(japanContact);
    }

    public void addContactSpain(){
        AgendaFactory agendaSpain = new AgendaSpainFactory();

        Agenda spainContact = new Agenda(
                agendaSpain.createAddress("Passatge de Llunas", "11", "08906","Barcelona" ,"L'Hospitalet"),
                agendaSpain.createTelephone("631604226")
        );

        agenda.add(spainContact);
    }

    public void showAgenda(){
        System.out.println("-----------Contacts---------");
        agenda.forEach(System.out::println);
        System.out.println("----------------------------");
    }
}
