package ClassesExercise.test;

import ClassesExercise.model.Persona;
import sort.BubbleSort;
import sort.HeapSort;
import sort.QuickSort;
import util.CSVReader;
import java.util.ArrayList;
import java.util.Comparator;

public class SorterTest {
    public static void main(String[] args) {

        // Data Test - using CSV file
        ArrayList<String> names = CSVReader.getDataFile("src/data/name.csv");
        Persona[] ps = new Persona[names.size()];
        ArrayList<Persona> personas = new ArrayList<>();
        int inx = 0;
        for (String s : names){
            ps[inx] = new Persona(s, (int) (Math.random() * 10));
            personas.add(ps[inx]);
            inx++;
        }

        //-------- HeapSort O(n * logN)
        HeapSort h = new HeapSort();
        h.sort(ps,Comparator.comparing(Persona::getNombre));
        for (Persona p : ps)
            System.out.println(p);

        //-------- BubbleSort O(n*n)
        BubbleSort b = new BubbleSort();
        b.sort(ps,Comparator.comparing(Persona::getNombre));
        for (Persona p : ps)
            System.out.println(p);

        //-------- QuickSort O(n*n)
        QuickSort q = new QuickSort();
        q.sort(ps, Comparator.comparingInt(Persona::getDni));
        for (Persona p : ps)
            System.out.println(p);

        //------------Sort with collections method - O(n * logN) - Use MergeSort
        // Sort with Collections native sorter
        // Collections.sort(personas,Comparator.comparingInt(Persona::getDni));
        // personas.forEach(System.out::println);
    }
}
