package ClassesExercise.test;

import ClassesExercise.model.Evento;
import ClassesExercise.model.FuegosAtificiales.Cohete;
import ClassesExercise.model.FuegosAtificiales.Pack;
import ClassesExercise.model.InvitadoMeLi;
import ClassesExercise.model.InvitadoStandard;
import FactoryObject.FuegosArtificialesFactory;
import FactoryObject.VehiculoFactory;
import Interface.IFuegoArtificial;
import Interface.IInvitado;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EventoTest {
    public static void main(String[] args) {
        List<IFuegoArtificial> cohetesGenerados = new ArrayList<IFuegoArtificial>();
        List<IFuegoArtificial> petardosGenerados = new ArrayList<IFuegoArtificial>();
        List<IFuegoArtificial> bengalasGeneradas = new ArrayList<IFuegoArtificial>();
        Random r = new Random();
        for (int i = 0; i < 25 ; i++) {
            bengalasGeneradas.add(FuegosArtificialesFactory.generateFuegoArt(1));
            cohetesGenerados.add(FuegosArtificialesFactory.generateFuegoArt(2));
            petardosGenerados.add(FuegosArtificialesFactory.generateFuegoArt(3));
        }

        Pack pack1 = new Pack("pack 1");
        Pack pack2 = new Pack("Pack 2");
        Pack pack3 = new Pack("Pack 3");
        Pack pack4 = new Pack("Pack 4");

        for (int i = 0; i <2 ; i++) {
            pack1.cargarFuegoArt(bengalasGeneradas.get(i));
            pack1.cargarFuegoArt(petardosGenerados.get(i));
            pack1.cargarFuegoArt(cohetesGenerados.get(i));
        }
        for (int i = 10; i <13 ; i++) {
            pack2.cargarFuegoArt(cohetesGenerados.get(i));
            pack3.cargarFuegoArt(petardosGenerados.get(i));
            pack4.cargarFuegoArt(petardosGenerados.get(i));
        }
//        pack1.cargarPacks(pack1);
        pack4.cargarPacks(pack1);
        pack4.cargarPacks(pack2);
        pack4.cargarPacks(pack3);
//        pack2.listarPacks();



        Evento evento = new Evento("Veni a comer con la CHIKI!!");

        evento.añadirPack(pack3);
        evento.añadirPack(pack4);
        System.out.println("#################### LISTA FUEGOS ARTIFICIALES ####################");
        evento.listarListaFuegos();

        // invitados
        IInvitado inv1 = new InvitadoMeLi();
        IInvitado inv2 = new InvitadoMeLi();
        IInvitado inv3 = new InvitadoMeLi();
        IInvitado inv4 = new InvitadoMeLi();
        IInvitado inv5 = new InvitadoStandard();
        IInvitado inv6 = new InvitadoStandard();
        IInvitado inv7 = new InvitadoStandard();

        evento.registrarInvitado(inv1);
        evento.registrarInvitado(inv2);
        evento.registrarInvitado(inv3);
        evento.registrarInvitado(inv4);
        evento.registrarInvitado(inv5);
        evento.registrarInvitado(inv6);
        evento.registrarInvitado(inv7);
        System.out.println("#################### COMER TORTA ####################");
        evento.comerTorta();
        System.out.println("#################### INICIAR EVENTO FUEGOS ARTIFICIALES ####################");
        evento.iniciarEventoFuegosArtificiales();







    }
}
