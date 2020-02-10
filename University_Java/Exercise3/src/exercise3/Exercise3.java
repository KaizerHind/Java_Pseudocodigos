package exercise3;

import java.util.Scanner;

public class Exercise3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n;
        System.out.println("Digite un numero:");
        n = entrada.nextInt();
        if ((n%2==0)) {
            System.out.println("N es par");
        } else {
            System.out.println("N es impar");
        }
    }
    
}
