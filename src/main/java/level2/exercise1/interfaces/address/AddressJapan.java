package level2.exercise1.interfaces.address;

import level2.exercise1.interfaces.Address;

public class AddressJapan implements Address {
    private static final String COUNTRY = "Japan";
    private String prefecture;
    private String city;
    private String neighborhood;
    private String street;
    private String number;
    private String name;

    public AddressJapan(String prefecture, String city, String neighborhood, String street, String number, String name) {
        this.prefecture = prefecture;
        this.city = city;
        this.neighborhood = neighborhood;
        this.street = street;
        this.number = number;
        this.name = name;
    }
    @Override
    public String getOrderAddress() {
        return "Country → Prefecture → City → Neighborhood → Street/Number → Name";
    }

    @Override
    public Boolean needZipCode() {
        return true;
    }

    @Override
    public String getFullAddress() {
        return COUNTRY + " " + prefecture + " " + city + " " + neighborhood + " " + street + " " + number +  " " + name;
    }
}
