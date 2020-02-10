package proveedor;

import java.util.Scanner;

public class Proveedor {

    public static void main(String[] args) {
        double precio;
        Scanner inD = new Scanner(System.in);      
        String marca;

        System.out.println("Ingresa la marca del Equipo: ");
        marca = inD.nextLine();
        System.out.println("Ingresa el precio del producto: ");
        precio = inD.nextDouble();

        if (precio > 2000)//revisamos si el valor es 2000 o superior
        {
            precio *= 0.90; // Aplicamos un descuento del 10% (100 - 10 = 90% restante)
        }
        if (marca.equals("NOSY") || marca.equals("nosy")) // Revisamos si la marca es nosy
        {
            precio *= 0.95; // Aplicamos un descuento del 5% (100 - 5 = 95% restante)
        }

        precio *= 0.81; 
       System.out.print("El precio final es: "+ precio);

    }
}


/*

Un proveedor de equipos de sonido ofrece un descuento del 10%
sobre el precio sin IVA, de algún aparato si esta cuesta $2000
o más. Además, independientemente de esto, ofrece un 5% de descuento
si la marca es NOSY. Determinar cuánto pagara con IVA incluido un cliente
cualquiera por la compra de su aparato. Tenga en cuenta que el valor del IVA es de 19%.

*/