package level2.exercise1.factories;

import level2.exercise1.interfaces.Address;
import level2.exercise1.interfaces.Telephone;
import level2.exercise1.interfaces.address.AddressSpain;
import level2.exercise1.interfaces.telephone.TelephoneSpain;

public class AgendaSpainFactory implements AgendaFactory {

    @Override
    public Telephone createTelephone(String number) {
        return new TelephoneSpain(number);
    }

    @Override
    public Address createAddress(String... data) {
        return new AddressSpain(data[0], data[1], data[2], data[3], data[4]);
    }
}
