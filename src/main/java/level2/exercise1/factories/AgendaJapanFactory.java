package level2.exercise1.factories;

import level2.exercise1.interfaces.Address;
import level2.exercise1.interfaces.Telephone;
import level2.exercise1.interfaces.address.AddressJapan;
import level2.exercise1.interfaces.telephone.TelephoneJapan;

public class AgendaJapanFactory implements AgendaFactory {
    private TelephoneJapan telephoneJapan;
    @Override
    public Telephone createTelephone(String number) {
        return new TelephoneJapan(number);
    }

    @Override
    public Address createAddress(String... data) {
        return new AddressJapan(data[0], data[1], data[2], data[3], data[4], data[5]);
    }
}
