package ClassesExercise.model;

import Interface.Precedable;

// Crear la clase Persona, con los atributos
// String nombre, e
// int dni,
// sus métodos de acceso y los constructores que consideres adecuados.
public class Persona implements Precedable {

    String nombre;
    int dni;

    // Constructors
    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Persona() {
    }

    @Override
    public boolean precedeA(Object p) {
        return ((Persona) p).getDni() > this.getDni();
    }


    //Getters and Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String toString() {
        return this.nombre + " | " + this.dni;
    }

    /*
     * o1 == o2 then 0; o1 < o2 then -1; o1 > o2 then 1
     * @param o1
     * @param o2
     * @return
     */
   // @Override
   // public int compare(Object o1, Object o2) {
   //     return ((Persona) o1).precedeA(o2) ? -1: ((Persona) o1).getDni() ==  ((Persona) o1).getDni() ? 0 : 1;
   // }
}
