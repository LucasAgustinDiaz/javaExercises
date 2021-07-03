package ClassesExercise.model.FuegosAtificiales;

import Interface.IFuegoArtificial;

public class Bengala implements IFuegoArtificial {

    private String codigo;
    private String tipo;

    public Bengala(String codigo) {
        this.codigo = codigo;
        this.tipo = "bengala";
    }

    @Override
    public void makeExplotion() {
        System.out.println("Bengala dice: PUM!!!!!!!");
    }

    @Override
    public void presentarme(){
        System.out.println("Soy una Bengala");
    }

    @Override
    public void tooString() {
        System.out.println("Petardo{" +
                "codigo='" + codigo + '\'' +
                ", tipo='" + tipo + '\'' +
                '}');
    }
}
