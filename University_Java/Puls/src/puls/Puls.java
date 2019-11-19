package puls;
import java.util.Scanner;

public class Puls {

    public static void main(String[] args) {
        double npuls, edad, segs = 10;
        String sexo;
        
        Scanner inD = new Scanner(System.in);
        Scanner inS = new Scanner(System.in);        
        
        System.out.println("Ingresa la edad: ");
        edad = inD.nextDouble();
        
        if(edad >= 0){
        System.out.println("Ingresa el sexo de la persona M/F: ");
        sexo = inS.nextLine();
        switch(sexo)
            {
                case "m":
                case "f":

                    npuls = (210 - edad/segs);
                    System.out.println("Numero de pulsaciones: "+npuls );
                    break;
                case "M":
                case "F":
                    npuls = (210 - edad/segs);
                    System.out.println("Numero de pulsaciones: "+npuls );
                    break;
                default:
                    System.out.println("El sexo ingresado no es valido.");
            }
        }else{
        System.out.println("La edad debe ser mayor o igual a 0. ");
        }
    }   
}

/*
Proceso Pulsaciones 
	Escribir "Indique su edad: "; 
	Leer age; 
	Escribir "Indique si su sexo es masculino femenino (M o F): "; 
	Leer sexo; 
	Si ((sexo="M") | (sexo="m")) Entonces 
		hpulsos<-(210-age)/10; 
	Sino 
		hpulsos<-(220-age)/10; 
	FinSi 
	Escribir "El numero de pulsaciones que usted tiene es de: ",hpulsos; 
FinProceso
*/