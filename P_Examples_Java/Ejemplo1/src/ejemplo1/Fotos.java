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
public class Fotos {
    public static void main(String[] args) {
        double cant_fotos, total, valor_foto = 1500;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el número de fotos a revelar: ");
        cant_fotos = in.nextDouble();
        total = cant_fotos * valor_foto * 1.19;
        /*total = (cant_fotos * valor_foto * 1) + (cant_fotos * valor_foto * 0.19);*/
        System.out.println("El valor total a pagar es de " + total);
    }
}
