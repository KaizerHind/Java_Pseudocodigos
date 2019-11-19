package s_elements;
/*Victor De la hoz - Sebastian Camacho*/
import java.util.Scanner;

public class S_Elements {
    /*---------------------------------*/
    String nombre[];
    double cantidad[], precio[];
    double mayor=0;
    double menor=0;
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
                        System.out.println("Bienvenido de nuevo al Menu Principal.");
                        break;
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
                                //System.out.println("El producto mas costoso es: " +nombre[i]);
                                //System.out.println(nombres[i]);
                            }
                            if(precio[i] < menor){
                            menor = precio[i];
                            }
                        }
                        for (int i = 0; i < producto; i++) {
                        if(precio[i] == mayor){
                            System.out.println("El producto mas costoso es:"+nombre[i]);
                            
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

    /*public void imprimir() {

    }*/
    
    public static void main(String[] ar) {
        S_Elements pv=new S_Elements();
        pv.cargar();
        //pv.imprimir();
    }

}
