package cuc_work;

import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;

public class Cuc_work {

    public static void main(String[] args) {
        /*---------------------------------*/
        Scanner in = new Scanner(System.in);
        Scanner S = new Scanner(System.in);
        String yw = "\033[33m";
        String rd = "\u001B[31m";
        /*---------------------------------*/
        boolean exit = false;
        String nombre[], direccion[], res;
        int op, cliente, codigo[], consumo;
        ArrayList<String> lista = new ArrayList<String>();
        /*---------------------------------*/

        while (!exit) {
            System.out.println(yw + "|--------------------------------------------------|");
            System.out.println(yw + "| 1. Ingresar cliente.                             |");
            System.out.println(yw + "| 2. Ingresar consumos.                            |");
            System.out.println(yw + "| 3. Ver consumo y factura por cliente.            |");
            System.out.println(yw + "| 4. Ver consumos y facturas de todos los clientes.|");
            System.out.println(yw + "| 5. Salir.                                        |");
            System.out.println(yw + "|--------------------------------------------------|");

            try {
                System.out.print("\nElige una opción: ");

                op = in.nextInt();
                switch (op) {
                    case 1:
                        System.out.print("¿Cuantos clientes deseas ingresar?: ");
                        cliente = in.nextInt();
                        //if (cliente > 0) {
                            for (int i = 0; i < cliente; i++) {

                                System.out.print("Ingresa codigo del cliente: " + (i + 1) + ": ");
                                codigo = new int[cliente];
                                lista.add("");
                                codigo[i] = in.nextInt();
                                /*----------------------------------------------------------*/
                                System.out.print("Ingresa nombre del cliente: ");                           
                                nombre = new String[cliente];
                                nombre[i] = S.nextLine();
                                /*----------------------------------------------------------*/
                                System.out.print("Ingresa direccion del cliente: ");
                                direccion = new String[cliente];
                                direccion[i] = S.nextLine();
                                /*----------------------------------------------------------*/
                                System.out.println("");
                            }
                            System.out.println("Bienvenido de nuevo al Menu Principal.");
                            break;
                        //}
                    case 2:
                        
                        break;
                    case 3:
                        break;
                    case 4:
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println(rd + "Error; Solo dispones de 2 Opciones.");
                }
            } catch (Exception e) {
                /*System.out.println(rd+"Las letras y caracteres como signos\n"
                +rd +"no estan permitidos, por favor elige una\n"
                +rd+"opcion valida.");
                System.out.println("\n");                
                S.next();*/
            }
        }
    }

}
