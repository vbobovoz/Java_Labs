package org.example;

public class Decorator implements DDirector {
    private DDirector director;

    public  Decorator(DDirector director) {
        this.director = director;
    }

    @Override
    public String create() {
        this.director.create();
        return "Cheap";
    }
}
