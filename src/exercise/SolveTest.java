package exercise;

import java.util.Scanner;

public class SolveTest {
    public static void main(String[] args){

        Solution solution = new Solution();
        //
        solution.sayHello();
        //
        double radius = Math.random() * 10e3;
        System.out.println("Radius of a Circle: " + radius);
        System.out.println("Area of the circle: ");
        solution.circleArea(radius);
        //
        System.out.println("Please enter a integer to validate if it's pair or not");
        Scanner scan = new Scanner(System.in);
        if (solution.isPair(scan.nextInt())) System.out.println("It's pair");
        else System.out.println("Not pair");
    }
}
