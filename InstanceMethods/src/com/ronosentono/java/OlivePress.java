package com.ronosentono.java;

import com.ronosentono.java.model.Olive;

import java.util.List;

public class OlivePress {

    public int getOil(List<Olive> olives) {

        int totalOil = 0;

        for (Olive o : olives) {
            System.out.println(o.getName());
            totalOil += o.getOil();
        }

        return totalOil;

    }

}
