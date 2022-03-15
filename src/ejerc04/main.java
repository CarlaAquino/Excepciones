package ejerc04;

import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[] arg) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        String num = leer.next();
        int n1= 5;
        int n2=0;
        int resultado= n1/n2;

        try {
            String num1 = String.valueOf(Integer.parseInt(num));
            System.out.println("El numero es : " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error!! las cadenas no son numeros");
        } catch (ArithmeticException ee){
            System.out.println("La division con n1 /n2 : " + resultado);
            System.out.println("Error!! no se puede dividir por 0");
        }
    }
}
 /*Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado
puede causar una excepción de tipo InputMismatchException, el método
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
NumberFormatException y además, al dividir un número por cero surge una
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
try/catch para las distintas excepciones*/