package exercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {

    // O(n)
    // Desarrollar un programa para mostrar los primeros n números pares, siendo n un valor que el usuario ingresará por consola.
    // Recordá que un número es par cuando es divisible por 2.
    public void exercise_1(int pairNumber) {
        for (int i = 0; i < pairNumber * 2; i++)
            if (i % 2 == 0) System.out.print(i + ", ");
        System.out.println();
    }

    // O(n)
    // Desarrollar un programa para mostrar los primeros n múltiplos de m, siendo n y m valores que el usuario ingresará por consola.
    // Recordá que un número a es múltiplo de b si a es divisible por b.
    public void exercise_2(int nMultiples, int mMainNumber) {
        for (int i = 0; i < nMultiples; i++)
            System.out.print(mMainNumber*i + ", ");
        System.out.println();
    }

    // 0.5*O(n)
    // Desarrollar un programa para informar si un número n es primo o no, siendo n un valor que el usuario ingresará por consola.
    // Recordá que un número es primo cuando sólo es divisible por sí mismo y por 1.
    public boolean exercise_3(int isPrime){
        if (isPrime == 1) return false;
        boolean _PRIME = true;
        for (int i = 2; i <= isPrime/2; i++)
            if (isPrime % i == 0) {
                _PRIME = false;
                break;
            }
        return _PRIME || isPrime == 2;
    }

    // O(n^2)
    // Desarrollar un programa para mostrar por consola los primeros n números primos, siendo n un valor que el usuario ingresará por consola.
    public void exercise_4(int nPrimes){
        boolean go;
        int next = 1;
        if (nPrimes > 0) System.out.print(2 + ", ");
        while (--nPrimes > 0) {
            go = true;
            while (go) {
                if (exercise_3(next)) {
                    System.out.print(next + ", ");
                    go = false;
                }
                else next += 2;
            }
            next += 2;
        }
        System.out.println();
    }

    // Desarrollar un programa para mostrar por consola los primeros n números naturales que tienen al menos m dígitos d,
    // siendo n, m y d valores que el usuario ingresará por consola.
    // Solucion sencilla, pero NADA EFICIENTE
    public void exercise_5(int nNumbers, int mDigits, int dDigit) {
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < mDigits; i++)
            number.append(dDigit);

        int someInt = Integer.parseInt(String.valueOf(number));
        System.out.print(someInt + ", ");
        someInt++;

        while (--nNumbers > 0) {
            boolean flag = true;

            while (flag) {

                if (countAppearances(Integer.toString(someInt), Integer.toString(dDigit)) == mDigits) {
                    System.out.print(someInt + ", ");
                    flag = false;
                }
                else someInt++;
            }
            someInt++;
        }
        System.out.println();
    }

    public int countAppearances(String s, String c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i,i+1).equals(c)) count++;
        }

        return count;
    }

    // Declara dos variables numéricas (con el valor que desees),
    // muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).
    public void basicOperations() {
        int a = (int) ((Math.random() * 10) + 1);
        int b = (int) ((Math.random() * 50) + 1);
        System.out.println("Number a: " + a + " - Number b: " + b);
        System.out.println("Basic operations with Int variables: ");
        // add
        System.out.println("Add+: " + (a + b));
        // subtract
        System.out.println("Subtract: " + (a-b));
        // multiple
        System.out.println("Multiple: " + (a*b));
        // divide
        System.out.println("Divide: " + (a/b));
        // mod
        System.out.println("Mod: " + (a%b));
    }

    // Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
    // Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.
    public void sayHello() {
        ArrayList<String> names = this.getData();
        int n = (int) (Math.random() * 10);
        System.out.println("Hi " + names.get(n) + ", How you doing?");
    }

    // Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
    // (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.
    public void circleArea(double radius){
        System.out.println(Math.PI * Math.pow(radius,2));
    }

    public boolean isPair(int number) {
        return number % 2 == 0;
    }

    private ArrayList<String> getData() {
        ArrayList<String> data = new ArrayList<>();
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("src/data/name.csv"));
            String row;
            while ((row = csvReader.readLine()) != null) data.add(row);
            csvReader.close();
        } catch (IOException e) { e.printStackTrace(); }
        return data;
    }

}































