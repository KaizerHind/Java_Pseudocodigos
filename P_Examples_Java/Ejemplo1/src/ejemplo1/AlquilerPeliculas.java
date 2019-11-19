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
public class AlquilerPeliculas {
    public static void main(String[] args) {
        int num_peliculas, num_dias, valor_alq = 1500, total;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el número peliculas: ");
        num_peliculas = in.nextInt();
        System.out.print("Ingre el número de días: ");
        num_dias = in.nextInt();
        total = num_dias * (num_peliculas-1) * valor_alq;
        System.out.println("El valor total a pagar es de $" + total);
    }
}
