package level2.exercise1.factories;

import level2.exercise1.interfaces.Address;
import level2.exercise1.interfaces.Telephone;
import level2.exercise1.interfaces.address.AddressBolivia;
import level2.exercise1.interfaces.telephone.TelephoneBolivia;

public class AgendaBoliviaFactory implements AgendaFactory {

    @Override
    public Telephone createTelephone(String number) {
        return new TelephoneBolivia(number);
    }

    @Override
    public Address createAddress(String... data) {
        return new AddressBolivia(data[0], data[1], data[2]);
    }
}
