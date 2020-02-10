/*
                        [DIAMETRO]
Ejercicio N#1 de Pseudocodigo en Java. - Sebastian Camacho
*/

package exercise1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String nextLine;

        do {
            System.out.println("Digite el radio del circulo : ");
            nextLine = scanner.nextLine().trim();
        } while (!nextLine.matches("[0-9]+"));

        int radio = Integer.parseInt(nextLine);
        int diametro = radio * 2;
        System.out.println("El diametro es " + diametro);   
    }
    
}