package fototienda;
import java.util.Scanner;

public class Fototienda {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int q, w, e, cantphotos;
        System.out.println("Cantidad de fotos que contiene el rollo:" );
        cantphotos = sc.nextInt();
        
        q = cantphotos*1500;
        w = (int) (cantphotos*1500*0.19);
        e = q+w;
        
        System.out.println("El monto a pagar por el revelado completo es de: "+ e);
        
    }
}