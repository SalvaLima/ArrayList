package com.company;

import com.sun.source.tree.Tree;

import java.util.*;



public class Main {

    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        Cliente Lydia = new Cliente();
        Cliente Salva = new Cliente("Salva", "20091571J", 19, 1);
        Cliente Marta = new Cliente("Marta", "4712042L", 18, 2);
        Cliente Pablo = new Cliente("Pablo", "20841516K", 20, 3);
        Cliente Diego = new Cliente("Diego", "30094821S", 22, 4);
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

        System.out.println(clientes.contains(new Cliente("Salva", "20091572J", 19, 12)));

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
        arbolCliente.add(new Cliente("Salva", "20091571J", 18, 1));
        arbolCliente.add(new Cliente("Pablo", "2009iaosht", 20, 2));
        arbolCliente.add(new Cliente("Chema", "2009asofaopj", 21, 3));

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

        ArrayList<Cliente> listaClientes1 = new ArrayList<>();
        listaClientes1.add(Marta);
        listaClientes1.add(Pablo);

        ArrayList<Cliente> listaClientes2 = new ArrayList<>();
        listaClientes2.add(Salva);
        listaClientes2.add(Diego);

        System.out.println(nuevaFusion(listaClientes1, listaClientes2));

        ArrayList<Integer> numRandom = new ArrayList<>();

        System.out.println(listaAleatoria(numRandom));

        ArrayList<Integer> numRandom2 = new ArrayList<>();

        System.out.println(listaAleatoria10(numRandom2));

        ArrayList<String> nombres = new ArrayList<>();

        System.out.println(listaNombre(nombres));

        TreeSet<String> nombres2 = new TreeSet<>();

        System.out.println(listaNombraOrdenada(nombres2));

    }

    public static List<Integer> fusion(List<Integer> lista1, List<Integer> lista2) {

        List<Integer> fusionAux = new ArrayList<Integer>();

        int auxLista1 = 0;

        int auxLista2 = 0;

        do {
            if (lista1.get(auxLista1) < lista2.get(auxLista2)) {
                fusionAux.add(lista1.get(auxLista1));
                auxLista1++;
            } else {
                fusionAux.add(lista2.get(auxLista2));
                auxLista2++;
            }
        } while (auxLista1 < lista1.size() && auxLista2 < lista2.size());

        if (auxLista1 == lista1.size()) {
            fusionAux.addAll(lista2.subList(auxLista2, lista2.size()));
        } else {
            fusionAux.addAll(lista1.subList(auxLista1, lista1.size()));
        }
        return fusionAux;
    }

    public static List<Cliente> nuevaFusion(List<Cliente> lista1, List<Cliente> lista2) {

        List<Cliente> fusionAux = new ArrayList<>();

        int auxLista1 = 0;
        int auxLista2 = 0;

        int resultado;

        do {
            resultado = lista1.get(auxLista1).compareTo(lista2.get((auxLista2)));

            if (resultado < 0) {
                fusionAux.add(lista1.get(auxLista1));
                auxLista1++;
            } else {
                fusionAux.add(lista2.get(auxLista2));
                auxLista2++;
            }

        } while (lista1.size() > auxLista1 && lista2.size() > auxLista2);

        if (lista1.size() == auxLista1) {
            fusionAux.addAll(lista2.subList(auxLista2, lista2.size()));
        } else {
            fusionAux.addAll(lista1.subList(auxLista1, lista1.size()));
        }
        return fusionAux;
    }

    public static List<Integer> listaAleatoria(List<Integer> lista) {

        for (int i = 0; i < 20; i++) {
            int num = (int) ((Math.random() * 100));
            if (!lista.contains(num)) {

                if (lista.size() == 0) {
                    lista.add(num);
                }

                else {
                    for (int j = 0; j < lista.size(); j++) {
                        if (lista.get(j) > num) {
                            lista.add(j, num);
                            j = lista.size() - 1;
                        }
                        else {
                            if (j == lista.size() - 1) {
                                lista.add(num);
                                j = lista.size() - 1;
                            }
                        }
                    }
                }
            }

            else {
                i--;
            }
        }
        return lista;
    }

    public static List<Integer> listaAleatoria10(List<Integer> lista){

        for (int i = 0; i < 20; i++) {
            int num = (int) ((Math.random() * 10));

                if (lista.size() == 0) {
                    lista.add(num);
                }

                else {
                    for (int j = 0; j < lista.size(); j++) {
                        if (lista.get(j) > num) {
                            lista.add(j, num);
                            j = lista.size() - 1;
                        }
                        else {
                            if (j == lista.size() - 1) {
                                lista.add(num);
                                j = lista.size() - 1;
                            }
                        }
                    }
                }
        }
        return lista;

    }

    public static List<String> listaNombre(List<String> lista){

        String nombre;

        System.out.println("Inserte fin para salir del programa");

        do {
            System.out.println("Inserte un nombre");
            nombre = scn.next().toUpperCase(Locale.ROOT);

            if (lista.size() == 0 && !nombre.equals("FIN")){
                lista.add(nombre);
            }
            else {
                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).equals(nombre)){
                        System.out.println("El nombre es repetido");
                    }

                    else {
                        if (nombre.equals("FIN")){
                            System.out.println("Ha terminado el programa");
                            i = lista.size()-1;
                        }
                        else {
                            lista.add(nombre);
                            i = lista.size()-1;
                        }

                    }
                }
            }

        }while (!nombre.equals("FIN"));

        return lista;

    }

    public static TreeSet<String> listaNombraOrdenada(TreeSet<String > lista){

        String nombre;

        System.out.println("Inserte fin para salir del programa");

        do {
            System.out.println("Inserte un nombre");
            nombre = scn.next().toUpperCase(Locale.ROOT);
            if (!nombre.equals("FIN")){
                lista.add(nombre);
            }
        }while (!nombre.equals("FIN"));

        return lista;

    }

}
