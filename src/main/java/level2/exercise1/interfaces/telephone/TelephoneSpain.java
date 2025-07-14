package level2.exercise1.interfaces.telephone;

import level2.exercise1.interfaces.Telephone;

public class TelephoneSpain implements Telephone {
    private static final String INTERNATIONALPREFIX = "+34";
    private String number;

    public TelephoneSpain(String number) {
        this.number = number;
    }
    @Override
    public String getInternationalPrefix() {
        return INTERNATIONALPREFIX;
    }
    @Override
    public String getNumberLength() {
        return "9";
    }
    @Override
    public String getExampleNumber() {
        return "+34 637812983";
    }

    @Override
    public String getNumberPhone() {
        return INTERNATIONALPREFIX + " " +number;
    }
}
