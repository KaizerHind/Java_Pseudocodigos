/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicional;

import java.util.Scanner;

/**
 *
 * @author mjimenez47
 */
public class Condicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c;
        
        Scanner in = new Scanner (System.in);
        System.out.print("Ingrese el valor de a: ");
        a = in.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        b = in.nextDouble();
        
        if(b==0){
            System.out.println("El valor de b no puede ser cero");
        }else{
            c=a/b;
            System.out.println("El resultado es " + c);
        }
        
    }
    
}
