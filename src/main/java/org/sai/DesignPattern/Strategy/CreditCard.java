package org.sai.DesignPattern.Strategy;

public class CreditCard {
    private String name;
    private String date;
    private String cvv;
    private String number;

    public CreditCard(String number) {
        this.number = number;
    }

    public CreditCard(String name, String date, String cvv, String number) {
        this.name = name;
        this.date = date;
        this.cvv = cvv;
        this.number = number;
    }

    public void setCardValidator(IValidator cardValidator) {
        this.cardValidator = cardValidator;
    }

    private IValidator cardValidator = null;
    
    
    public boolean isValid(IValidator cardValidator){
    this.setCardValidator(cardValidator);
    return cardValidator.validator(this);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
