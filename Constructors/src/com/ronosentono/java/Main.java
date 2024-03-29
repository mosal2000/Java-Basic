package com.ronosentono.java;

import java.util.ArrayList;
import java.util.List;

import com.ronosentono.java.model.Olive;

public class Main {

    public static void main(String[] args) {

        List<Olive> olives = new ArrayList<>();
        olives.add(new Olive("Kalamata", 0x2E0854, 3));
        olives.add(new Olive("Kalamata", 0x2E0854, 3));
        olives.add(new Olive("Ligurian", 0x000000, 2));
        olives.add(new Olive("Ligurian", 0x000000, 2));
        olives.add(new Olive("Ligurian", 0x000000, 2));
        olives.add(new Olive("Ligurian", 0x000000, 2));

        OlivePress press = new OlivePress();
        int totalOil = press.getOil(olives);
        System.out.println("Total olive oil: " + totalOil);

    }

}

