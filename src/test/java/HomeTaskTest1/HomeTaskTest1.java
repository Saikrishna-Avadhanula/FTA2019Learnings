package HomeTaskTest1;

import org.junit.Assert;
import org.junit.Test;
import org.sai.SamplePackage.HomeTask1.HomeTask1;

public class HomeTaskTest1 {

    @Test
    public void intApplesPostivePassTest(){
        HomeTask1 homeTask1 = new HomeTask1();
        int actualResult = homeTask1.intApples(5,5);
        Assert.assertEquals("MissMatched",10 ,actualResult);
    }

    @Test
    public void intApplesPostiveFailTest(){
        HomeTask1 homeTask1 = new HomeTask1();
        int actualResult = homeTask1.intApples(5,5);
        Assert.assertFalse("Matched", actualResult==5);
    }

    @Test
    public void douApplesPostivePassTest(){
        HomeTask1 homeTask1 = new HomeTask1();
        double actualResult = homeTask1.dApples(5.5,5.4);
        Assert.assertEquals(10.9,actualResult,0.1);    }

    @Test
    public void douApplesPostiveFailTest(){
        HomeTask1 homeTask1 = new HomeTask1();
        double actualResult = homeTask1.dApples(5.5,5.4);
        Assert.assertFalse("Mismatched",actualResult==(5.5+5.4));
//        Assert.assertEquals(10.9,actualResult,0.1);
    }


}
