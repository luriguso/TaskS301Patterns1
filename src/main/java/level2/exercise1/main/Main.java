package level2.exercise1.main;

import level2.exercise1.classManagement.AgendaManagement;

public class Main {
    public static void main(String[] args) {
        AgendaManagement agendaManagement = new AgendaManagement();

        agendaManagement.addContactBolivia();
        agendaManagement.showAgenda();
        agendaManagement.addContactJapan();
        agendaManagement.showAgenda();
    }
}
