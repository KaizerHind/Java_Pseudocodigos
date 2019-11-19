/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.Scanner;

/**
 *
 * @author mjimenez47
 */
public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int op;
        Scanner inI = new Scanner(System.in);
        Scanner inD = new Scanner(System.in);
        Scanner inS = new Scanner(System.in);
        
        System.out.println("Menú");
        System.out.println("-------------------");
        System.out.println("1. Cálculo de pulsaciones");
        System.out.println("2. Preguntas");
        System.out.print("--->");
        op = inI.nextInt();
        
        switch(op){
            case 1: 
                double num_pulsaciones, edad, segundos = 10;
                String sexo; //M o F
                
                System.out.print("Ingrese la edad de la persona: ");
                edad = inD.nextDouble();
                if (edad >= 0){
                    System.out.print("Ingrese el sexo de la persona (M o F): ");
                    sexo = inS.nextLine();

                    switch (sexo){
                        case "m":
                        case "M":
                            num_pulsaciones = (210 - edad)/segundos;
                            System.out.println("Número de pulsaciones: " + num_pulsaciones);
                            break;
                        case "f":
                        case "F":
                            num_pulsaciones = (220 - edad)/segundos;
                            System.out.println("Número de pulsaciones: " + num_pulsaciones);
                            break;
                        default:
                            System.out.println("El sexo ingresado es inválido.");
                    }
                }else{
                    System.out.println("La edad debe ser mayor o igual a cero.");
                }
                break;
                
            case 2:
                String res;
                System.out.println("Responda si o no a las siguientes preguntas: ");
                System.out.print("1. ¿Colón descubrió América? R/");
                res = inS.nextLine();
                if((res.equals("Si"))||(res.equals("SI"))||(res.equals("si"))){
                    System.out.println("La respuesta es correcta!");
                    System.out.print("2. ¿La independencia de Colombia fue en el año 1815? R/");
                    res = inS.nextLine();
                    if((res.equals("No"))||(res.equals("NO"))||(res.equals("no"))){
                        System.out.println("La respuesta es correcta!");
                        System.out.print("3. ¿The Doors fue un grupo de rock americano? R/");
                        res = inS.nextLine();
                        if((res.equals("Si"))||(res.equals("SI"))||(res.equals("si"))){
                            System.out.println("La respuesta es correcta!");
                        }else{
                            System.out.println("Respuesta es incorrecta!");
                        }
                    }else{
                        System.out.println("Respuesta es incorrecta!");
                    }
                }else{
                    System.out.println("Respuesta es incorrecta!");
                }
                break;
            default:
                System.out.println("Opción ingresada inválida!");
        }
        
    }
    
}
