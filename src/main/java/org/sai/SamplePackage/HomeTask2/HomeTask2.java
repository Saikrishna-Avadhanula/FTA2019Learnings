package org.sai.SamplePackage.HomeTask2;

import TestBase.LoggerBase;

public class HomeTask2 extends LoggerBase {

    public String helloUser(String user){
        String output=null;
        try{
            output = "HELLO! "+ user;
        }
        catch(Exception e){
            LoggerBase.info(e.getStackTrace());
        }
        return output;
    }

}
