package com.company;

import java.util.Comparator;

public class CompareNombre implements Comparator<Cliente> {


    @Override
    public int compare(Cliente o1, Cliente o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}
