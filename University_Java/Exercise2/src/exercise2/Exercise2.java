package exercise2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
      
        int X;
        int Y;
        System.out.println("Digite el valor de X: ");
        X = entrada.nextInt();
        Y = (3*X*X)+(7*X) - 15;
        System.out.println("Para Y= 3*B2+ 7X – 15 , A ="+ Y);
    }
    
}