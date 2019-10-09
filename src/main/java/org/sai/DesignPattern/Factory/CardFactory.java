package org.sai.DesignPattern.Factory;

public class CardFactory {
    public static Card1 getCard(String name){
        Card1 card1 = null;

        if(name.startsWith("A")){
            String number = null;
            card1 = new AmexCard();
        }

        return card1;
    }
}
