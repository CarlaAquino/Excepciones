package ejerc03;

import java.util.Locale;
import java.util.Scanner;

public class main {

    public static void main(String[]arg){

        DivisionNumero divisionN = new DivisionNumero();
        Scanner leer = new Scanner(System.in);

            System.out.println("Ingrese primer numero: ");
            String n1 = leer.next();
            System.out.println("Ingrese segundo numero: ");
            String num2 = leer.next();

            try{

                int num1 = Integer.parseInt(n1);
                int mun2 = Integer.parseInt(num2);
                System.out.println("La division es :" + divisionN.crearDivision());
            } catch (ArithmeticException e) {
                System.out.println("Error!! tipo imcompatibles");
            }catch (Exception exception) {
                System.out.println("Error!! no se puede dividir por 0");
        }

    }

}
/*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para
leer dos números en forma de cadena. A continuación, utilice el método parseInt() de la
clase Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo
int. Por ultimo realizar una división con los dos numeros y mostrar el resultado*/