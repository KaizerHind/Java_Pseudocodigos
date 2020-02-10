package zodiaco;

import java.util.Scanner;

public class Zodiaco {

    public static void main(String[] args) {
    int dia=0;
    int mes=0;
    Scanner leer = new Scanner(System.in);
    
    sign nsignz = new sign(dia, mes);
    System.out.println("Ingrese un dia: ");
    nsignz.setDay(leer.nextInt());
    System.out.println("Ingresa un mes: ");
    nsignz.setMounth(leer.nextInt());
    nsignz.validDate();
    nsignz.fSign();
    nsignz.getSign();
    }
    
}
