package com.senla.training.flowershop.flowers;

public abstract class AFlower {
    protected String sort;
    protected double cost;
    protected String color;
    protected String name;

    public AFlower(String aSort, int aCost, String aColor){
        if(aCost < 0){
            System.out.println("Invalid cost of the flower," +
                    "assigning 0");
            cost = 0;
        }
        else {
            cost = aCost;
        }

        if(aSort == null){
            System.out.println("Invalid sort of the flower," +
                    "assigning NoSort");
            sort = "NoSort";
        }
        else {
            sort = aSort;
        }

        if(aColor == null){
            System.out.println("Invalid color of the flower," +
                    "assigning NoColor");
            color = "NoColor";
        }
        else {
            color = aColor;
        }
    }

    public double getCost() {
        return cost;
    }

    public String getSort() {
        return sort;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return  String.format("%s %s of sort %s and price = %.2f",getColor(),name,getSort(),getCost());
    }
}
