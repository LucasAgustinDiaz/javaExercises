package ClassesExercise.model;

// Crear la clase Celular, con los atributos: número y titular, implementar
// Precedable<Celular> y proceder del mismo modo que lo hicimos con Persona a partir del punto anterior.

import Interface.Precedable;

public class Celular implements Precedable {

    private int numero;
    private Persona titular;

    public Celular(int numero, Persona titular) {
        this.numero = numero;
        this.titular = titular;
    }

    public Celular() {
    }

    @Override
    public boolean precedeA(Object c) {
        return ((Celular) c).getNumero() > this.getNumero();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "numero=" + numero +
                ", titular=" + titular +
                '}';
    }
}
