package com.senla.training.flowershop.runner;

import com.senla.training.flowershop.bouquet.*;
import com.senla.training.flowershop.flowers.*;

public class Main {

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet(3);
        bouquet.addFlower(new Rose("Amsterdam",100,"Red"));
        bouquet.addFlower(new Tulip("Amsterdam",50,"Yellow"));
        bouquet.addFlower(new Narcissus("Amsterdam",20,"Yellow"));
        System.out.println(bouquet);
    }
}
