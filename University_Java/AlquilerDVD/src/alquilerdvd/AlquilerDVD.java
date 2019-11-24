/*

    Una video tienda alquila DVD a $1.500 el día. Tiene una
    promoción que consiste en dejar gratis el  alquiler  de
    una  película.  Realice  un  algoritmo  que  teniendo
    como  dato  de  entrada  el  total  de películas
    alquiladas, y el número de días de alquiler, determine
    el monto a pagar.  Se asume que siempre se alquilan
    al menos 2 películas.

    Autor: @KaizerHind

 */

package alquilerdvd;
import java.util.Scanner;

public class AlquilerDVD {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int dvd, cantpe, cantdias;
        dvd = 1500;
        System.out.println("Cantidad de peliculas a Alquilar: ");
        cantpe = sc.nextInt();
        System.out.println("Cantidad de dias que alquilara: ");
        cantdias = sc.nextInt();
        
         System.out.println("El monto a pagar es de:"+(cantpe-1)*cantdias*dvd);
                
    }    
}
