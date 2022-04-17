package com.company;

import java.util.Objects;

public class Cliente implements Comparable<Cliente> {

    private String nombre;
    private String dni;
    private int edad;
    private int antiguedad;

    public Cliente() {

         this.nombre = "Lydia";
         this.dni = "20096321K";
         this.edad = 18;
         this.antiguedad = 3;
    }

    public Cliente(String DNI){

        this.dni = DNI;
    }

    public Cliente(String nombre, String DNI , int edad,int antiguedad){

        this.nombre = nombre;
        this.dni = DNI;
        this.edad = edad;
        this.antiguedad = antiguedad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
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
        return nombre + " " + " " +dni + " " + edad + " " + antiguedad;
    }

    @Override
    public int compareTo(Cliente o) {
        Integer edad1 = this.antiguedad;
        Integer edad2 = o.getAntiguedad();
       return edad1.compareTo(edad2);
    }
}
