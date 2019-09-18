package org.sai.SamplePackage.HomeTask4.OOPs.Bouquet;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
   static List<FlowerInfo> flowerInfoList = new ArrayList<FlowerInfo>();
   static FlowerInfo flowerInfo;
    public static void main(String[] args){
//        Roses roses = new Roses();

        Flowers roses = new Roses();
        flowerInfo = new FlowerInfo();

        flowerInfo.setFlower(roses.getClass().toString());
        flowerInfo.setQuantity(roses.quantityOfFlowers());
        flowerInfo.setCost(roses.costOfFlower(roses.quantityOfFlowers()));

        flowerInfoList.add(flowerInfo);

        System.out.println(flowerInfoList.get(0).getQuantity());
        System.out.println(flowerInfoList.get(0).getCost());
        System.out.println(flowerInfoList.get(0).getFlower());


    }
}
