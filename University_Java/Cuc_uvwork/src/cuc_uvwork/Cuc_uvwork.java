/*

    La empresa X desea gestionar el consumo y la facturación de
    sus clientes mientras un programa realizado en el lenguaje de programación Java. 

    El programa debe tener las siguientes funciones en un menú: 

    1.Ingresar clientes 
    2.Ingresar consumos 
    3.Ver consumo y factura por cliente 
    4.Ver consumos y facturas de todos los clientes 
    5.Salir 

    Descripcion: 

    - Ingresar clientes: Se debe ingresar el código del cliente, su nombre
    y su dirección.

    Una vez se ingresa un cliente, se debe preguntar si se ingresa
    otro, si no quiere ingresar más clientes, se debe volver al menú principal. 

    - Ingresar consumo: Para los clientes ingresados, se debe agregar cuantos
    kilovatios consumió. Se debe tener en cuenta: 

    - Si no hay clientes, no se puede agregar ningún consumo.     

    - Para agregar un consumo se debe ingresar el código del cliente y el consumo.
    
    - Se debe comprobar que el código del cliente existe. 
    - Los consumos deben ser mayores a cero. 
    - Si el cliente ya tiene un consumo agregado, se debe preguntar si desea
    modificar el consumo que se encuentra guardado.  
    
    - Una vez se ingrese el consumo, se debe preguntar si desea agregar un consumo
    adicional. Si no se desea ingresar otro consumo, se debe volver al menú principal. 
    
    - Ver consumo y factura por cliente: Se debe ingresar un código del cliente.
    
    - Si se encuentra, se debe mostrar toda su información, el consumo y el valor
    de la factura (Multiplicar el consumo por 700). Si no se encuentra, se le
    debe informar al usuario. Preguntar si se desea verificar otro consumo, en 
    caso negativo, se debe volver al menú principal. 
    
    - Ver consumos y facturas de todos los clientes: Se deben mostrar los datos
    de todos los clientes, junto a su consumo y el valor de la factura
    (Multiplicar el consumo por 700), y al final mostrar el total y el
    valor promedio de los consumos, y los valores totales de facturación y el
    valor promedio de facturación por cliente. Una vez se muestre esto
    (no se muestra si no hay información), se debe pedir al usuario que ingrese
    cualquier tecla para continuar y se debe mostrar el menú. 
    
    - Salir: Debe finalizar el programa. 
    
    @author Kaizerhind
 */
package cuc_uvwork;


import java.util.Scanner;

public class Cuc_uvwork {

    /*---------------------------------*/
    Scanner D = new Scanner(System.in);
    Scanner in = new Scanner(System.in);
    Scanner S = new Scanner(System.in);
    String prp = "\u001B[35m";
    String rd = "\u001B[31m";
    /*---------------------------------*/
    boolean exit = false;
    String nombre[] = new String[1000], direccion[] = new String[1000], res;
    int op, cliente, codigo[] = new int[1000];
    double consumo[] = new double[1000];

    /*---------------------------------*/

