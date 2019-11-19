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
public class dias {
    public static void main(String[] args) {
        String dia;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el nombre del día: ");
        dia = in.nextLine();
        
        if(dia.equals("Lunes")){
            System.out.println("1");
        }else{
            if(dia.equals("Martes")){
                System.out.println("2");
            }else{
                if(dia.equals("Miercoles")){
                    System.out.println("3");
                }else{
                    if(dia.equals("Jueves")){
                        System.out.println("4");
                    }else{
                        if(dia.equals("Viernes")){
                            System.out.println("5");
                        }else{
                            if(dia.equals("Sabado")){
                                System.out.println("6");
                            }else{
                                if(dia.equals("Domingo")){
                                    System.out.println("7");
                                }else{
                                    System.out.println("Día ingresado no válido");
                                }
                            }                        
                        }
                    }
                }
            }
        }
    }
}
