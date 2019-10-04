package org.sai.DesignPattern.Strategy;

public class MasterCard extends CreditCard {
    public MasterCard(String number) {
        super(number);
    }

    public MasterCard(String name, String date, String cvv, String number) {
        super(name, date, cvv, number);
    }

}
