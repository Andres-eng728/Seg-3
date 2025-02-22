package edu.co.uniquindio.poo;

import javax.swing.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int cantidadEstudiantes = 1;

        ArrayList<Estudiante> ListaEstudiantes = new ArrayList<>();


        Estudiante estudiante1 = new Estudiante("Carlos", 4, "Masculino", "ID1234", "Polvo", "Juan Pérez", "3001234567");
        Estudiante estudiante2 = new Estudiante("Ana", 6, "Femenino", "ID5678", "Ninguna", "María Gómez", "3002345678");
        Estudiante estudiante3 = new Estudiante("Luis", 3, "Masculino", "ID9101", "Gluten", "Luis Martínez", "3003456789");
        Estudiante estudiante4 = new Estudiante("Sofía", 4, "Femenino", "ID1123", "Pollen", "Laura Rodríguez", "3004567890");
        Estudiante estudiante5 = new Estudiante("Pedro", 7, "Masculino", "ID1415", "Ninguna", "Miguel Sánchez", "3005678901");


        Estudiante newestudiante = null;
        for (int i = 0; i < cantidadEstudiantes; i++) {
            String nombre = JOptionPane.showInputDialog("Ingrese su nombre:");
            int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad:"));
            String genero = JOptionPane.showInputDialog("Ingrese su genero:");
            String Id = JOptionPane.showInputDialog("Ingrese su id:");
            String alergia = JOptionPane.showInputDialog("Ingrese su alergia:");
            String nombreAcudiente = JOptionPane.showInputDialog("Ingrese nombre del acudiente:");
            String telefonoAcudiente = JOptionPane.showInputDialog("Ingrese telefono del acudiente:");

            newestudiante = new Estudiante(nombre, edad, genero, Id, alergia, nombreAcudiente, telefonoAcudiente);
            JOptionPane.showMessageDialog(null, newestudiante);
            ListaEstudiantes.add(newestudiante);
        }

        JOptionPane.showMessageDialog(null, ListaEstudiantes);

        Guarderia newguarderia = new Guarderia("Pqueños gigantes", "calle 13");
        newguarderia.agregarEstudiante(estudiante1);
        newguarderia.agregarEstudiante(estudiante2);
        newguarderia.agregarEstudiante(estudiante3);
        newguarderia.agregarEstudiante(estudiante4);
        newguarderia.agregarEstudiante(estudiante5);
        newguarderia.agregarEstudiante(newestudiante);

        JOptionPane.showMessageDialog(null, newguarderia);

        ListaEstudiantes.add(newestudiante);
        ListaEstudiantes.add(estudiante1);
        ListaEstudiantes.add(estudiante2);
        ListaEstudiantes.add(estudiante3);
        ListaEstudiantes.add(estudiante4);
        ListaEstudiantes.add(estudiante5);

        ArrayList<Estudiante> Estudiantemayor5 = newguarderia.filtrarmayores5(ListaEstudiantes);
        StringBuilder mensaje = new StringBuilder();
        mensaje.append("Estudiantes mayores de 5 años:\n");
        if (Estudiantemayor5.isEmpty()) {
            mensaje.append("No hay estudiantes mayores de 5 años.");
        } else {
            for (Estudiante estudiante :    Estudiantemayor5) {
                mensaje.append(estudiante.toString()).append("\n");
            }
        }

        // Mostrar el cuadro de diálogo
        JOptionPane.showMessageDialog(null, mensaje.toString(),"Lista de estudiantes",JOptionPane.INFORMATION_MESSAGE);





    }








}