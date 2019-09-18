package org.sai.SamplePackage.HomeTask4.OOPs.Bouquet;

public class Roses implements Flowers {




    private static double totalQuantityOfRoses = 120;
    private double costOfOneRose = 12.0;

    public double getCostOfOneRose() {
        return costOfOneRose;
    }

    private void setCostOfOneRose(double costOfOneRose) {
        this.costOfOneRose = costOfOneRose;
    }



    public static double getTotalQuantityOfRoses() {
        return totalQuantityOfRoses;
    }

    private static void setTotalQuantityOfRoses(double totalQuantityOfRoses) {
        Roses.totalQuantityOfRoses = totalQuantityOfRoses;
    }

    public void buyRoses(double qnty)  {
        if(qnty <= getTotalQuantityOfRoses()){
            setTotalQuantityOfRoses(getTotalQuantityOfRoses()-qnty);
            System.out.println("No.of Roses::"+qnty);
            System.out.println("After buy no.of Roses Left ::"+ getTotalQuantityOfRoses());
            System.out.println("Price of "+qnty+" Roses ::"+new Roses().costOfFlower(qnty));
        }
        else{
            try {
                throw new Exception("Stock Not Available");
            } catch (Exception e) {
                e.printStackTrace();
                e.getMessage();
            }
        }

    }

    public boolean isAvailable() {
        return totalQuantityOfRoses ==0?false:true;
    }

    public double costOfFlower(double qnty) {
        return qnty*getCostOfOneRose();
    }

    public double quantityOfFlowers() {
        return getTotalQuantityOfRoses();
    }
}
