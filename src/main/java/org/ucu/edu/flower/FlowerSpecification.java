package org.ucu.edu.flower;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
@AllArgsConstructor
public final class FlowerSpecification {

    private final FlowerType flowerType;
    private final FlowerColor color;


    public boolean match(FlowerSpecification flowerSpecification) {
        if (flowerType != null && flowerSpecification.getFlowerType() != flowerType) {
            return false;
        }

        if (color != null && flowerSpecification.getColor() != color) {
            return false;
        }

        return true;
    }

}
