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
public class Inversion {
    public static void main(String[] args) {
        double inversion1, inversion2, inversion3, por1, por2, por3, total;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el valor de la inversión 1: ");
        inversion1 = in.nextDouble();
        System.out.print("Ingrese el valor de la inversión 2: ");
        inversion2 = in.nextDouble();
        System.out.print("Ingrese el valor de la inversión 3: ");
        inversion3 = in.nextDouble();
        total = inversion1 + inversion2 + inversion3;
        por1 = inversion1 / total * 100;
        por2 = inversion2 / total * 100;
        por3 = inversion3 / total * 100;
        /*System.out.println("El porcentaje de la inversión 1 es " + por1 + "%, el porcentaje de la inversión 2 es " + por2 + 
                "% y el porcentaje de la inversión 3 es " + por3 +"%.");*/
        System.out.printf("El porcentaje de la inversión 1 es %.3f %n ", por1);
        System.out.printf("El porcentaje de la inversión 2 es %.3f %n ", por2);
        System.out.printf("El porcentaje de la inversión 3 es %.3f %n ", por3);
        
        System.out.println("La inversión total es de $" + total);
        
    }
}
