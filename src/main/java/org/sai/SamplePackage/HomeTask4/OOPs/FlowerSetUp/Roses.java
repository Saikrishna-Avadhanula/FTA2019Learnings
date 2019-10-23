package org.sai.SamplePackage.HomeTask4.OOPs.FlowerSetUp;

public class Roses implements Flowers,BuyFlowers {


    private static double totalQuantityOfRoses ;
    private static double costOfOneRose;

    /*
    Roses(double costOfOneRose, double totalQuantityOfRoses) is having default modifier as it should be setted by only the flower seller.
    Roses() is to give the info when it is initialized
     */

    Roses(double costOfOneRose, double totalQuantityOfRoses){
        setCostOfOneRose(costOfOneRose);
        setTotalQuantityOfRoses(totalQuantityOfRoses);
//     System.out.println("Total Roses restored to ::"+getTotalQuantityOfRoses());
//     System.out.println("Cost of each Rose ::"+getCostOfOneRose());
    }

    public Roses (){
        System.out.println("Total Roses Avaialble ::"+getTotalQuantityOfRoses());
        System.out.println("Cost of Each Rose ::"+(getCostOfOneRose()));
    }

    public static double getCostOfOneRose() {
        return costOfOneRose;
    }

    protected static void setCostOfOneRose(double costOfOneRose) {
        Roses.costOfOneRose = costOfOneRose;
    }

    public static double getTotalQuantityOfRoses() {
        return totalQuantityOfRoses;
    }

    private static void setTotalQuantityOfRoses(double totalQuantityOfRoses) {
        Roses.totalQuantityOfRoses = totalQuantityOfRoses;
    }

    public boolean isAvailable() {
        return totalQuantityOfRoses>0?true:false;
    }

    public double costOfFlower(double qnty) {
        return qnty*getCostOfOneRose();
    }

    public double quantityOfFlowers() {
        return getTotalQuantityOfRoses();
    }

    public void buyRoses(double qnty)  {


    }

    @Override
    public void setFlowerPrice(double setFlowerPrice) {

    }

    @Override
    public void buyFlowers(double flowerQuantity) {
        if(isAvailable() && flowerQuantity <= getTotalQuantityOfRoses()){
            setTotalQuantityOfRoses(getTotalQuantityOfRoses()-flowerQuantity);
            System.out.println("No.of Roses buying::"+flowerQuantity);
            System.out.println("After buy no.of Roses Left ::"+ getTotalQuantityOfRoses());
            System.out.println("Price of "+flowerQuantity+" Roses ::"+costOfFlower(flowerQuantity));
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
}
