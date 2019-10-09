package org.sai.DesignPattern.Factory;

public class AmexCard extends Card1 {

    @Override
    public Card1 createCard(String name) {

        return null;
    }

    @Override
    public boolean validate() {
        return false;
    }
}
