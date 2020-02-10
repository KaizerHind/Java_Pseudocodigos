package matrizcuadrada;

import java.util.Scanner;

public class MatrizCuadrada {

public static void main(String[] args) 
{
    Scanner entrada;
    entrada = new Scanner(System.in);
    int numeros[][] = new int[3][3];
    int suma;

        
    System.out.println("Ingrese datos de la matriz de 3x3");

    for (int h = 0; h != 3; ++h) 
    {
        for (int j = 0; j != 3; ++j) 
        {
            System.out.print("numeros[" + h + "][" + j + "]: ");
            numeros[h][j] = entrada.nextInt();
        }
    }

    System.out.println("\nContenido de la matriz: ");

    for (int[] num : numeros) 
    {
        for (int elem : num) 
        {
            System.out.print(elem + "\t");      
        }
        System.out.print("\n");
    }

    int columna = 0;

    while (columna < 1 || columna > 3)
    {
        System.out.println("¿Que columna deseas sumar?: ");
        columna = entrada.nextInt();
    } 

    columna = columna - 1;
    suma = 0;

    for (int i = 0; i != 3; ++i)
    {
        suma += numeros[i][columna];
    }

    System.out.println("La suma de la columna " + (columna + 1) + " dio un resultado de " + suma);

    int fila = 0;

    while (fila < 1 || fila > 3)
    {
        System.out.println("Introduce la fila que quieres sumar:  ");
        fila = entrada.nextInt();
    }

    fila = fila - 1;

    suma = 0; 

    for (int i = 0; i != 3; ++i)
    {
        suma += numeros[fila][i];
    }

    System.out.println("La suma de la fila " + (fila + 1) + " dio un resultado de " + suma);

    suma = 0; //reseteamos la suma

    //suma de la diagonal
    for (int i = 0; i != 3; ++i)
    {
        suma += numeros[i][i];
    }

    System.out.println("La suma en diagonal de la matriz dio un resultado de " + suma);

    suma = 0; //reseteamos la suma

    //suma de diagonal invertida
    for (int i = 0; i != 3; ++i)
    {
        suma += numeros[i][2 - i];
    }

    System.out.println("La suma en diagonal invertida de la matriz dio un resultado de " + suma);
    }    
}



