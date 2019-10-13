package org.sai.SamplePackage.HomeTask4.OOPs.FlowerSetUp;

public class RedRoses extends Roses implements BuyFlowers{

    private static double totalQuantityOfRoses ;
    private static double costOfOneRose;

    public static double getTotalQuantityOfRoses() {
        return totalQuantityOfRoses;
    }

    public static void setTotalQuantityOfRoses(double totalQuantityOfRoses) {
        RedRoses.totalQuantityOfRoses = totalQuantityOfRoses;
    }


    public static double getCostOfOneRose() {
        return costOfOneRose;
    }


    public static void setCostOfOneRose(double costOfOneRose) {
        RedRoses.costOfOneRose = costOfOneRose;
    }


    RedRoses(double costOfOneRose, double totalQuantityOfRoses){
        setCostOfOneRose(costOfOneRose);
        setTotalQuantityOfRoses(totalQuantityOfRoses);
    }

    public RedRoses (){
        System.out.println("Total Red-Roses Avaialble ::"+getTotalQuantityOfRoses());
        System.out.println("Cost of Each Red-Rose ::"+(getCostOfOneRose()));
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

    @Override
    public void setFlowerPrice(double setFlowerPrice) {

    }


}
