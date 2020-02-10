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