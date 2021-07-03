package FactoryObject;

import ClassesExercise.model.Automovil;
import ClassesExercise.model.Motocicleta;
import Interface.IVehiculo;

public class VehiculoFactory<T> {
    private static int count = 0;
    public static IVehiculo generateVehiculo(int type, Double velocidad, Double aceleracion, Double anguloDeGiro){
        String matricula = "QA PDA ";
        ;
        matricula += count++;

        IVehiculo fabricado;
        if (type == 1) {
            fabricado = new Automovil(velocidad,aceleracion,anguloDeGiro,matricula);
        }
        else {
            fabricado = new Motocicleta(velocidad,aceleracion,anguloDeGiro,matricula);
        }

        return fabricado;
    }

}
