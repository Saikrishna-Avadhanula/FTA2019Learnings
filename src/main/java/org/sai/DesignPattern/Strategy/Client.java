package org.sai.DesignPattern.Strategy;

public class Client {

    public static void main(String[] args){

        CreditCard masterCard = new MasterCard("MC-12345678");
        CreditCard visaCard =  new VisaCard("VI-12345678");
        CreditCard amexCard = new AmexCard("12345678-AM");




    }
}
