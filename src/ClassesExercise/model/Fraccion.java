package ClassesExercise.model;

import util.MathUtil;

//TODO convert only sign in the numerator, ex: not 3/-4, change to -3/4
public class Fraccion {

    // Attributes
    private int numerador;
    private int denominador;

    // Constructor/s
    public Fraccion() {
    }

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public Fraccion(Fraccion f) {
        this.numerador = f.numerador;
        this.denominador = f.denominador;
    }

    // Methods
    public Fraccion sumar(Fraccion fraccion) {
        int n = fraccion.getNumerador() * this.getDenominador() + this.getNumerador() * fraccion.getDenominador();
        int d = fraccion.getDenominador() * this.getDenominador();
        Fraccion result = new Fraccion(n,d);
        result.factorizar();
        return result;
    }

    public Fraccion sumar(int numero) {
        return sumar(new Fraccion(numero,1));
    }

    public Fraccion restar(Fraccion fraccion) {
        return sumar(new Fraccion(-fraccion.getNumerador(), fraccion.getDenominador()));
    }

    public Fraccion restar(int numero) {
        return sumar(-numero);
    }

    public Fraccion multiplicar(Fraccion fraccion) {
        Fraccion result = new Fraccion();
        result.setNumerador(this.numerador * fraccion.getNumerador());
        result.setDenominador(this.denominador * fraccion.getDenominador());
        result.factorizar();
        return result;
    }

    public Fraccion multiplicar(int numero) {
        return multiplicar(new Fraccion(numero,1));
    }

    public Fraccion dividir(Fraccion fraccion) {
        Fraccion result = new Fraccion();
        result.setNumerador(this.numerador * fraccion.getDenominador());
        result.setDenominador(this.denominador * fraccion.getNumerador());
        result.factorizar();
        return result;
    }

    public Fraccion dividir(int numero) {
        return dividir(new Fraccion(numero, 1));
    }

    public void factorizar() {
        int mcd = MathUtil.mcd(numerador,denominador);
        this.numerador = this.numerador / mcd;
        this.denominador = this.denominador / mcd;
    }

    // Getters and Setters
    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public String toString() {
        return numerador + "/" + denominador;
    }
}
