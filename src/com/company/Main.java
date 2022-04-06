package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente Lydia = new Cliente();
        Cliente Salva = new Cliente("Salva","20091571J",19);
        Cliente Marta = new Cliente("Marta","4712042L",18);
        Cliente Pablo = new Cliente("20097421K");
        clientes.add(Lydia);
        clientes.add(Salva);
        clientes.add(Marta);
        clientes.add(Pablo);


        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).toString());
        }

        System.out.println(clientes.size());

        System.out.println(clientes.isEmpty());

        System.out.println(clientes.contains(new Cliente()));

        System.out.println(clientes.contains(new Cliente("Salva","20091572J",19)));

        System.out.println(clientes.contains(new Cliente("20097421K")));

        Object [] tablaClientes = clientes.toArray();

        System.out.println(Arrays.toString(tablaClientes));

        Cliente [] clientes1 = clientes.toArray(new Cliente[0]);

        System.out.println(Arrays.toString(clientes1));

        System.out.println(((Cliente) tablaClientes[1]).getNombre());

        System.out.println(clientes1[1].getNombre());

        ArrayList<Cliente>prueba = new ArrayList<>();

        prueba.add(Salva);
        prueba.add(Marta);
        prueba.add(Lydia);

        Collections.sort(prueba,new CompareNombre());

        System.out.println(prueba);

        Collections.reverse(prueba);

        System.out.println(prueba);


    }
}
