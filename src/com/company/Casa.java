package com.company;

public class Casa {

    private int numHabitaciones;
    private int metros;
    private String urbanizacion;
    private String calle;
    private int precio;

    public Casa() {

    }

    public Casa(int numHabitaciones, int metros, String urbanizacion, String calle, int precio) {
        this.numHabitaciones = numHabitaciones;
        this.metros = metros;
        this.urbanizacion = urbanizacion;
        this.calle = calle;
        this.precio = precio;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public String getUrbanizacion() {
        return urbanizacion;
    }

    public void setUrbanizacion(String urbanizacion) {
        this.urbanizacion = urbanizacion;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
