package HomeTaskTest2;

import org.junit.Assert;
import org.junit.Test;
import org.sai.SamplePackage.HomeTask2.HomeTask2;

public class HomeTaskTest2 {
    @Test
    public void helloUserTest1(){
        String user="Sai";
        HomeTask2 homeTask2 = new HomeTask2();
        String output = homeTask2.helloUser(user);
        Assert.assertEquals("Failed", "HELLO! "+user,output);
    }
    @Test
    public void helloUserTest2(){
        String user="";
        HomeTask2 homeTask2 = new HomeTask2();
        String output = homeTask2.helloUser(user);
        Assert.assertEquals("Failed", "HELLO! "+user,output);
    }
}
