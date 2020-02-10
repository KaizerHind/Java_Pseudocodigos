package s_elements;

import java.util.Scanner;

public class S_Elements {

    /*---------------------------------*/
    String nombre[];
    String res;
    double cantidad[], precio[];
    double mayor = 0;
    double menor = 0;
    int opt, producto;
    /*---------------------------------*/
    Scanner ind = new Scanner(System.in);
    Scanner S = new Scanner(System.in);
    String yw = "\033[33m";
    String rd = "\u001B[31m";
    /*---------------------------------*/
    boolean exit = false;
    /*---------------------------------*/
    public void cargar() {
        while (!exit) {
            System.out.println(yw + "|--------------------------|");
            System.out.println(yw + "| 1. Busqueda Elementos.   |");
            System.out.println(yw + "| 2. Calcular Ventas.      |");
            System.out.println(yw + "| 3. Salir.                |");
            System.out.println(yw + "|--------------------------|");

            try {
                System.out.print("\nElige una opción: ");

                opt = ind.nextInt();
                switch (opt) {
                    case 1:
                        int n;
                        String caracteres[],
                         dato;
                        System.out.print("Ingrese los numeros deseados:");
                        n = ind.nextInt();
                        if (n > 0) {
                            caracteres = new String[n];
                            for (int i = 0; i < n; i++) {
                                System.out.print("Ingrese el dato numero " + (i + 1)+":");
                                caracteres[i] = S.nextLine();
                            }
                            for (int i = 0; i < n; i++) {
                                System.out.print("Ingrese un dato a buscar o comparar: ");
                                dato = S.nextLine();
                                if (caracteres[i].equals(dato)) {
                                    System.out.println("El dato " + caracteres[i] + "se encuentra dentro del vector");
                                    System.out.println("El dato se encontró " + (i + 1) + "veces en el vector");
                                } else {
                                    System.out.println("Al parecer hay datos registrados.");
                                    System.out.print("¿Desea realizar otra busqueda?");
                                    res = S.nextLine();
                                    if (res.equals("si") || res.equals("Si") || res.equals("SI") || res.equals("sI")) {
                                        for (i = 0; i < n; i++) {
                                            System.out.print("Ingrese un dato a buscar o comparar:");
                                            dato = S.nextLine();
                                            if (caracteres[i].equals(dato)) {
                                                System.out.println("El dato " + caracteres[i] + "se encuentra dentro del vector");
                                                System.out.println("El dato se encontró " + (i + 1) + "veces en el vector");
                                            } else {
                                                System.out.println("No se a encontrado ningun dato.");
                                                System.out.print("¿Desea realizar otra busqueda?");
                                                res = S.nextLine();
                                            }
                                        }
                                    }
                                    if (res.equals("no") || res.equals("No") || res.equals("NO") || res.equals("nO")) {
                                        System.out.println("Bienvenido de nuevo al Menu Principal.");
                                        break;
                                    }
                                }
                            }
                        }
                    case 2:
                        System.out.print("¿Cuantos clientes deseas ingresar?: ");
                        producto = ind.nextInt();
                        nombre = new String[producto];
                        cantidad = new double[producto];
                        precio = new double[producto];

                        for (int i = 0; i < producto; i++) {
                            System.out.print("Digite el nombre del producto(s)" + (i + 1) + ": ");
                            nombre[i] = S.nextLine();
                            System.out.print("Ingrese el precio del producto: ");
                            precio[i] = ind.nextDouble();
                        }
                        for (int i = 0; i < producto; i++) {
                            if (precio[i] > mayor) {
                                mayor = precio[i];
                            }
                            if (precio[i] < menor) {
                                menor = precio[i];
                            }
                        }
                        for (int i = 0; i < producto; i++) {
                            if (precio[i] == mayor) {
                                System.out.println("El producto mas costoso es:" + nombre[i]);

                            }
                        }
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        System.out.println(rd + "Error; Solo dispones de 2 Opciones.");
                }
            } catch (Exception e) {
            }
        }
    }

    public static void main(String[] ar) {
        S_Elements pv = new S_Elements();
        pv.cargar();
    }

}
