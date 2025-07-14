package level2.exercise1.factories;

import level2.exercise1.interfaces.Address;
import level2.exercise1.interfaces.Telephone;

public interface AgendaFactory {
    Telephone createTelephone(String number);
    Address createAddress(String... data);
}
