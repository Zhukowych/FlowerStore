package org.ucu.edu;

import lombok.NoArgsConstructor;
import org.ucu.edu.flower.Flower;
import org.ucu.edu.flower.FlowerSpecification;

import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
public class Store {

    private ArrayList<Flower> flowers = new ArrayList<>();

    public ArrayList<Flower> getFlowers() {
        return new ArrayList<>(flowers);
    }

    public void addFlower(Flower flower) {
        flowers.add(flower);
    }

    public void removeFlower(Flower flower) {
        flowers.remove(flower);
    }

    public List<Flower> search(FlowerSpecification specification) {
        ArrayList<Flower> foundFlowers = new ArrayList<>();

        for (Flower flower : flowers) {
            if (specification.match(flower.getSpecification()))
                foundFlowers.add(flower);
        }

        return foundFlowers;
    }

}
