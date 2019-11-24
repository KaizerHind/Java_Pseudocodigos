/*

    El gobierno de un país desea reforestar un bosque que
    mide determinado número de hectáreas. Si la superficie
    del terreno excede a 1 millón de m2, entonces decidirá
    sembrar de la siguiente manera:

    - Porcentaje de la superficie del bosque Tipo de Árbol
    70% Pino
    20% Oyamel
    10% Cedro

    Si la superficie del terreno es menor o igual a 1 millón
    de m2 entonces decidirá sembrar de la siguiente manera:

    - Porcentaje de la superficie del bosque Tipo de Árbol
    • 50% Pino
    • 30% Oyamel
    • 20% Cedro

    El gobierno desea saber el numero de pinos, oyameles y cedras que
    tendrá que sembrar en el bosque, si se sabe que en 10 m2 caben
    8 pinos, en 15 m2 caben 15 oyameles y en 18 m2

    @author Kaizerhind

 */
package cantidad_hectareas;
import java.util.Scanner;

public class Cantidad_Hectareas {

    public static void main(String[] args) {
        /*---------------------------------*/
        Scanner sc = new Scanner(System.in);
        String yw = "\033[33m";
        /*---------------------------------*/
        int VHectas;
        int CPorcent1, CPorcent2, CPorcent3;
        int CantPinos, CantOyam, CantCedros;
        int spterreno;
        /*---------------------------------*/
        
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
    }   
}
