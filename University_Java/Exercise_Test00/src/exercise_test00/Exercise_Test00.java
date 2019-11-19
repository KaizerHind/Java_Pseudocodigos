package exercise_test00;
import java.util.Scanner;

public class Exercise_Test00 {

    public static void main(String[] args) {
        int N, i, num;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numeros negativos a leer: ");
        N = in.nextInt();

        if (N > 0) {
            i = 1;
            while (i <= N) {
                System.out.print("Ingresa el #" + i + " negativo:");
                num = in.nextInt();
                if (num >= 0) {
                    System.out.println("El numero debe ser negativo.");
                } else {
                    System.out.println("El numero positivo de " + num + " es " + (num * -1));
                    i++;
                }
            }
        }else{System.out.println("La cantidad de numeros a leer debe ser mayor a cero!");}
    }
    
}
