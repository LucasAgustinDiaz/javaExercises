package ClassesExercise.model.FuegosAtificiales;

import Interface.IFuegoArtificial;

public class Cohete implements IFuegoArtificial {
    private String codigo;
    private String tipo;

    public Cohete(String codigo) {
        this.codigo = codigo;
        this.tipo = "Cohete";

    }

    @Override
    public void makeExplotion() {
        System.out.println("Cohete dice: BANG!!!!!!!!!");
    }

    @Override
    public void presentarme(){
        System.out.println("Soy un Cohete");
    }

    @Override
    public void tooString() {
        System.out.println("Petardo{" +
                "codigo='" + codigo + '\'' +
                ", tipo='" + tipo + '\'' +
                '}');
    }
}
