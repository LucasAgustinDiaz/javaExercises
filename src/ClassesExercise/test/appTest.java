package ClassesExercise.test;

import util.StringUtil;


public class appTest {
    public static void main(String[] args){
        /*
        Fraccion f1 = new Fraccion(5, 4);
        Fraccion f2 = new Fraccion(5, 2);
        // Fraccion test
        System.out.println(f1.sumar(f2));
        System.out.println(f1.restar(f2));
        System.out.println(f1.sumar(1));
        System.out.println(f1.restar(1));
        System.out.println(f1.dividir(f2));
        System.out.println(f1.multiplicar(f2));
        System.out.println(f1.dividir(2));
        System.out.println(f1.multiplicar(2));
        // MathUtil mcd test
        System.out.println(MathUtil.mcd(20,8));
        */
        // Fecha date = new Fecha(1,1,2000);
        // System.out.println(date);
        //String s = "f ";
        //s = StringUtil.rTrim(s);
        //System.out.println(s + s);
        String occurrence = "-+-+--+/";
        System.out.println(StringUtil.indexOfN(occurrence,'-',4));
    }
}
