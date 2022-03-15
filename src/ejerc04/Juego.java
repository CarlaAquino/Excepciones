package ejerc04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Juego {

    private int numAdivinar;
    private Scanner leer;

    public Juego() {
        this.numAdivinar = numAdivinar;
        this.leer = new Scanner(System.in);
    }

    public int getNumAdivinar() {
        return numAdivinar;

    }

    public void setNumAdivinar(int numAdivinar) {
        this.numAdivinar = numAdivinar;
    }

    public void adivinar() {
        this.numAdivinar = (int) (Math.random() * 500);
        int numero= 0;
        int intentos = 0;
        do {
            boolean band;
            do {
                System.out.println("Introducir numero del 1 al 500");
                try {
                    intentos++;
                    numero = leer.nextInt();
                    System.out.println("El numero introducido es :" + numero);
                    band = true;
                } catch (InputMismatchException exception) {
                    System.out.println("Debe introducir un numero entero!!!");
                    leer.next();
                    band = false;
                }
            } while (band == false);
            if (numero > numAdivinar) {
                System.out.println("El numero es menor sigue intentando...");
            }
            if (numero < numAdivinar) {
                System.out.println("El numero es mayor, sigue intentando...");
            }
        } while (numero != numAdivinar);
        System.out.println("FELICIDADES, has acertado el numero es: " + numAdivinar);
        System.out.println("El numero de intentos fueron: " + intentos);
    }
}


