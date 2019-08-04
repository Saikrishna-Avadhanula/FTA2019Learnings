//import org.sai.SamplePackage;

import org.junit.Test;
import org.sai.SamplePackage.Sample;
public class displayHelloTest {

@Test
    public void displayTest(){
    Sample sample = new Sample();
        String str="Sai";
        sample.displayHello(str);
    }
}
