package ClassesExercise.model;

import Interface.ISocorrista;

public class SocorristaAuto implements ISocorrista<Automovil> {
    @Override
    public void socorrer(Automovil automovil) {
        System.out.println("Socorriendo moto: "+ automovil.getPatente());
    }
}
