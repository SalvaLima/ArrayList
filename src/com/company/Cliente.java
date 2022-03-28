package com.company;

import java.util.Objects;

public class Cliente {

    private String nombre;
    private String dni;
    private int edad;

    public Cliente() {

         this.nombre = "Lydia";
         this.dni = "20096321K";
         this.edad = 18;
    }

    public Cliente(String DNI){

        this.dni = DNI;
    }

    public Cliente(String nombre, String DNI , int edad){

        this.nombre = nombre;
        this.dni = DNI;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return dni;
    }

    public void setDNI(String DNI) {
        this.dni = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object obj){

        boolean resultado = false;

        if(obj instanceof Cliente) {
            Cliente cliente = (Cliente) obj;
            resultado = (this.dni.equals(cliente.dni));
        }
        return resultado;
    }


    public String toString(){
        return nombre + " " + " " +dni + " " + edad;
    }
}
