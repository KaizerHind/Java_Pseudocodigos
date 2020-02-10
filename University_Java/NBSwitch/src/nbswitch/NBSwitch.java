package nbswitch;
import java.util.Scanner;

public class NBSwitch {

    public static void main(String[] args) {
        
        double n1, n2, res;
        String op;
        
        Scanner inD = new Scanner(System.in);
        Scanner inS = new Scanner(System.in);
        System.out.print("Ingrese el primer valor: ");
        n1 = inD.nextDouble();
        System.out.print("Ingrese el 2do valor: ");
        n2 = inD.nextDouble();
        System.out.println("Digite la operacion a realizar S, R, M, D.");
       
        
        op = inS.nextLine();
        switch (op) {
            case "S":
                res = n1 + n2;
                System.out.println("La suma de " + n1 + " + " + n2 + " es: "+res);
                break;
                
            case "R":
                res = n1 - n2;
                System.out.println("La suma de " + n1 + " - " + n2 + " es: "+res);
                break;
                
            case "M":
                res = n1 * n2;
                System.out.println("La suma de " + n1 + " x " + n2 + " es: "+res);
                break;
                
            case "D":
                if(n2!=0){
                res = n1 / n2;
                System.out.println(" La division de " + n1 + " / " + n2 + " es: "+res);
                } else{
                System.out.println("No se puede realizar la operacion");
                }
                break;
                
            default:
                System.out.println("Ingrese una opcion valida.");                       
        }                       
    }    
}
