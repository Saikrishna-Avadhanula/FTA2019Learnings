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

//<<<<<<< HEAD
    @Test(dataProvider = "testdataForCardsTest")
    public void lengthOfStringTest(CreditCard creditCard,IValidator validator, boolean isValid){
        boolean actualResult = creditCard.isValid(validator);
//=======
//    @Test(dataProvider = "testdataForCardsTest")
//    public void lengthOfStringTest(CreditCard creditCard, boolean isValid){
//        boolean actualResult =true;
////>>>>>>> 0e5f1de3eceaa77f1b61c1b41836df1e7d482c26
//        Assert.assertEquals(creditCard.getNumber() + " is expected to be "+ isValid, actualResult, isValid);
//
//    }
}}
