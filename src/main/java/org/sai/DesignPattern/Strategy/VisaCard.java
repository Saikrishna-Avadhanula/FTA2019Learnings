package org.sai.DesignPattern.Strategy;

public class VisaCard extends CreditCard {
    public VisaCard(String number) {
        super(number);
    }

    public VisaCard(String name, String date, String cvv, String number) {
        super(name, date, cvv, number);
    }

}
