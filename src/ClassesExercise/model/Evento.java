package ClassesExercise.model;

import ClassesExercise.model.FuegosAtificiales.Pack;
import Interface.IInvitado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Evento {
    private String titulo;
    private int count;
    HashMap<Integer, Pack> lista;
    List<IInvitado> listaInvitados;

    public Evento(String titulo) {
        this.titulo = titulo;
        this.lista = new HashMap<Integer, Pack>();
        this.count = 0;
        this.listaInvitados = new ArrayList<IInvitado>();
    }

    public void añadirPack(Pack pack){
        lista.put(this.count++,pack);
    }

    public void registrarInvitado(IInvitado invitado){
        listaInvitados.add(invitado);
    }

    public void listarListaFuegos(){
        lista.forEach((k,v) -> {
            lista.get(k).listarPacks();
            lista.get(k).listarFuegosArt();
        });
    }
    public void iniciarEventoFuegosArtificiales(){
        lista.forEach((k,v) -> {
            lista.get(k).usarPacks();
            lista.get(k).usarFuegosArt();
        });
    }

    public void comerTorta(){
        listaInvitados.forEach(IInvitado::brindar);
    }



}
