package com.senla.training.flowershop.bouquet;

import com.senla.training.flowershop.flowers.*;

public class Bouquet {
    private int currentIndex = 0;
    private int freePlaces;
    private double price = 0;
    private AFlower[] AFlowers;

    public Bouquet(int aFreePlaces){
        if(aFreePlaces < 1){
            System.out.println("Invalid size for bouquet, creating bouquet of size 3 (default)");
            freePlaces = 3;
        }
        else {
            freePlaces = aFreePlaces;
        }
            AFlowers = new AFlower[freePlaces];
    }

    public boolean addFlower(AFlower AFlower){
        if(AFlower == null){
            System.out.println("Parameter is null ");
            return false;
        }
        if(currentIndex == freePlaces){
            System.out.println("Bouquet is full, can not add "+ AFlower);
            return false;
        }
        AFlowers[currentIndex++] = AFlower;
        price += AFlower.getCost();
        return true;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        if(freePlaces == 0){
            return "Bouquet is empty";
        }
        String result = String.format("Bouquet of price %.2f, consists of:\n",price);
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i < currentIndex;i++){
            if(AFlowers[i] == null){
                break;
            }
            sb.append(AFlowers[i].toString() + "\n");
        }
       return result + sb.toString();
    }
}