    public void cargar() {
        while (!exit) {
            System.out.println(prp + "|--------------------------------------------------|");
            System.out.println(prp + "| 1. Ingresar cliente.                             |");
            System.out.println(prp + "| 2. Ingresar consumos.                            |");
            System.out.println(prp + "| 3. Ver consumo y factura por cliente.            |");
            System.out.println(prp + "| 4. Ver consumos y facturas de todos los clientes.|");
            System.out.println(prp + "| 5. Salir.                                        |");
            System.out.println(prp + "|--------------------------------------------------|");
            System.out.println("\n");
            
            try {
                System.out.print(prp +"Elige una opción: ");

                op = in.nextInt();
                switch (op) {
                    case 1:
                        String respuesta;
                        do {
                            respuesta = "";
                            System.out.print(prp +"¿Cuantos clientes deseas ingresar?: ");
                            cliente = in.nextInt();
                            for (int i = 0; i < 1000; i++) {
                                if (codigo[i] == 0) {
                                    for (int j = 0; j < cliente; j++) {
                                        boolean nosepuede = false;
                                        System.out.print(prp +"Ingresa codigo del cliente: " + (j + 1) + ": ");
                                        codigo[i] = in.nextInt();
                                        if (codigo[i] <= 0) {
                                            nosepuede = true;
                                            System.out.println(rd +"Solo se admiten valores mayores a 0.");
                                        } else {
                                            for (int k = 0; k < i; k++) {
                                                if (codigo[k] == codigo[i]) {
                                                    nosepuede = true;
                                                    System.out.println(rd+ "Este codigo ya esta repetido o esta en uso.");
                                                }
                                            }
                                        }

                                        if (nosepuede == false) {
                                            /*----------------------------------------------------------*/
                                            System.out.print(prp +"Ingresa nombre del cliente: ");
                                            nombre[i] = S.nextLine();
                                            /*----------------------------------------------------------*/
                                            System.out.print(prp +"Ingresa direccion del cliente: ");
                                            direccion[i] = S.nextLine();
                                            /*----------------------------------------------------------*/
                                            System.out.println("");
                                            i++;
                                        } else {
                                            j--;
                                        }
                                        
                                    }
                                    break;
                                }
                            }
                            System.out.print(prp +"¿Quieres ingresar mas clientes? s/n: ");
                            respuesta = S.nextLine();
                        } while (respuesta.equalsIgnoreCase("s"));
                        System.out.println(prp +"Bienvenido de nuevo al Menu Principal.");
                        break;
                    case 2:
                        int n;
                        String respuesta2;
                        if (codigo[0] == 0) {
                            System.out.println(rd +"Actualmente no hay clientes registrados.");
                        } else {
                            do {
                                System.out.print(prp +"Ingresa el codigo del cliente: ");
                                n = in.nextInt();
                                respuesta2 = "";
                                for (int i = 0; i < 1000; i++) {
                                    if (codigo[i] == n) {
                                        if (consumo[i] == 0) {
                                            System.out.print(prp +"Ingresa el consumo del cliente: ");
                                            do {
                                                consumo[i] = D.nextDouble();
                                                if (consumo[i] <= 0) {
                                                    System.out.println(rd +"El consumo debe ser mayor que 0.");
                                                }
                                            } while (consumo[i] <= 0);
                                            break;
                                        } else {
                                            System.out.print(prp +"Ya este cliente tiene un consumo ingresado. ¿Desea modificarlo? s/n: ");
                                            respuesta2 = S.nextLine();
                                            if (respuesta2.equalsIgnoreCase("s")) {
                                                System.out.print(prp +"Ingresa el consumo del cliente: ");
                                                do {
                                                    consumo[i] = D.nextDouble();
                                                    if (consumo[i] <= 0) {
                                                        System.out.println(rd +"El consumo debe ser mayor que 0");
                                                    }
                                                } while (consumo[i] <= 0);
                                            }
                                            break;
                                        }
                                    } else if (codigo[i] == 0) {
                                        System.out.println(rd +"No hay ningun cliente registrado con este codigo.");
                                        break;
                                    }
                                }
                                respuesta2 = "";
                                System.out.print(prp +"Quieres ingresar otro consumo? s/n: ");
                                respuesta2 = S.nextLine();
                            } while (respuesta2.equalsIgnoreCase("s"));
                        }

                        break;
                    case 3:
                        System.out.print("Ingresa el codigo del cliente:");
                        n = in.nextInt();

                        for (int i = 0; i < 1000; i++) {
                            if (codigo[i] == n) {
                                System.out.println(prp + "|--------------------------|");
                                System.out.println(prp + "| Codigo: " + codigo[i]);
                                System.out.println(prp + "| Nombre: " + nombre[i]);
                                System.out.println(prp + "| Direccion: " + direccion[i]);
                                System.out.println(prp + "| Consumo: " + consumo[i]);
                                System.out.println(prp + "| Valor de la factura: $" + (consumo[i] * 700));
                                System.out.println(prp + "|--------------------------|");
                                System.out.println("");

                            } else if(codigo[i] == n) {
                                System.out.println(rd + "No hay ningun cliente registrado con este codigo.");
                                break;
                            }
                        }               
                        
                        break;
                    case 4:
                        for (int i = 0; i < 1000; i++) {
                            if (codigo[i] == 0) {
                                break;
                            } else {
                                System.out.println(prp + "|--------------------------|");
                                System.out.println(prp + "| Codigo: " + codigo[i]);
                                System.out.println(prp + "| Nombre: " + nombre[i]);
                                System.out.println(prp + "| Direccion: " + direccion[i]);
                                System.out.println(prp + "| Consumo: " + consumo[i]);
                                System.out.println(prp + "| Valor de la factura: $" + (consumo[i] * 700));
                                System.out.println(prp + "|--------------------------|");
                                System.out.println("");
                            }
                        }
                        System.out.print(prp +"Presione enter para continuar...");
                        S.nextLine();
                        break;
                    case 5:
                        System.exit(0);
                    default:
                        System.out.println(rd + "Error; Solo dispones de 5 Opciones.");
                }
            } catch (Exception e) {
                System.out.println("Error, al parecer no has escrito una opcion valida.");
            }
        }
    }

    public static void main(String[] args) {
        Cuc_uvwork pv = new Cuc_uvwork();
        pv.cargar();
    }

}
