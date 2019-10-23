package org.sai.SamplePackage.HomeTask1;
import TestBase.LoggerBase;

public class HomeTask1 extends LoggerBase{

    LoggerBase logger;

    public static void main(String[] Args){
        HomeTask1 homeTask1 = new HomeTask1();
        homeTask1.intApples(4,5);
    }


    public int intApples(int dApples, int aApples){
      int result = 0;
    try{
      result = dApples+aApples;
        LoggerBase.info("Result::"+result);
     }
    catch(Exception ex){
        LoggerBase.info(ex.getStackTrace());
        }
        return result;
    }

    public double dApples(double dApples, double aApples){
       double result = 0;
        try{
            result = dApples+aApples;
        }
        catch(Exception ex){
            LoggerBase.info(ex.getStackTrace());
        }
        return result;
    }

}
