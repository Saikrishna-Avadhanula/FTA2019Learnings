package org.FTA.HomeTask.OOPs.Bouquet;

public class FlowerInfo {

    /*
    This should be the collections class where it store all Flower objects and its qualities like Type of Flower, Color of flower, Cost of each flower, Quantity left;
     */
    private String flower;
    private double quantity;
    private double cost;

    public String getFlower() {
        return flower;
    }

    public void setFlower(String flower) {
        this.flower = flower;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
