package org.ucu.edu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.ucu.edu.flower.Flower;
import org.ucu.edu.flower.FlowerColor;
import org.ucu.edu.flower.FlowerSpecification;
import org.ucu.edu.flower.FlowerType;

import java.util.ArrayList;

public class StoreTest {

    private Flower flowerRose;
    private Flower flowerTulip;
    private Flower flowerChamomile;
    private Store store;
    private ArrayList<Flower> flowers;

    private static final double SAMPLE_PRICE = 10;
    private static final double SAMPLE_SEPTAL_LENGTH = 10;

    @BeforeEach
    public void init() {
        flowerRose = new Flower(FlowerType.ROSE, FlowerColor.RED, SAMPLE_PRICE, SAMPLE_SEPTAL_LENGTH);
        flowerTulip = new Flower(FlowerType.TULIP, FlowerColor.RED, SAMPLE_PRICE, SAMPLE_SEPTAL_LENGTH);
        flowerChamomile = new Flower(FlowerType.CHAMOMILE, FlowerColor.RED, SAMPLE_PRICE, SAMPLE_SEPTAL_LENGTH);
        flowers = new ArrayList<>();
        flowers.add(flowerRose);
        flowers.add(flowerTulip);
        flowers.add(flowerChamomile);

        store = new Store();
        store.addFlower(flowerRose);
        store.addFlower(flowerTulip);
        store.addFlower(flowerChamomile);
    }

    @Test
    public void testStoreCreation() {
       Assertions.assertEquals(store.getFlowers(), flowers);
    }

    @Test
    public void testFlowerRemoval() {
        store.removeFlower(flowerRose);
        store.removeFlower(flowerTulip);
        store.removeFlower(flowerChamomile);
        Assertions.assertTrue(store.getFlowers().isEmpty());
    }

    @Test
    public void testSearch() {
        FlowerSpecification roseSpecification = flowerRose.getSpecification();
        ArrayList<Flower> expectedSearch = new ArrayList<>();
        expectedSearch.add(flowerRose);
        Assertions.assertEquals(store.search(roseSpecification), expectedSearch);
    }

}
