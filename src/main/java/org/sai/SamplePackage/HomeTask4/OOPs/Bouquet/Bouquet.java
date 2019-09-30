package org.sai.SamplePackage.HomeTask4.OOPs.Bouquet;

import org.sai.SamplePackage.HomeTask4.OOPs.FlowerSetUp.FlowerSetUpDriver;
import org.sai.SamplePackage.HomeTask4.OOPs.FlowerSetUp.Flowers;
import org.sai.SamplePackage.HomeTask4.OOPs.FlowerSetUp.RedRoses;
import org.sai.SamplePackage.HomeTask4.OOPs.FlowerSetUp.Roses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Bouquet {

   static List<FlowerInfo> flowerInfoList = new ArrayList<FlowerInfo>();
   static FlowerInfo flowerInfo;
   static FlowerSetUpDriver flowerSetUpDriver = new FlowerSetUpDriver();
   static Scanner scanner;
   static double bouquetPrice;

    public static void main(String[] args) throws Exception {
        boolean orderOn = true;

        while(orderOn) {
            System.out.println("Add Flowers to Bouquet :: \n 1.Rose \n 2.Lilly \n 3.Order Bouquet!");
            scanner = new Scanner(System.in);
            int floNum = Integer.parseInt(scanner.nextLine());

            switch (floNum) {
                case 1:
                    Roses roses = null;
                    System.out.println("1.Normal Roses \t 2.Red Roses");
                    int rose = Integer.parseInt(scanner.nextLine());
                    switch (rose){
                        case 1:
                            roses = new Roses();
                            break;
                        case 2:
                            roses = new RedRoses();
                            break;
                        default :
                            break;
                    }
//                    Roses roses = new Roses();
                    flowerInfo = new FlowerInfo();
                    flowerInfo.setFlower("Roses");
                    System.out.println("Enter the quantity to buy::");
                    double qnty = Double.parseDouble(scanner.nextLine());
                    roses.buyRoses(qnty);
                    flowerInfo.setQuantity(qnty);
                    flowerInfo.setCost(roses.costOfFlower(roses.costOfFlower(qnty)));
                    flowerInfoList.add(flowerInfo);

                    break;
                case 2:

                    break;
                case 3:
                    orderOn=false;
                    if (flowerInfoList.size() > 0) {
                        Iterator<FlowerInfo> flowerInfoIterator = flowerInfoList.iterator();
                        while (flowerInfoIterator.hasNext()) {
                            FlowerInfo fInfo = flowerInfoIterator.next();
                            System.out.println("Flower :: " + fInfo.getFlower() + "--> Quantity :: " + fInfo.getQuantity() + "--> Cost :: " + fInfo.getCost());
                            bouquetPrice = bouquetPrice + fInfo.getCost();
                        }
                        System.out.println("Total Cost of Bouquet :: " + bouquetPrice);
                    } else {
                        System.out.println("Order Failed.. :(");
                    }
                    break;
                default:
                    throw new Exception("only 2 flowers available");
            }

        }
    }
}
