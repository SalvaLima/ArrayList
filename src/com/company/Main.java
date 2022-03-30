package com.company;

import java.util.*;

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

        System.out.println(System.lineSeparator());

        for (Cliente c: clientes) {
            System.out.println(c);
        }

        System.out.println(System.lineSeparator());


        Iterator<Cliente> iterator = clientes.iterator();

        while (iterator.hasNext()) {
            Cliente p =  iterator.next();
            if (p.getEdad() == 18){
                iterator.remove();
            }
        }


        System.out.println(System.lineSeparator());



        ListIterator <Cliente> listIterator = clientes.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println(System.lineSeparator());

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }


    }
}
