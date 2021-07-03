package exercise;

import java.util.Scanner;

public class Solve {
    public static void main(String[] args){
        Solution solution = new Solution();
        System.out.println("Choose an exercise to try: 1, 2, 3, 4, 5");
        Scanner exercise = new Scanner(System.in);
        switch (exercise.nextInt()) {
            case 1:
                System.out.println("INPUT EXPECTED: int n");
                Scanner input1 = new Scanner(System.in);
                solution.exercise_1(input1.nextInt());
                break;
            case 2:
                System.out.println("INPUT EXPECTED: int n, int m");
                Scanner input2 = new Scanner(System.in);
                int n = input2.nextInt();
                int m = input2.nextInt();
                solution.exercise_2(n,m);
                break;
            case 3:
                System.out.println("INPUT EXPECTED: int n");
                Scanner input3 = new Scanner(System.in);
                if (solution.exercise_3(input3.nextInt())) System.out.println("IT'S PRIME");
                else System.out.println("NOT PRIME");
                break;
            case 4:
                System.out.println("INPUT EXPECTED: int n");
                Scanner input4 = new Scanner(System.in);
                solution.exercise_4(input4.nextInt());
                break;
            default:
                System.out.println("INPUT EXPECTED: int n, int m, int d");
                Scanner input5 = new Scanner(System.in);
                int n1 = input5.nextInt();
                int n2 = input5.nextInt();
                int n3 = input5.nextInt();
                solution.exercise_5(n1,n2,n3);
                break;
        }

    }
}
