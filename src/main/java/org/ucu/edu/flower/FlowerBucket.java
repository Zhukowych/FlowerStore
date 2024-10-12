package org.ucu.edu.flower;

import lombok.NoArgsConstructor;

import java.util.ArrayList;

@NoArgsConstructor
public class FlowerBucket {

    private ArrayList<FlowerPack> packs = new ArrayList<>();

    public ArrayList<FlowerPack> getPacks() {
        return new ArrayList<>(packs);
    }

    public void add(FlowerPack pack) {
        packs.add(pack);
    }

    public void remove(FlowerPack pack) {packs.remove(pack);}

    public double getPrice() {
        double totalPrice = 0;

        for (FlowerPack pack : packs) {
            totalPrice += pack.getPrice();
        }

        return totalPrice;
    }

}
