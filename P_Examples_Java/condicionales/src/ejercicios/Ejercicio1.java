/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author bpulido
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea=new Scanner(System.in);
        double a, b, res;
        int c, rest=0;
        System.out.println("Digite el valor del primer numero");
        a=lea.nextDouble();
        System.out.println("Digite el valor del segundo numero");
        b=lea.nextDouble();
        if(b>0 && a>=0){
            res=a/b;
            System.out.println("El resultado es: "+res);
        }else{
            System.out.println("No se puede dividir");
        }
    }
}

