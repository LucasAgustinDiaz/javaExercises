package ClassesExercise.model.FuegosAtificiales;

import Interface.IFuegoArtificial;

public class Petardo implements IFuegoArtificial {
    private String codigo;
    private String tipo;
    public Petardo(String codigo) {
        this.codigo = codigo;
        this.tipo = "Petardo";
    }

    @Override
    public void makeExplotion() {
        System.out.println("Petardo dice: BUM!!!!!");
    }

    @Override
    public void presentarme(){
        System.out.println("Soy una Petardo");
    }

    @Override
    public void tooString() {
        System.out.println("Petardo{" +
                "codigo='" + codigo + '\'' +
                ", tipo='" + tipo + '\'' +
                '}');
    }
}
