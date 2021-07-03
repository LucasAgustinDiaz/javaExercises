package ClassesExercise.model;

import Interface.IVehiculo;

public class Motocicleta implements IVehiculo {
    private Double velocidad;
    private Double aceleracion;
    private Double anguloDeGiro;
    private String patente;
    private Integer peso;
    private Integer ruedas;

    public Motocicleta(Double velocidad, Double aceleracion, Double anguloDeGiro, String patente) {
        this.velocidad = velocidad;
        this.aceleracion = aceleracion;
        this.anguloDeGiro = anguloDeGiro;
        this.patente = patente;
        this.peso = 300;
        this.ruedas = 2;
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando a fondo");
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getRuedas() {
        return ruedas;
    }

    public void setRuedas(Integer ruedas) {
        this.ruedas = ruedas;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    public Double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(Double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public Double getAnguloDeGiro() {
        return anguloDeGiro;
    }

    public void setAnguloDeGiro(Double anguloDeGiro) {
        this.anguloDeGiro = anguloDeGiro;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "velocidad=" + velocidad +
                ", aceleracion=" + aceleracion +
                ", anguloDeGiro=" + anguloDeGiro +
                ", patente='" + patente + '\'' +
                '}';
    }
}
