package level2.exercise1.interfaces.address;

import level2.exercise1.interfaces.Address;

public class AddressBolivia implements Address {
    private String street;
    private String number;
    private String city;
    private static final String COUNTRY = "Bolivia";

    public AddressBolivia(String street, String number, String city) {
        this.street = street;
        this.number = number;
        this.city = city;
    }
    @Override
    public String getOrderAddress() {
        return "Street name → Number/suburbs → City → Country";
    }

    @Override
    public Boolean needZipCode() {
        return false;
    }

     @Override
    public String getFullAddress() {
        return street + " " + number + " " + city + " " + COUNTRY;
    }
}
