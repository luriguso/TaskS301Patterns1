package level2.exercise1.interfaces.address;

import level2.exercise1.interfaces.Address;

public class AddressSpain implements Address {
    private String street;
    private String number;
    private String postalCode;
    private String city;
    private String province;
    private static final String COUNTRY = "Spain";

    public AddressSpain(String street, String number, String postalCode, String city, String province) {
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
        this.province = province;
    }
    @Override
    public String getOrderAddress() {
        return "Street → Number → Postal Code → City → Province → Country";
    }

    @Override
    public Boolean needZipCode() {
        return true;
    }

    @Override
    public String getFullAddress() {
        return street + " " + number + " " + postalCode + " " + city + " " + province + " " + COUNTRY;
    }
}
