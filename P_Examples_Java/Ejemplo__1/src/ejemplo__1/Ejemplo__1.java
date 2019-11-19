/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo__1;

import java.util.Scanner;

/**
 *
 * @author mjimenez47
 */
public class Ejemplo__1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        Scanner in = new Scanner(System.in);
        Scanner inS = new Scanner(System.in);
        Scanner inD = new Scanner(System.in);
        
        System.out.print("Ingrese la opción: ");
        op = in.nextInt();
        
        switch(op){
            case 1:
                int x;
                System.out.print("Ingrese el valor de X: ");
                x = in.nextInt();
                if((x%2)==0){
                    System.out.println("El número " + x + " es par.");
                }else{
                    System.out.println("El número " + x + " es impar.");
                }
                
                break;
            case 2:
                /*Realizar un algoritmo que permita calcular los valores totales de una compra en una tienda.
Se deben tener en cuenta los siguientes descuentos:
•	Si la compra es menor a 100.000, no se hace descuento.
•	Si la compra es mayor o igual a 100.000, pero es menor a 1’000.000, se hace un 5% de descuento.
•	Si la compra es mayor o igual a 1’000.000, se hace un 10% de descuento.
Adicionalmente, si el pago es con efectivo, se realiza un 5% de descuento adicional. Si el pago es con tarjeta, no se realiza el descuento.
*/
                double valcompra,total=0,descuento=0;
                String tipopago;
                System.out.print("Ingrese el valor de la compra: ");
                valcompra = inD.nextDouble();
                System.out.print("Ingrese el tipo de pago (T o E): ");
                tipopago = inS.nextLine();
                if((valcompra>0)&&((tipopago.equals("T"))||(tipopago.equals("E")))){
                    if(valcompra<100000){
                        total = valcompra;
                    }
                    if((valcompra>=100000)&&(valcompra<1000000)){
                        descuento = valcompra * 0.05;
                        total = valcompra - descuento; //total = valcompra * 0.95;
                    }else{
                        if(valcompra>=1000000){
                            descuento = valcompra * 0.1;
                            total = valcompra - descuento; //total = valcompra * 0.9;
                        }
                    }
                    if (tipopago.equals("E")){
                        descuento = descuento + (total*0.05);
                        total = valcompra - descuento;
                    }
                    System.out.println("El valor total a pagar es de " + total);
                    System.out.println("El valor del descuento es de " + descuento);
                }else{
                    System.out.println("El valor de compra debe ser mayor a 0 y los tipos de pago deben ser E o T.");
                }
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
    
}
