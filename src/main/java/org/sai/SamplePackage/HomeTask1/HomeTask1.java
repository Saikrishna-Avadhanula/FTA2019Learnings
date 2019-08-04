package org.sai.SamplePackage.HomeTask1;

public class HomeTask1 {

    public int intApples(int dApples, int aApples){
      int result = 0;
    try{
      result = dApples+aApples;
     }
    catch(Exception ex){
        System.out.println(ex.getStackTrace());
        }
        return result;
    }

    public double dApples(double dApples, double aApples){
       double result = 0;
        try{
            result = dApples+aApples;
        }
        catch(Exception ex){
            System.out.println(ex.getStackTrace());
        }
        return result;
    }

}
