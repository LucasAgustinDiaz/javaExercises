package ClassesExercise.test;

import ClassesExercise.model.Persona;
import util.CSVReader;
import util.SortUtil;
import java.util.ArrayList;

public class PersonaTest {
    public static void main(String[] args) {
        //Persona person1 = new Persona("John Doe", 21000000);
        //Persona person2 = new Persona("Jane Doe", 21000001);
        //System.out.println(person1.precedeA(person2));
        //System.out.println(person2.precedeA(person1));

        // Data Test
        ArrayList<String> names = CSVReader.getDataFile("src/data/name.csv");
        Persona[] ps = new Persona[names.size()];
        int inx = 0;
        for (String s : names){
            ps[inx] = new Persona(s, (int) (Math.random() * 10));
            inx++;
        }

        // Print unsorted data
        System.out.println("unsorted: ");
        for (Persona p : ps)
            System.out.println(p);

        // Sort the Array
        SortUtil.ordenar(ps);
        System.out.println("------------");

        // Print sorted data
        System.out.println("sorted: ");
        for (Persona p : ps)
            System.out.println(p);


    }
}
