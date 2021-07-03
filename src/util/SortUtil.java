package util;

import Interface.Precedable;

public class SortUtil {

    // O(n^2)
    public static void ordenar(Precedable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j+1].precedeA(arr[j]))
                {
                    // swap arr[j+1] and arr[j]
                    Precedable temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
