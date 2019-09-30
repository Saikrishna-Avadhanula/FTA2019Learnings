package org.sai.SamplePackage.HomeTask4.OOPs.FlowerSetUp;

public class RedRoses extends Roses {

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
//        System.out.println("Total Red - Roses restored to ::"+getTotalQuantityOfRoses());
//        System.out.println("Cost of each Red - Rose ::"+getCostOfOneRose());
    }

    public RedRoses (){
        System.out.println("Total Red-Roses Avaialble ::"+getTotalQuantityOfRoses());
        System.out.println("Cost of Each Red-Rose ::"+(getCostOfOneRose()));
    }


}
