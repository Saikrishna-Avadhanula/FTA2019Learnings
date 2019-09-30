package org.FTA.HomeTask.OOPs.FlowerSetUp;

public class FlowerSetUpDriver {


    public FlowerSetUpDriver(){
        setRoses();
        setRedRoses();
    }

    private void setRoses(){
        new Roses(10,1000 );
    }

    private void setRedRoses(){
        new RedRoses(15,50 );
    }

}
