package FactoryObject;

import Interface.Sorter;
import ClassesExercise.model.Persona;
import util.CSVReader;
import java.util.ArrayList;
import java.util.Comparator;

public class app {
    public static void main(String[] args) {

        ArrayList<String> names = CSVReader.getDataFile("src/data/name.csv");
        Persona[] ps = new Persona[names.size()];
        ArrayList<Persona> personas = new ArrayList<>();

        int inx = 0;
        for (String s : names){
            ps[inx] = new Persona(s, (int) (Math.random() * 10));
            personas.add(ps[inx]);
            inx++;
        }

        Sorter q = (Sorter) MyFactory.getInstance("sorter");
        q.sort(ps, Comparator.comparingInt(Persona::getDni));
        for (Persona p : ps)
            System.out.println(p);
    }
}
