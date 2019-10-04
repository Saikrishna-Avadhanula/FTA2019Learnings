package org.sai.DesignPattern.Strategy;

public class MCValidator implements IValidator {
    @Override
    public boolean validator(CreditCard creditCard) {
        return false;
    }
}
