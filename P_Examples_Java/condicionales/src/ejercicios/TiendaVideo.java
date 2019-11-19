/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author mjimenez47
 */
public class TiendaVideo {
        public static void main(String[] args) {
            double dias, cantidad, valor = 1500, total;
            Scanner in = new Scanner(System.in);
            System.out.print("Ingrese el número de peliculas: ");
            cantidad = in.nextDouble();
            System.out.print("Ingrese el número de días: ");
            dias = in.nextDouble();
            
            if((cantidad > 0)&&(dias>0)){
                if(cantidad == 1){
                    total = cantidad * dias * valor;
                }else{
                    total = (cantidad - 1) * dias * valor;
                }
                System.out.println("El total a pagar es: " + total);
            }else{
                System.out.println("Las cantidades de peliculas y días deben ser mayores a cero");
            }
            
        }
}
