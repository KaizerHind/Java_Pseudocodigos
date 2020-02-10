package library;

import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double desc;
        double totalp;
        int usclient;
        double value;
        System.out.println("Escriba el tipo correspondiente del cliente: ");
        usclient = entrada.nextInt();
        System.out.println("Escriba el valor real del producto: ");
        value = entrada.nextInt();
        if ((usclient==1) || (usclient==2) || (usclient==3))
        {
                switch (usclient)
                {
                case 1:
                        desc = value*0.3;
                        totalp = value-desc;
                        System.out.println("El value final es de "+totalp+"$");
                        break;
                case 2:
                        desc = value*0.2;
                        totalp = value-desc;
                        System.out.println("El value final es de "+totalp+"$");
                        break;
                case 3:
                        desc = value*0.1;
                        totalp = value-desc;
                        System.out.println("El value final es de "+totalp+"$");
                        break;
                }
        }
        else
        {
                System.out.println("Tipo de cliente no reconocido");
                System.out.println("El value final es de "+value+"$");
        }
    }
    
}
