package edu.co.uniquindio.poo;

public class Estudiante {
    private String Nombre;
    private int Edad;
    private String Genero;
    private String Id;
    private String Alergias;
    private String NombreAcudiente;
    private String TelefonoAcudiente;

    public Estudiante(String Nombre,int Edad,String Genero,String Id,String Alergias,String NombreAcudiente,String TelefonoAcudiente) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Genero = Genero;
        this.Id = Id;
        this.Alergias = Alergias;
        this.NombreAcudiente = NombreAcudiente;
        this.TelefonoAcudiente = TelefonoAcudiente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getAlergias() {
        return Alergias;
    }

    public void setAlergias(String alergias) {
        Alergias = alergias;
    }

    public String getNombreAcudiente() {
        return NombreAcudiente;
    }

    public void setNombreAcudiente(String nombreAcudiente) {
        NombreAcudiente = nombreAcudiente;
    }

    public String getTelefonoAcudiente() {
        return TelefonoAcudiente;
    }

    public void setTelefonoAcudiente(String telefonoAcudiente) {
        TelefonoAcudiente = telefonoAcudiente;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Genero='" + Genero + '\'' +
                ", Id='" + Id + '\'' +
                ", Alergias='" + Alergias + '\'' +
                ", NombreAcudiente='" + NombreAcudiente + '\'' +
                ", TelefonoAcudiente='" + TelefonoAcudiente + '\'' +
                '}';
    }
}
