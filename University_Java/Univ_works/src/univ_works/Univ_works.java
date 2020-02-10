package univ_works;

import java.util.Scanner;
        
public class Univ_works {

private Scanner teclado;
private int [][] mat;
    
    public static void main(String[] args) {
        
        /*Excersise 1 
        int a=5, b=2;
        int suma, resta, multip=a*b;
        double division=(double)a/b;
        int resto=a%b;
        
        System.out.println(a+b);*/
        
        Univ_works ma=new Univ_works();
        ma.cargar();
        ma.imprimirMayor();
    }
    
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        int filas=teclado.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        int columnas=teclado.nextInt();
        mat=new int[filas][columnas];
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingrese componente:");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
        
    public void imprimirMayor() {
    	int mayor=mat[0][0];
    	int filamay=0;
    	int columnamay=0;
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                if (mat[f][c]>mayor) {
                    mayor=mat[f][c];
                    filamay=f;
                    columnamay=c;
                }
            }
        }
        System.out.println("El elemento mayor es:"+mayor);
        System.out.println("Se encuentra en la fila:"+filamay+ " y en la columna: "+columnamay);
    } 
}
