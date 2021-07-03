package ClassesExercise.test;

import ClassesExercise.model.Automovil;
import ClassesExercise.model.Carrera;
import ClassesExercise.model.Motocicleta;
import FactoryObject.VehiculoFactory;
import Interface.IVehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CarreraTest {
    public static void main(String[] args) {


        List<IVehiculo> autosGenerados = new ArrayList<IVehiculo>();
        List<IVehiculo> motosGenerados = new ArrayList<IVehiculo>();
        Random r = new Random();
        for (int i = 0; i < 25 ; i++) {
            autosGenerados.add(VehiculoFactory.generateVehiculo(1,r.nextDouble(),r.nextDouble(),r.nextDouble()));
            motosGenerados.add(VehiculoFactory.generateVehiculo(2,r.nextDouble(),r.nextDouble(),r.nextDouble()));
        }


        // carrera test
        Carrera carrera = new Carrera(10000,"5000 U$D","TC14",20,20);

        // añadiendo autos
        autosGenerados.forEach(e -> carrera.darDeAltaAuto((Automovil) e));
        // añadiendo motos
        motosGenerados.forEach(e -> carrera.darDeAltaMoto((Motocicleta) e));



        // comprobar cantidad de vehiculos
        System.out.println("la lista de autos es de: " + carrera.countAutos());
        System.out.println("la lista de motos es de: " + carrera.countMotos());

        // test removed
        carrera.eliminarVehiculo(autosGenerados.get(2));
        carrera.eliminarVehiculo(motosGenerados.get(10));

        // test remove patente
        carrera.eliminarVehiculoConPatente(((Automovil) autosGenerados.get(1)).getPatente());
        carrera.eliminarVehiculoConPatente(((Motocicleta) motosGenerados.get(1)).getPatente());

        // comprobar cantidad de vehiculos
        System.out.println("la lista de autos es de: " + carrera.countAutos());
        System.out.println("la lista de motos es de: " + carrera.countMotos());
        // ver ganador
        System.out.println("El ganador del premio de " + carrera.getPremioEnDolares() + "FUE: \n " + carrera.ganadorCarreraAutomovil().toString());
        System.out.println("El ganador de la carrera de MOTOS FUE: \n " +carrera.ganadorCarreraMotos().toString());

        // socorrer
        carrera.soccorrerAuto((Automovil) autosGenerados.get(6));
        carrera.soccorrerMoto((Motocicleta) motosGenerados.get(1));
    }
}
