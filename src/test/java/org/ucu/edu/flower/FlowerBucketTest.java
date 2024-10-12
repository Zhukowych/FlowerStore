package org.ucu.edu.flower;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Random;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;
    private static final double SAMPLE_PRICE = 10;
    private static final int SAMPLE_QUANTITY = 10;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Flower(FlowerType.ROSE);
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.getPrice());
    }

    @Test
    public void testPriceBucketRemove() {
        Flower flower = new Flower(FlowerType.TULIP);
        flower.setPrice(SAMPLE_PRICE);
        FlowerPack flowerPack = new FlowerPack(flower, SAMPLE_QUANTITY);
        flowerBucket.add(flowerPack);
        Assertions.assertEquals(SAMPLE_PRICE * SAMPLE_QUANTITY, flowerBucket.getPrice());
        flowerBucket.remove(flowerPack);
        Assertions.assertTrue(flowerBucket.getPacks().isEmpty());
    }

}
