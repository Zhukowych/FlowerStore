package org.ucu.edu.flower;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Flower {

    private FlowerType flowerType;
    private FlowerColor color;
    private double price;
    private double sepalLength;

    public Flower(FlowerType flowerType) {
        this.flowerType = flowerType;
    }


    public Flower(Flower flower) {
        this.flowerType = flower.flowerType;
        this.color = flower.color;
        this.price = flower.price;
        this.sepalLength = flower.sepalLength;
    }

    public String getColor() {
        return this.color.getRgb();
    }

    public FlowerSpecification getSpecification() {
        return new FlowerSpecification(this.flowerType, this.color);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Flower flower = (Flower) obj;

        return this.flowerType.equals(flower.flowerType) &&
                this.color.equals(flower.color) &&
                this.price == flower.price &&
                this.sepalLength == flower.sepalLength;
    }

}
