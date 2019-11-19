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
public class Ejercicio2 {
    public static void main(String[] args) {
        
        double num1, num2, res;
        String opcion;
        Scanner inD = new Scanner(System.in);
        Scanner inS = new Scanner(System.in);
        
        System.out.print("Digite el valor del primer numero: ");
        num1=inD.nextDouble();
        System.out.print("Digite el valor del segundo numero: ");
        num2=inD.nextDouble();
        System.out.println("Digite la operacion a realizar: S, R, M, D: ");
        opcion=inS.next();
        switch(opcion){
            case "s":
            case "S":
                res=num1+num2;
                System.out.println("El resultado de sumar " + num1 + " + " + num2 + " es "+ res);
                break;
            case "r":
            case "R":
                res=num1-num2;
                System.out.println("El resultado de restar " + num1 + " - " + num2 + " es "+ res);
                break;
            case "m":
            case "M":
                res=num1*num2;
                System.out.println("El resultado de multiplicar " + num1 + " x " + num2 + " es "+ res);
                break;
            case "d":
            case "D":
                if(num2!=0){
                    res=num1/num2;
                    System.out.println("El resultado de dividir " + num1 + " / " + num2 + " es "+ res);
                }else{
                    System.out.println("No se puede realizar la operacion");
                }
                break;
            
            default:
                System.out.println("Ingrese una opcion correcta");
        }
    }
}
