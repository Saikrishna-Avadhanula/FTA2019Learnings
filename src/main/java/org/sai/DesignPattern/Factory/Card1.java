package org.sai.DesignPattern.Factory;

public abstract class Card1 {
    String name;
    String number;
    public abstract boolean validate();
    public abstract Card1 createCard(String name);

    public Card1(){
        this.createCard(name);
    }

//    public String generateRandomNumber(){
//        //add logic for random number
//        return "123456789";
//    }
}
