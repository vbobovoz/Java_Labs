package org.example;

public class Medium extends Decorator {
    public Medium(DDirector director) {
        super(director);
    }

    @Override
    public String create() {
        Director director = new Director();
        CoffeeMakerManualBuilder coffeeMakerManualBuilder = new CoffeeMakerManualBuilder();
        director.constuctMedium(coffeeMakerManualBuilder);
        System.out.println(" - CoffeeMakerManual built - \n" + coffeeMakerManualBuilder.getResult().print());
        return "Medium";
    }
}
