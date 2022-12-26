package org.example;

public class Director {
    public void constuctMedium(Builder builder) {
        builder.setCoffee_maker_type(CoffeeMakerType.MEDIUM_CMAKER);
        builder.setCoffee_capacity("1.5 kg");
        builder.setWater_capacity("15 L");
        builder.setCup_height("17 cm");
        builder.setPower("200");
        builder.setMaterial("Plastic");
    }

    public void constuctCheap(Builder builder) {
        builder.setCoffee_maker_type(CoffeeMakerType.CHEAP_CMAKER);
        builder.setCoffee_capacity("1 kg");
        builder.setWater_capacity("7 L");
        builder.setCup_height("15 cm");
        builder.setPower("200");
        builder.setMaterial("Plastic");
    }

    public void constuctExpensive(Builder builder) {
        builder.setCoffee_maker_type(CoffeeMakerType.EXPENSIVE_CMAKER);
        builder.setCoffee_capacity("2 kg");
        builder.setWater_capacity("20 L");
        builder.setCup_height("18 cm");
        builder.setPower("200");
        builder.setMaterial("Plastic, metal");
    }
}