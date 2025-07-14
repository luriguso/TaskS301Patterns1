package level2.exercise1.interfaces.telephone;

import level2.exercise1.interfaces.Telephone;

public class TelephoneJapan implements Telephone {
    private static final String INTERNATIONALPREFIX = "+81";
    private String number;

    public TelephoneJapan(String number) {
        this.number = number;
    }
    @Override
    public String getInternationalPrefix(){
        return INTERNATIONALPREFIX;
    }
    @Override
    public String getNumberLength() {
        return "10 - 11";
    }
    @Override
    public String getExampleNumber() {
        return "+81 09012345678 o +81 0312345678";
    }

    @Override
    public String getNumberPhone() {
        return INTERNATIONALPREFIX + " " +number;
    }
}
