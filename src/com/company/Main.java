package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente Lydia = new Cliente();
        Cliente Salva = new Cliente("Salva", "20091571J", 19);
        Cliente Marta = new Cliente("Marta", "4712042L", 18);
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

        System.out.println(clientes.contains(new Cliente("Salva", "20091572J", 19)));

        System.out.println(clientes.contains(new Cliente("20097421K")));

        Object[] tablaClientes = clientes.toArray();

        System.out.println(Arrays.toString(tablaClientes));

        Cliente[] clientes1 = clientes.toArray(new Cliente[0]);

        System.out.println(Arrays.toString(clientes1));

        System.out.println(((Cliente) tablaClientes[1]).getNombre());

        System.out.println(clientes1[1].getNombre());

        ArrayList<Cliente> prueba = new ArrayList<>();

        prueba.add(Salva);
        prueba.add(Marta);
        prueba.add(Lydia);

        Collections.sort(prueba, new CompareNombre());

        System.out.println(prueba);

        Collections.reverse(prueba);

        System.out.println(prueba);

        ArrayList<Cliente> eljoaqui = new ArrayList<>();
        eljoaqui.add(Marta);
        eljoaqui.add(Salva);
        eljoaqui.add(Lydia);

        System.out.println(eljoaqui);

        Set<Cliente> clienteSet = new HashSet<Cliente>(clientes);

        for (Cliente cliente : clienteSet) {
            System.out.println(cliente);
        }

        TreeSet<Cliente> arbolCliente = new TreeSet<>();
        arbolCliente.add(new Cliente("Salva", "20091571J", 18));
        arbolCliente.add(new Cliente("Pablo", "2009iaosht", 20));
        arbolCliente.add(new Cliente("Chema", "2009asofaopj", 21));

        System.out.println(arbolCliente.toString());

        ArrayList<Integer> lista1 = new ArrayList<>();
        lista1.add(2);
        lista1.add(4);
        lista1.add(6);
        lista1.add(8);
        lista1.add(10);

        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(3);
        lista2.add(5);
        lista2.add(7);
        lista2.add(9);

        System.out.println(fusion(lista1, lista2));


    }

    public static List<Integer> fusion(List<Integer> lista1, List<Integer> lista2) {

        List<Integer> fusionAux = new ArrayList<Integer>();

        int auxJ = 0;
        int auxI = 0;

        for (int i = 0; i < lista1.size(); i++) {
            for (int j = 0; j < lista2.size(); j++) {
                if (lista1.get(i) > lista2.get(j)) {
                    auxJ =(lista2.get(j));
                }
                else {
                    auxI = lista1.get(i);
                }
            }
            if (auxJ < auxI){
                fusionAux.add(auxJ);
                fusionAux.add(auxI);
            }

        }
        return fusionAux;
    }
}
