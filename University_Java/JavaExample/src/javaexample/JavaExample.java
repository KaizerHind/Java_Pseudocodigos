package javaexample;
import java.util.Scanner;

public class JavaExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, res;
        
        System.out.print("Ingrese el valor del 1er numero: ");
        a = sc.nextDouble();
        System.out.print("Ingrese el valor del 2do numero: ");
        b = sc.nextDouble();
        if (b==0) {
            System.out.println("");
            System.out.println("No es divisible entre 0.");
        } else {
            res = a/b;
            System.out.println("a/b: "+res);
        }
    }
    
}
