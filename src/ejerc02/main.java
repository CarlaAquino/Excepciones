package ejerc02;

import java.util.Scanner;

public class main {
    public static void main(String []arg){

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para el array: ");
        int a = leer.nextInt();
        int []elemento = new int[a];
        try {
            elemento[5]=8;
            System.out.println("El elemento es: " + elemento[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El array creado es menor al asignado");
        }

    }
}
/*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo
fuera de rango).*/