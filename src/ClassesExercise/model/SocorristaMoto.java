package ClassesExercise.model;

import Interface.ISocorrista;

public class SocorristaMoto implements ISocorrista<Motocicleta> {
    @Override
    public void socorrer(Motocicleta motocicleta) {
        System.out.println("Socorriendo moto: "+ motocicleta.getPatente());
    }
}
