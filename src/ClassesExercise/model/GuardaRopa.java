package ClassesExercise.model;

import java.util.HashMap;
import java.util.List;

public class GuardaRopa {
    private HashMap<Integer,List<Prenda>> diccionarioRopa;
    private int codigo;

    public GuardaRopa() {
        this.diccionarioRopa =  new HashMap<>();
        this.codigo = 0;
    }

    public Integer guardarPrendas(List<Prenda> listaDePrenda){
        this.codigo++;
        diccionarioRopa.put(this.codigo,listaDePrenda);
        return this.codigo;
    }

    public void mostrarPrendas() {
        diccionarioRopa.forEach((key,value) -> System.out.println("Key: " + key + ": Value: " + value.toString()));
    }

    public List<Prenda> devolverPrenda(Integer codigo){
        return diccionarioRopa.get(codigo);
    }
}
