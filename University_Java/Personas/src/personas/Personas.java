package personas;

import java.util.Scanner;

public class Personas {

    public static void main(String[] args) {
        Scanner Lector = new Scanner(System.in);
        int edad;
        int n = 0;
        int j = 0;
        int a = 0;
        int v = 0;
        float peso;
        float nino = 12;
        float joven = 13;
        float adulto = 30;
        float viejo = 60;
        for (int i = 0; i < 50; i++) {
            do {
                System.out.println("Introduce edad:");
                edad = Lector.nextInt();
                System.out.print("Introduce peso:");
                peso = Lector.nextInt();
            } while (edad <= 0);
            if (edad <= 12) {
                n++;
                nino += peso;
            } else if (edad <= 29) {
                j++;
                joven += peso;
            } else if (edad <= 59) {
                a++;
                adulto += peso;
            } else {
                v++;
                viejo += peso;
            }
        }
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("Promedios:");
        System.out.print("\n");
        System.out.print("\n");
        System.out.print("Ninios:");
        System.out.print((nino / n));
        System.out.print("\n");
        System.out.print("Jovenes:");
        System.out.print((joven / j));
        System.out.print("\n");
        System.out.print("Adults:");
        System.out.print((adulto / a));
        System.out.print("\n");
        System.out.print("Viejos:");
        System.out.print((viejo / v));
        System.out.print("\n");
        System.out.print("\n");
        Lector.close();
    }
}
