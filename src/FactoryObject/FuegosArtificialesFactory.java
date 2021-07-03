package FactoryObject;

import ClassesExercise.model.Automovil;
import ClassesExercise.model.FuegosAtificiales.Bengala;
import ClassesExercise.model.FuegosAtificiales.Cohete;
import ClassesExercise.model.FuegosAtificiales.Petardo;
import ClassesExercise.model.Motocicleta;
import Interface.IFuegoArtificial;
import Interface.IVehiculo;

public class FuegosArtificialesFactory {
    private static int countBengalas = 0;
    private static int countCohete= 0;
    private static int countPetardos = 0;
    public static IFuegoArtificial generateFuegoArt(int type) {
        String codigoBengala = "BEN ";
        String codigoCohete = "COH ";
        String codigoPetardo = "PET ";

        IFuegoArtificial fabricado;
        switch (type) {
            case 1:
                codigoBengala += countBengalas++;
                fabricado = new Bengala(codigoBengala);
                break;
            case 2:
                codigoCohete += countCohete++;
                fabricado = new Cohete(codigoCohete);
                break;
            default:
                codigoPetardo += countPetardos++;
                fabricado = new Petardo(codigoPetardo);
                break;
        }
        return fabricado;
    }

}
