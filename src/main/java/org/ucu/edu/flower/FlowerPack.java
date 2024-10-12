package org.ucu.edu.flower;

import lombok.Getter;

@Getter
public class FlowerPack {

    private final Flower flower;
    private final int amount;

    public FlowerPack(Flower flower, int amount) {
        this.flower = new Flower(flower);
        this.amount = amount;
    }

    public double getPrice() {
        return this.flower.getPrice() * this.amount;
    }

}
