package taller;

import java.util.Scanner;

public class Taller {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        Scanner S = new Scanner (System.in);
        boolean exit = false;
        String nombre[],direccion[],res;
        int op,codigo[];
        int cliente;
        while (!exit){
        System.out.println("Menú");
        System.out.println("-------------------");
        System.out.println("1. Ingresar cliente");
        System.out.println("2. Ingresar consumos ");
        System.out.println("3. Ver consumo y factura por cliente  ");
        System.out.println("4. Ver consumos y facturas de todos los clientes  ");
        System.out.println("5. Salir ");
        System.out.print("--->");
     
        try {
            System.out.print("Elige una opción: ");
            
            op = in.nextInt();
            switch(op){
                case 1:
                    System.out.print("Ingrese el numero de clientes: ");
                    cliente = in.nextInt();
                    nombre = new String [cliente];
                    direccion = new String [cliente];
                    codigo = new int [cliente];
                    
                    for (int i=0;i<cliente;i++){
                    System.out.print("Ingrese el codigo del cliente "+(i+1)+": ");
                    codigo[i] = in.nextInt();
                    System.out.print("Ingrese el nombre del cliente: ");
                    nombre[i] = S.nextLine();
                    System.out.print("Ingrese la dirreccion del cliente: ");
                    direccion[i] = S.nextLine();
                    System.out.println("Desea ingresar otro cliente? ");
                    res = S.nextLine();
                    if (res.equals("si")||res.equals("SI")||(res.equals("Si"))){
                        i =1;
                    System.out.print("Ingrese el codigo del cliente "+(i+1)+ ": ");
                    codigo[i] = in.nextInt();
                    System.out.print("Ingrese el nombre del cliente: ");
                    nombre[i] = S.nextLine();
                    System.out.print("Ingrese la dirreccion del cliente: ");
                    direccion[i] = S.nextLine();
                    System.out.print("Desea ingresar otro cliente?"+"\n");
                    
                    res = S.nextLine();
                    } else{
                        if (res.equals("no")||(res.equals("NO")||(res.equals("No")))){
                            System.out.println("Usted a sido redirigido al menu principal.");
                        }                    break;
                    }
                    }
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
            }
        } catch (Exception e) {
        }
        }
        
    }
    
}
