/*---------------------------------*/
/*        Sebastian Camacho        */
/*---------------------------------*/

package menu_exercises;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Menu_Exercises {

    public static void main(String[] args) throws IOException, InterruptedException{
        /*---------------------------------*/
        Scanner sc = new Scanner(System.in);
        String yw="\033[33m";
        String rd= "\u001B[31m";
        /*---------------------------------*/
        boolean exit = false;
        int opt, VKilo;
        /*---------------------------------*/
        double VPago;
        double VPagar;
        double VDesc;
        /*---------------------------------*/
        int VHectas;
        int CPorcent1, CPorcent2, CPorcent3;
        int CantPinos, CantOyam, CantCedros;
        int spterreno;
        /*---------------------------------*/
        
        while (!exit) {
 
        System.out.println(yw +"|--- Menu de Operaciones ----|");
        System.out.println(yw +"| 1.- Puesto de Fruteria.    |");
        System.out.println(yw +"| 2.- Gobierno de colombia.  |");
        System.out.println(yw +"| 3.- Salir                  |");
        System.out.println(yw +"|----------------------------|");
        
 
            try {
                
                System.out.println("- Elige una opcion disponible.");
                System.out.println("");
                
                opt = sc.nextInt();
 
                switch (opt) {
                    case 1:
                         System.out.println(yw+"Bienvenido a la Fruteria.");
                        System.out.println(yw+"Por favor ingresa la cantidad de manzanas en Kg que desea comprar: ");
                        VKilo = sc.nextInt();
                        
                        if (VKilo > 0 && VKilo <= 2){
                            VPago=VKilo*2000;
                            System.out.println(yw+"Hola! El total de tu compra es de " + VPago +", ya que no tienes descuento.");
                        }
                        else if (VKilo > 2 && VKilo <= 5){
                            VPago=(VKilo*2000)-(VKilo*2000)*0.1; VPagar=VKilo*2000; VDesc=(VKilo*2000)*0.1;
                            
                            System.out.println(yw+"Hola! El valor de tu compra es de " + VPagar +", pero tienes un\n"+ yw+"descuento de "+VDesc+", por lo tanto el total de tu compra es de " +VPago);
                        }
                        else if (VKilo > 5 && VKilo <= 10){
                            VPago=(VKilo*2000)-(VKilo*2000)*0.15; VPagar=VKilo*2000; VDesc=(VKilo*2000)*0.15;
                            
                            System.out.println(yw+"Hola! El valor de tu compra es de " + VPagar +", pero tienes un\n"+ yw+"ddescuento de "+VDesc+", por lo tanto el total de tu compra es de " +VPago);
                        }
                        else if (VKilo > 10 && VKilo <= VKilo){
                            VPago=(VKilo*2000)-(VKilo*2000)*0.2;  VPagar=VKilo*2000; VDesc=(VKilo*2000)*0.2;
                            
                            System.out.println(yw+"Hola! El valor de tu compra es de " + VPagar +", pero tienes un\n"+ yw+"ddescuento de "+VDesc+", por lo tanto el total de tu compra es de " +VPago);
                        }
                        System.out.println(""); 
                        break;
                        
                    case 2:
                        do {
                            System.out.println(yw+"Ingresa la cantidad de Hectareas a sembrar: ");
                            VHectas = sc.nextInt();
                        } while (VHectas <= 0); 
                        System.out.println(yw+"¿Cual es la superficie del terreno?");
                        spterreno = sc.nextInt();

                        if (spterreno <= 1000000) {
                            CPorcent1 = (int) (spterreno * 0.5 / 100);
                            CPorcent2 = (int) (spterreno * 0.3 / 100);
                            CPorcent3 = (int) (spterreno * 0.2 / 100);
                        } else {
                            CPorcent1 = (int) (spterreno * 0.7 / 100);
                            CPorcent2 = (int) (spterreno * 0.2 / 100);
                            CPorcent3 = (int) (spterreno * 0.1 / 100);
                        }
                        CantPinos = (int) ((CPorcent1 * 8) / 10);
                        CantOyam = (int) ((CPorcent2 * 15) / 15);
                        CantCedros = (int) ((CPorcent3 * 10) / 18);
                        System.out.println(yw+"El total de Pinos a sembar es de: "+CantPinos
                                +yw+"\nEl total de Oyameles a sembrar es de: "+CantOyam
                                +yw+"\nEl total de Cedros a sembrar es de: "+ CantCedros+yw);
                        System.out.println("");
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println(rd +"Error; Solo dispones de 2 Opciones.");                     
                }//break; /* En caso de que no quiera que se repita el cilo, borrar los slash */
            } catch (InputMismatchException e) {
                System.out.println("\n"); System.out.println("\n");
                System.out.println("\n"); System.out.println("\n");

                
                System.out.println(rd+"Las letras y caracteres como signos\n"
                +rd +"no estan permitidos, por favor elige una\n"
                +rd+"opcion valida.");
                System.out.println("\n");                
                sc.next();
            }
        }
    }
}