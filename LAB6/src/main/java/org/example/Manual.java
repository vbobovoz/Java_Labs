package org.example;

public class Manual {
    private final CoffeeMakerType type;
    private final String water_capacity;
    private final String coffee_capacity;
    private final String cup_height;
    private final String power;
    private final String material;

    public Manual(CoffeeMakerType type, String water_capacity, String coffee_capacity, String cup_height, String power, String material) {
        this.type = type;
        this.water_capacity = water_capacity;
        this.coffee_capacity = coffee_capacity;
        this.cup_height = cup_height;
        this.power = power;
        this.material = material;
    }

    public String print() {
        String info = "";
        info += "Type of CoffeeMaker: " + type + "\n";
        info += "WaterCapacity      : " + water_capacity + "\n";
        info += "CoffeeCapacity     : " + coffee_capacity + "\n";
        info += "CupHeight          : " + cup_height + "\n";
        info += "Power              : " + power + "\n";
        info += "Material           : " + material + "\n";
        return info;
    }
}
