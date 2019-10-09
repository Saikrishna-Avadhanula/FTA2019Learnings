package org.sai.DesignPattern.Strategy;

import org.junit.Assert;

import org.testng.annotations.*;

public class CreditCardTests {

    private Object MCValidator;

    @DataProvider(name = "testdataForCardsTest")
    public Object[][] testdataForCreditCardsTest(){

        return new Object[][]{
                {new MasterCard("MC-123456678"),MCValidator,true},
//                {new VisaCard("VI-123456678"),true},
//                {new MasterCard("M123456678"),false},
//                {new AmexCard("MC-123456678-AM"),true}
        };
    }

    @Test(dataProvider = "testdataForCardsTest")
    public void lengthOfStringTest(CreditCard creditCard,IValidator validator, boolean isValid){
        boolean actualResult = creditCard.isValid(validator);
        Assert.assertEquals(creditCard.getNumber() + " is expected to be "+ isValid, actualResult, isValid);

    }
}
