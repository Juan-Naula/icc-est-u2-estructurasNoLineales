package models;

public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
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

    @Override
    public String toString() {
        return "Persona [Nombre: " + nombre + ", Edad: " + edad + "]";
    }

    @Override
    public int compareTo(Persona o) {
        //this.edad > o.getEdad();
        
        int resulComp = Integer.compare(this.edad, o.getEdad());
        if (resulComp != 0) {
            return resulComp;
        }
        return this.nombre.compareTo(o.getNombre());
    }

    
}
