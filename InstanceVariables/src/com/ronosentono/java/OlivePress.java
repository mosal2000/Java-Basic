package com.ronosentono.java;

import com.ronosentono.java.model.Olive;

import java.util.List;

public class OlivePress {

    public int getOil(List<Olive> olives) {
        for (Olive o: olives
        ) {
            System.out.println(o.name);
        }

        return 0;
    }
}
