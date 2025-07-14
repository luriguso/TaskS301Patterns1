package level2.exercise1.interfaces.telephone;

import level2.exercise1.interfaces.Telephone;

public class TelephoneBolivia implements Telephone {
    private static final String INTERNATIONALPREFIX = "+591";
    public static final int NUMBERLENG = 8;
    private String number;

    public TelephoneBolivia(String number) {
        this.number = number;
    }

    @Override
    public String getInternationalPrefix(){
        return INTERNATIONALPREFIX;
    }
    @Override
    public String getNumberLength() {
        return "8";
    }

    @Override
    public String getExampleNumber() {
        return "+591 60712595";
    }

    @Override
    public String getNumberPhone() {
        return INTERNATIONALPREFIX + " " +number;
    }
}
