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
        int opcion;
        Scanner in = new Scanner(System.in);
        Scanner inD = new Scanner(System.in);
        Scanner inS = new Scanner(System.in);

        System.out.println("Menú");
        System.out.println("---------------------");
        System.out.println("1. Pulsaciones");
        System.out.println("2. Preguntas");
        System.out.print("Ingrese la opción --> ");
        opcion = in.nextInt();
        
        switch(opcion){
            case 1:
                double num_pulsaciones, edad;
                String sexo; //M o F
        
               
                System.out.print("Ingrese la edad de la persona: ");
                edad = inD.nextDouble();

                if((edad>0)&&(edad<123)){
                    System.out.print("Ingrese el sexo de la persona (M o F): ");
                    sexo = inS.nextLine();

                    switch(sexo){
                        case "M":
                        case "m":
                            num_pulsaciones = (210 - edad)/10;
                            System.out.println("El número de pulsaciones de la persona es " + num_pulsaciones);
                            break;
                        case "f":
                        case "F":
                            num_pulsaciones = (220 - edad)/10;
                            System.out.println("El número de pulsaciones de la persona es " + num_pulsaciones);
                            break;
                        default:
                            System.out.println("El sexo de la persona es inválido.");
                    }
                }else{
                    System.out.println("La edad ingresada debe ser mayor a cero y menor a 123 años.");
                }
                break;
            case 2:
                String resp;
                System.out.println("Responda si o no a las siguientes preguntas:");
                System.out.print("¿Colón descubrió América? R/");
                resp = inS.nextLine();

                if((resp.equals("SI"))||(resp.equals("Si"))||(resp.equals("si"))||(resp.equals("s"))){
                    System.out.println("Repuesta correcta!");
                    System.out.print("¿La independencia de Colombia fue en el año 1815? R/");
                    resp = inS.nextLine();
                    if((resp.equals("NO"))||(resp.equals("No"))||(resp.equals("no"))||(resp.equals("n"))){
                        System.out.println("Repuesta correcta!");
                        System.out.print("¿The Doors fue un grupo de rock americano? R/");
                        resp = inS.nextLine();
                        if((resp.equals("SI"))||(resp.equals("Si"))||(resp.equals("si"))||(resp.equals("s"))){
                            System.out.println("Repuesta correcta! Usted respondió todas las preguntas correctamente!");
                        }else{
                            System.out.println("Respuesta incorrecta");
                        }
                    }else{
                        System.out.println("Respuesta incorrecta");
                    }
                }else{
                    System.out.println("Respuesta incorrecta");
                }
                break;
            default:
                System.out.println("Opción incorrecta.");
        }
    }
    
}
