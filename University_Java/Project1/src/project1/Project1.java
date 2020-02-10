package project1;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val1,suma;

        suma=0;
        do
        {
            System.out.println("Ingresa un numero");
            val1 = sc.nextInt();
            suma=suma+val1;
            }
            while(val1!=0);

            System.out.println("La suma total ingresada es: "+suma);
    }   
}
