package ClassesExercise.test;

import ClassesExercise.model.Celular;
import ClassesExercise.model.Persona;
import util.CSVReader;
import util.SortUtil;

import java.util.ArrayList;

public class CelularTest {
    public static void main(String[] args) {

        // Data Test
        ArrayList<String> numbers = CSVReader.getDataFile("src/data/number.csv");
        Celular[] cs = new Celular[numbers.size()];
        int inx = 0;

        for (String s : numbers){
            cs[inx] = new Celular(Integer.parseInt(s), new Persona());
            inx++;
        }

        // Print unsorted data
        System.out.println("unsorted: ");
        for (Celular c : cs)
            System.out.println(c);

        // Sort the Array
        SortUtil.ordenar(cs);
        System.out.println("------------");

        // Print sorted data
        System.out.println("sorted: ");
        for (Celular c : cs)
            System.out.println(c);
    }

}
