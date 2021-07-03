package ClassesExercise.test;

import ClassesExercise.model.Persona;
import FactoryObject.MyFactory;
import Interface.Sorter;
import util.RandomNumber;
import util.Time;
import java.util.Comparator;

public class TimeSort {
    public static void main(String[] args){

        // Generate Data Test
        Persona[] data = new Persona[100000];
        for (int i = 0; i < 100000; i++)
            data[i] = new Persona("Anonimo", RandomNumber.getNumber()); // Random number = DNI
        // Time object
        Time lapse = new Time();
        lapse.start();

        // Sort with HeapSort ------------------------------------------------------------------------------------------
        Sorter h = (Sorter) MyFactory.getInstance("heapSort");
        h.sort(data, Comparator.comparingInt(Persona::getDni));
        lapse.stop();
        System.out.println("Time for HeapSort: " + lapse.getTimeLapse() + "ms");
        // ------ END SORT WITH HEAPSORT--------------------------------------------------------------------------------

        // Generate Data Test
        for (int i = 0; i < 100000; i++)
            data[i] = new Persona("Anonimo", RandomNumber.getNumber()); // Random number = DNI
        // Time object
        lapse.start();
        // Sort with QuickSort------------------------------------------------------------------------------------------
        Sorter q = (Sorter) MyFactory.getInstance("quickSort");
        q.sort(data, Comparator.comparingInt(Persona::getDni));
        lapse.stop();
        System.out.println("Time for QuickSort: " + lapse.getTimeLapse() + "ms");
        // ------ END SORT WITH QUICKSORT ------------------------------------------------------------------------------

        // Generate Data Test
        for (int i = 0; i < 100000; i++)
            data[i] = new Persona("Anonimo", RandomNumber.getNumber()); // Random number = DNI
        // Time object
        lapse.start();
        // Sort with BubbleSort-----------------------------------------------------------------------------------------
        Sorter b = (Sorter) MyFactory.getInstance("bubbleSort");
        b.sort(data, Comparator.comparingInt(Persona::getDni));
        lapse.stop();
        System.out.println("Time for BubbleSort: " + lapse.getTimeLapse() + "ms");
        // ------ END SORT WITH QUICKSORT ------------------------------------------------------------------------------

        // avg times
        //Time for HeapSort: 88ms
        //Time for QuickSort: 44ms
        //Time for BubbleSort: 53689ms
    }
}
