/*

Ejemplo de Ciclo Repetivo para la funcion PARA y MIENTRAS QUE.

    @author KaizerHind

*/

package ciclo_repetitivo;

public class Ciclo_Repetitivo {

    public static void main(String[] args) {
        int i;
        System.out.println("Para - Incremento\n");
        for (i = 1; i <= 10; i++) {System.out.println("El valor de 1 en el para el es: " + i);}
        System.out.println("");
        System.out.println("Para - Decremento\n");
        for (i = 10; i >= 1; i--) {System.out.println("El valor de i en el para es: " + i);}
        System.out.println("");
        System.out.println("Mientras Que\n");
        i = 1;
        while (i <= 10) {
            System.out.println("El valor de i en el mientras que es:" + i);
            i++;
        }
        System.out.println("");
        System.out.println("Haga mientras que\n");
        i= 1;
        do{ System.out.println("El valor de i en el haga mientras que es: "+ i);
        i++;
        }while(i<=10);
        
    }
    
}
