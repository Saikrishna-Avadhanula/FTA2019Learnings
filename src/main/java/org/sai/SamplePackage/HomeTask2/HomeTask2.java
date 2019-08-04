package org.sai.SamplePackage.HomeTask2;

public class HomeTask2 {

    public String helloUser(String user){
        String output=null;
        try{
            output = "HELLO! "+ user;
        }
        catch(Exception e){
            System.out.println(e.getStackTrace());
        }
        return output;
    }

}
