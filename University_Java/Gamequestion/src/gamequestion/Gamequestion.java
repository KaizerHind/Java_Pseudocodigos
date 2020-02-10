package gamequestion;
import java.util.Scanner;

public class Gamequestion {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String red="\033[31m";
        
        String x;
        String y;
        String w;
        
        System.out.println("¿colon descubrio america?");
        x = sc.next();    
        if(x.equals("si")){ 
            System.out.println("haz ganado un punto");

            System.out.println("la independencia de Colombia fue en el año 1815?");
            y = sc.next();        
            if(y.equals("no")){
                System.out.println("haz ganado dos puntos");

                System.out.println("The Doors estero fue un grupo de rock americano?");
                w = sc.next();
                if(w.equals("si")){
                     System.out.println("acabaste el juego haz ganado tres puntos");
                
                }else{System.out.println(red +"Has fallado la 3ra pregunta.\nSi fue un grupo de rock americano.");}
            }else{System.out.println(red +"Has fallado la 2da pregunta.\n Colombia no se independizo en 1815. ");}
        }else{System.out.println(red +"Has fallado la 1ra  pregunta.\nColon si descubrio America.");}
    }
    
}