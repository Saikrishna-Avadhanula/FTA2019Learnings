package org.sai.DesignPattern.Strategy;

import org.junit.Assert;

import org.testng.annotations.*;

public class CreditCardTests {

    @DataProvider(name = "testdataForCardsTest")
    public Object[][] testdataForCreditCardsTest(){

        return new Object[][]{
                {new MasterCard("MC-123456678"),true},
                {new VisaCard("VI-123456678"),true},
                {new MasterCard("M123456678"),false},
                {new AmexCard("MC-123456678-AM"),true}
        };
    }

//    @Test(dataProvider = "testdataForCardsTest")
    public void lengthOfStringTest(CreditCard creditCard, boolean isValid){
        boolean actualResult =true;
        Assert.assertEquals(creditCard.getNumber() + " is expected to be "+ isValid, actualResult, isValid);

    }
}
