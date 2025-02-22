package edu.co.uniquindio.poo;

public class Empresa {
    private String nombre;
    private String NIT;

    public Empresa(String nombre, String NIT) {
        this.nombre = nombre;
        this.NIT = NIT;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }


}
