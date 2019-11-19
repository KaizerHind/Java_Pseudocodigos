package vector;
import java.util.Scanner;

public class Vector {

    public static void main(String[] args) {
        int i, N;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingresa el tamaño del vector: ");
        N = in.nextInt();
        
        int vector[] = new int[N];
        
        for(i = 0; i<=(N-1);i++){
            System.out.println("Ingresa el valor de la posicion " + i + ": ");
            vector[i]=in.nextInt();
        }
        
        System.out.println("\nEscribir posiciones en orden ascendente: ");
        for(i = 0; i <=(N-1); i++){
            System.out.println("El valor de la posicion " + i + " es " + vector[i]);
        }
        
        System.out.println("\nEscribir posiciones en orden ascendente: ");
        for(i = (N-1); i>=0; i--){
            System.out.println("El valor de la posicion " + i + " es " + vector[i]);
        }        
    }
    
}
