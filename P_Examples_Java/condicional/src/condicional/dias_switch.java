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
public class dias_switch {
    public static void main(String[] args) {
        String dia;
        Scanner in = new Scanner(System.in);
        System.out.println("Condicional Switch");
        System.out.print("Ingrese el nombre del día: ");
        dia = in.nextLine();
        
        switch (dia){
            case "Lunes":
                System.out.println("1");
                break;
            case "Martes":
                System.out.println("2");
                break;
            case "Miercoles":
                System.out.println("3");
                break;
            case "Jueves":
                System.out.println("4");
                break;
            case "Viernes":
                System.out.println("5");
                break;
            case "Sabado":
                System.out.println("6");
                break;
            case "Domingo":
                System.out.println("7");
                break;
            default: System.out.println("Día ingresado no válido");
        }
        
    }
}
