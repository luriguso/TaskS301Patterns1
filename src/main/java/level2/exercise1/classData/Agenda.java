package level2.exercise1.classData;

import level2.exercise1.interfaces.Address;
import level2.exercise1.interfaces.Telephone;

public class Agenda {
    private Address address;
    private Telephone telephone;

    public Agenda(Address address, Telephone telephone) {
        this.address = address;
        this.telephone = telephone;
    }

    public void showContact(){
        System.out.println("Address: " + address.getFullAddress());
        System.out.println("Telephone: " + telephone.getNumberPhone());
    }

}
