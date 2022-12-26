package org.example;

public class Cheap implements DDirector {
    @Override
    public String create() {
        Director director = new Director();
        CoffeeMakerManualBuilder coffeeMakerManualBuilder = new CoffeeMakerManualBuilder();
        director.constuctCheap(coffeeMakerManualBuilder);
        System.out.println(" - CoffeeMakerManual built - \n" + coffeeMakerManualBuilder.getResult().print());
        return "Cheap";
    }
}
