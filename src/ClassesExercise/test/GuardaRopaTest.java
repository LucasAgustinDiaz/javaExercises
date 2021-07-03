package ClassesExercise.test;

import ClassesExercise.model.GuardaRopa;
import ClassesExercise.model.Prenda;

import java.util.ArrayList;
import java.util.List;

public class GuardaRopaTest {
    public static void main(String[] args) {
        //-------- create guardaRopa
        GuardaRopa guardaRopa = new GuardaRopa();
        //-------- create list of prendas
        List<Prenda> l1 = new ArrayList<Prenda>();
        List<Prenda> l2 = new ArrayList<Prenda>();
        List<Prenda> l3 = new ArrayList<Prenda>();
        List<Prenda> l4 = new ArrayList<Prenda>();

        //-------- Generate Prendas in List
        for (int i = 0; i < 10 ; i++) {
            l1.add(new Prenda("test","HPD"+i));
            l2.add(new Prenda("test","PUMA"+i));
            l3.add(new Prenda("test","ADIDAS"+i));
            l4.add(new Prenda("test","NIKE"+i));
        }

        //-------- put prendas
        Integer codigo1 = guardaRopa.guardarPrendas(l1);
        Integer codigo2 = guardaRopa.guardarPrendas(l2);
        Integer codigo3 = guardaRopa.guardarPrendas(l3);
        Integer codigo4 = guardaRopa.guardarPrendas(l4);

        //-------- mostrarPrendas()
        guardaRopa.mostrarPrendas();

        //-------- Recuvery Prendas
        List<Prenda> myPrendas = guardaRopa.devolverPrenda(codigo3);

        //-------- MyPrendas
        myPrendas.forEach(System.out::println); // lambda (e) -> System.out.println(el) // toString() implementado


    }
}
