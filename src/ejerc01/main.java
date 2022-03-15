package ejerc01;

import java.util.Scanner;

public class main {

    public static void main(String [] arg){
        Scanner leer = new Scanner(System.in);
        Persona persona = new Persona();
        System.out.println("ingrese su edad:");
        Object edad = leer.nextInt();
        try {
            System.out.println("la edad es: " + persona.getEdad());
            edad=persona.esMayorDeEdad();
        } catch (NullPointerException e) {

            System.out.println("Aqui sale un error!!");
        }
    }
}
