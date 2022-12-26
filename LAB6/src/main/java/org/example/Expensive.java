package org.example;

public class Expensive extends Decorator {
    public Expensive(DDirector director) {
        super(director);
    }

    @Override
    public String create() {
        Director director = new Director();
        CoffeeMakerManualBuilder coffeeMakerManualBuilder = new CoffeeMakerManualBuilder();
        director.constuctExpensive(coffeeMakerManualBuilder);
        System.out.println(" - CoffeeMakerManual built - \n" + coffeeMakerManualBuilder.getResult().print());
        return "Expensive";
    }
}
