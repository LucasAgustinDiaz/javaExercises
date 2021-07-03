package ClassesExercise.model;

import Interface.ISocorrista;
import Interface.IVehiculo;

import java.util.ArrayList;
import java.util.List;

public class Carrera {
    private long distancia;
    private String premioEnDolares;
    private String nombre;
    private Integer numeroAutosPermitidos;
    private Integer numeroMotosPermitidas;
    List<Automovil> listaDeAutos;
    List<Motocicleta> listaDeMotos;

    // Socorristas
    ISocorrista socAuto;
    ISocorrista socMoto;


    public Carrera(long distancia, String premioEnDolares, String nombre, Integer numeroAutosPermitidos, Integer numeroMotosPermitidas) {
        this.distancia = distancia;
        this.premioEnDolares = premioEnDolares;
        this.nombre = nombre;
        this.numeroAutosPermitidos = numeroAutosPermitidos;
        this.numeroMotosPermitidas = numeroMotosPermitidas;
        listaDeAutos = new ArrayList<Automovil>();
        listaDeMotos = new ArrayList<Motocicleta>();
        socAuto = new SocorristaAuto();
        socMoto = new SocorristaMoto();
    }

    public void darDeAltaAuto(Automovil automovil){
        // public void darDeAltaAuto(velocidad,aceleracion,AnguloDeGiro,patente);
        if (listaDeAutos.size() < this.numeroAutosPermitidos)
            listaDeAutos.add(automovil);
        else
            System.out.println("No se puede agrear por falta de cupos: " + automovil.toString());
    }

    public void darDeAltaMoto(Motocicleta motocicleta){
        //public void darDeAltaMoto(velocidad,aceleracion,AnguloDeGiro,patente);
        if (listaDeMotos.size() < this.numeroMotosPermitidas)
            listaDeMotos.add(motocicleta);
        else
            System.out.println("No se puede agrear por falta de cupos: " + motocicleta.toString());

    }

    public void eliminarVehiculo(IVehiculo vehículo){
        boolean removed = false;
        if (vehículo.getClass().getSimpleName().equals("Automovil"))
            removed = listaDeAutos.remove(vehículo);
        if (vehículo.getClass().getSimpleName().equals("Motocicleta"))
            removed = listaDeMotos.remove(vehículo);

        System.out.println(removed ? "Se removio correctamente" : "No se encontro");
    };

    public void eliminarVehiculoConPatente(String unaPatente) {
        boolean removed = listaDeAutos.removeIf(el -> el.getPatente().equals(unaPatente));
        if(!removed)
            removed = listaDeMotos.removeIf(mo -> mo.getPatente().equals(unaPatente));

        System.out.println(removed ? "Se removio por patente correctamente" : "No se encontro un vehiculo con esa patente");
    };

    public Motocicleta ganadorCarreraMotos(){
        Motocicleta motocicleta;
        int maxValor = -1;
        if (listaDeMotos.size() > 0) {
            for (int i = 0; i < listaDeMotos.size() ; i++) {
                if (maxValor < aplicarFormulaMoto(listaDeMotos.get(i))){
                    maxValor = i;
                }
            }

        } else {
            System.out.println("No hay ninguna moto registrada");
        }

        return maxValor>=0 ?  listaDeMotos.get(maxValor): null;
    }

    public Automovil ganadorCarreraAutomovil(){
        Automovil motocicleta;
        int maxValor = -1;
        if (listaDeAutos.size() > 0) {
            for (int i = 0; i < listaDeAutos.size() ; i++) {
                if (maxValor < aplicarFormulaAuto(listaDeAutos.get(i))){
                    maxValor = i;
                }
            }

        } else {
            System.out.println("No hay ningun Automovil registrado");
        }

        return maxValor>=0 ?  listaDeAutos.get(maxValor): null;
    }

    private double aplicarFormulaMoto(Motocicleta m){
        double resultado;
        double denominador = m.getAnguloDeGiro()*(m.getPeso()-m.getRuedas()*100);
        if (denominador != 0)
            resultado = m.getVelocidad()*m.getAceleracion()/denominador;
        else
            resultado = 0;
        return resultado;
    }

    private double aplicarFormulaAuto(Automovil m){
        double resultado;
        double numerador = m.getVelocidad()*m.getAceleracion();
        double denominador = m.getAnguloDeGiro()*(m.getPeso()-m.getRuedas()*100);
        if (denominador != 0)
            resultado = numerador/denominador;
        else
            resultado = 0;
        return resultado;
    }

    // metodos soccorristas
    public void soccorrerAuto(Automovil automovil){
        socAuto.socorrer(automovil);
    }

    public void soccorrerMoto(Motocicleta motocicleta){
        socMoto.socorrer(motocicleta);
    }

    public int countAutos(){
        return listaDeAutos.size();
    }

    public int countMotos(){
        return listaDeMotos.size();
    }

    // Getters Setters
    public String getPremioEnDolares() {
        return premioEnDolares;
    }

    public void setPremioEnDolares(String premioEnDolares) {
        this.premioEnDolares = premioEnDolares;
    }

}
