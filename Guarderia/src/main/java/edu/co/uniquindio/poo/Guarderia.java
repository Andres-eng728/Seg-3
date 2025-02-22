package edu.co.uniquindio.poo;

import java.util.ArrayList;

public class Guarderia {
    private String Nombre;
    public String Direccion;
    public ArrayList<Estudiante> ListaEstudiantes;
    ArrayList<Estudiante> Estudiantemayor5 = new ArrayList<>();




    public Guarderia(String Nombre, String Direccion) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.ListaEstudiantes = new ArrayList<>();
        this.Estudiantemayor5 = new ArrayList<>();
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return ListaEstudiantes;
    }

    public ArrayList<Estudiante> getEstudiantemayor5() {
        return Estudiantemayor5;
    }

    public void setEstudiantemayor5(ArrayList<Estudiante> estudiantemayor5) {
        Estudiantemayor5 = estudiantemayor5;
    }

    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        ListaEstudiantes = listaEstudiantes;
    }

    public void agregarEstudiante(Estudiante newestudiante){
        ListaEstudiantes.add(newestudiante);
    }
    public void eliminarEstudiante(Estudiante estudianteEliminar){
        ListaEstudiantes.remove(estudianteEliminar);
    }

    public void actualizarEstudiante(Estudiante estudianteActualizar){

        for (Estudiante indexEstudiante : ListaEstudiantes) {
            if (indexEstudiante.getId().equals(estudianteActualizar.getId())) {
                indexEstudiante.setNombre(estudianteActualizar.getNombre());
                indexEstudiante.setAlergias(estudianteActualizar.getAlergias());
                indexEstudiante.setEdad(estudianteActualizar.getEdad());
                indexEstudiante.setGenero(estudianteActualizar.getGenero());
                indexEstudiante.setNombreAcudiente(estudianteActualizar.getNombreAcudiente());
                indexEstudiante.setTelefonoAcudiente(estudianteActualizar.getTelefonoAcudiente());
                break;
            }
        }
    }

    public ArrayList<Estudiante>filtrarmayores5(ArrayList<Estudiante> ListaEstudiantes){
        ArrayList<Estudiante> Estudiantemayor5 = new ArrayList<>();
        for (Estudiante estudiante : ListaEstudiantes) {
            if(estudiante.getEdad()>5){
                Estudiantemayor5.add(estudiante);
            }

        }
        return  Estudiantemayor5;
    }


    @Override
    public String toString() {
        return "Guarderia{" +
                "Nombre='" + Nombre + '\'' +
                ", Direccion='" + Direccion + '\'' +
                ", ListaEstudiantes=" + ListaEstudiantes +
                '}';
    }
}
