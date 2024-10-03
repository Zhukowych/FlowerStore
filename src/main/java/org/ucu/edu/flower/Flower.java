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

}
