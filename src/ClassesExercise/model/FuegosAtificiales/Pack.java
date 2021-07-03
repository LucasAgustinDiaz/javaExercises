package ClassesExercise.model.FuegosAtificiales;

import Interface.IFuegoArtificial;

import java.util.ArrayList;
import java.util.List;

public class Pack {
    private List<IFuegoArtificial> listaIndivicual; //{ cohete,...., benga }
    private List<Pack> listaPacks;
    private String name;

    public Pack(String name) {
        this.name = name;
        listaIndivicual = new ArrayList<IFuegoArtificial>();
        listaPacks = new ArrayList<Pack>();
    }

    public void cargarFuegoArt(IFuegoArtificial f){
        listaIndivicual.add(f);
    }

    public void cargarPacks(Pack pack){
        listaPacks.add(pack);
    }

    public void listarFuegosArt(){
        if (listaIndivicual.size()>0) {
            System.out.println("El " + this.name + " Contiene :");
            listaIndivicual.forEach(IFuegoArtificial::tooString);
            System.out.println("FIN Packete -------- " + this.name);
        }
    }

    public void listarPacks(){
        if (listaPacks.size() > 0 )
        {
            System.out.println("INICIO Packete ############## " + this.name);
            listaPacks.forEach(Pack::listarFuegosArt);
            System.out.println("FIN Packete ##############" + this.name);
        }

    }

    public void usarFuegosArt () {
        if (listaIndivicual.size()>0) {
            listaIndivicual.forEach(IFuegoArtificial::makeExplotion);
        }
    }
    public void usarPacks(){
        if (listaPacks.size() > 0 )
        {
            listaPacks.forEach(Pack::usarFuegosArt);
        }

    }

    public String getName() {
        return name;
    }
}
