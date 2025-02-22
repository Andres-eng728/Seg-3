package edu.co.uniquindio.poo;

import java.util.Date;

public class Empleado {
    private String nombre;
    private String NumeroIdentificacion;
    private String correo;
    private String puesto;
    private String fechaContratacion;
    private String telefono;

    public Empleado(String nombre, String NumeroIdentificacion, String correo, String puesto,String telefono, String fechaContratacion) {
        this.nombre = nombre;
        this.NumeroIdentificacion = NumeroIdentificacion;
        this.correo = correo;
        this.puesto = puesto;
        this.fechaContratacion = fechaContratacion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroIdentificacion() {
        return NumeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        NumeroIdentificacion = numeroIdentificacion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }



    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", NumeroIdentificacion='" + NumeroIdentificacion + '\'' +
                ", correo='" + correo + '\'' +
                ", puesto='" + puesto + '\'' +
                ", fechaContratacion=" + fechaContratacion +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
