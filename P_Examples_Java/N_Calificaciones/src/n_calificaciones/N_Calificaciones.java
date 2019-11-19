package n_calificaciones;
import java.util.Scanner;

public class N_Calificaciones {

    public static void main(String[] args) {
        double N, clf, n_baja = 5, n_alta = 0, prom, suma = 0;
        int i, winner=0, gameover=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de Estudiantes: ");
        N = sc.nextDouble();

        if (N >= 1) {
            for (i = 1; i <= N; i++) {
                System.out.println("Ingresa la calificacion del estudiante #" + i + ": ");
                clf = sc.nextDouble();
                
                if (clf >= 3&& clf<=5) {winner++;}else{gameover++;}
                
                if ((clf >= 0) && (clf <= 5)) {

                    suma = suma + clf;
                    if (clf < n_baja) {
                        n_baja = clf;
                    }

                    if (clf > n_alta) {
                        n_alta = clf;
                    }
                } else {
                    System.out.println("La calificacion no puede ser negativa o mayor a 5");
                    i--;
                }
            }
            
            prom = suma / N;
            System.out.println("La cantidad de estudiantes que ganaron es de: "+winner);
            System.out.println("La cantidad de estudiantes que perdieron es de:"+gameover);
            System.out.println("");
            System.out.println("El promedio de calificacion es: " + prom);
            System.out.println("La nota mas baja es: " + n_baja);
            System.out.println("La nota mas alta es: " + n_alta);
        } else {System.out.println("Debes ingresar un numero mayor o igual a uno.");}
    }
}