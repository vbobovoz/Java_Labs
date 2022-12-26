package org.example;

public class CoffeeMakerBuilder implements Builder {
    private CoffeeMakerType type;
    private String water_capacity;
    private String coffee_capacity;
    private String cup_height;
    private String power;
    private String material;

    public void setCoffee_maker_type(CoffeeMakerType type) {
        this.type = type;
    }

    @Override
    public void setWater_capacity(String water_capacity) {
        this.water_capacity = water_capacity;
    }

    @Override
    public void setCoffee_capacity(String coffee_capacity) {
        this.coffee_capacity = coffee_capacity;
    }

    @Override
    public void setCup_height(String cup_height) {
        this.cup_height = cup_height;
    }

    @Override
    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public void setMaterial(String material) {
        this.material = material;
    }

    public CoffeeMaker getResult() {
        return new CoffeeMaker(type, water_capacity, coffee_capacity, cup_height, power, material);
    }
}
