package tabla_multiplicar;
import java.util.Scanner;

public class Tabla_Multiplicar {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, i;
        
        System.out.println("Ingresa un numero de la tabla de Multiplicar a mostrar:");
        num1 = sc.nextInt();
        System.out.println("");

        System.out.println("---------");
        System.out.println("   For:");
        System.out.println("---------");
        for (i=0; i< 10; i++){
         System.out.println(num1 + " x " + (i+1) + " = " + 
           (num1 * (i+1)));
        }
        System.out.println("\n");
        System.out.println("---------");
        System.out.println("  While: ");
        System.out.println("---------");
        i = 1;
        while(i<=10){
            System.out.println(num1+"x"+i+"="+(num1*i)); i++;}
    }
    
}
