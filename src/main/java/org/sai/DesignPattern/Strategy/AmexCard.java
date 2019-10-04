package org.sai.DesignPattern.Strategy;

public class AmexCard extends CreditCard {
    public AmexCard(String number) {
        super(number);
    }

    public AmexCard(String name, String date, String cvv, String number) {
        super(name, date, cvv, number);
    }

}
