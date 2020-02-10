package inversion;
import java.util.Scanner;

public class Inversion {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double inv1, inv2, inv3, x1, x2, x3, total;
        
        System.out.println("Ingrese el 1er valor invertido: ");
        inv1 = sc.nextDouble();
        System.out.println("Ingrese el 2do valor invertido: ");
        inv2 = sc.nextDouble();
        System.out.println("Ingrese el 3er valor invertido: ");
        inv3 = sc.nextDouble();

        total = inv1+inv2+inv3;

        x1=inv1/total*100;
        x2=inv2/total*100;
        x3=inv3/total*100;
        
        System.out.println("El Porcentaje 1 es de: " + x1 + "%");
        System.out.println("El Porcentaje 2 es de: " + x2 + "%");
        System.out.println("El Porcentaje 3 es de: " + x3 + "%");
        System.out.println("");
        System.out.print("La inversion total es de $" + total);
        
    }
    
}
