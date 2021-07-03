package ClassesExercise.model;

public class Libro {

    // Attributes
    private String nombre;
    private int id;
    private String escritor;
    private boolean prestado;

    // Constructor/s
    public Libro() {}

    public Libro(String nombre, int id, String escritor, boolean prestado) {
        this.nombre = nombre;
        this.id = id;
        this.escritor = escritor;
        this.prestado = prestado;
    }

    public Libro(Libro libro) {
        this.nombre = libro.nombre;
        this.escritor = libro.escritor;
        this.id = libro.id;
        this.prestado = libro.prestado;
    }

    public void prestar(){
        this.prestado = true;
    }

    public void devolver(){
        this.prestado = false;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + " | "
                + "Libro: " + this.nombre + " | "
                + "Escrito: " + this.escritor
                + "En Stock: " + (prestado ? "No" : "Si");
    }
}
