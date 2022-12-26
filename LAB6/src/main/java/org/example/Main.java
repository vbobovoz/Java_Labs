package org.example;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>(Singleton.getInstance("input.txt").getInfo());

        Cheap cheapDirector = new Cheap();
        DDirector mediumDirector = new Medium(cheapDirector);
        DDirector expensiveDirector = new Expensive(mediumDirector);

        System.out.println("\nIn total will be created:");
        System.out.println("Model: Cheap       Count: " + hm.get("Cheap"));
        System.out.println("Model: Medium      Count: " + hm.get("Medium"));
        System.out.println("Model: Expensive   Count: " + hm.get("Expensive") + "\n");

        for(int i = 0; i < hm.get("Cheap"); ++i) {
            System.out.println("---------- CHEAP #" + (i + 1) + " ----------");
            cheapDirector.create();
        }

        for(int i = 0; i < hm.get("Medium"); ++i) {
            System.out.println("---------- Medium #" + (i + 1) + " ----------");
            mediumDirector.create();
        }

        for(int i = 0; i < hm.get("Expensive"); ++i) {
            System.out.println("---------- Expensive #" + (i + 1) + " ----------");
            expensiveDirector.create();
        }
    }
}