/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

import java.util.Scanner;

/**
 *
 * @author mjimenez47
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1, num2, res;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        num1 = in.nextInt();
        System.out.print("Ingrese el segundo número: ");
        num2 = in.nextInt();
        res = num1 + num2;
        System.out.println("El resultado de la suma de " + num1 + " + " + num2 + " es " + res);
    }
    
}
