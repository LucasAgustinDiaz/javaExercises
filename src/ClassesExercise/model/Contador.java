package ClassesExercise.model;

public class Contador {

    private int valor;

    // Constructor
    public Contador(){}
    public Contador(int init) { valor = init;}
    public Contador(Contador c) { valor = c.getValor();}

    // Increment step default = 1
    public void incrementar(){this.valor++;}

    // Increment with a step
    public void incrementar(int step) {this.valor +=step;}

    // Decrement step default = 1
    public void decrementar(){this.valor--;}

    // Decrement with a step
    public void decrementar(int step) {this.valor -=step;}

    // Getters and Setters
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
