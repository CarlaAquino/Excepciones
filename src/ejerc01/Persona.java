package ejerc01;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Scanner;

public class Persona {
    public String nombre;
    public int edad;
    public String sexo;
    public long peso;
    public long altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, long peso, long altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public long getPeso() {
        return peso;
    }

    public void setPeso(long peso) {
        this.peso = peso;
    }

    public long getAltura() {
        return altura;
    }

    public void setAltura(long altura) {
        this.altura = altura;
    }

    public void crearPersona() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nommbre:");
        this.nombre = leer.next();
        System.out.println("Ingrese su edad:");
        this.edad = leer.nextInt();
        System.out.println("Ingrese genero: ");
        if (sexo.equals("H") || sexo.equals("M") || sexo.equals("O")) {
            this.sexo = leer.next();
        } else {
            System.out.println("Ingrese opcion posible");
        }
        System.out.println("Ingrese su peso:");
        this.peso = leer.nextLong();
        System.out.println("Ingrese su altura:");
        this.altura = leer.nextLong();
    }

    public int calcularImc() {
        double pesoActual = peso / (Math.pow(altura, 2));
        if (pesoActual >= 20 && pesoActual <= 25) {
            System.out.println("tiene un PESO IDEAL");
            return -1;
        } else if (pesoActual > 25) {
            System.out.println("tiene SOBREPESO");
            return 0;
        } else {
            return 1;
        }
    }

    public Object esMayorDeEdad() throws NullPointerException{


        if (edad != 0) {
            throw new NullPointerException("error");
        }
        return null;
    }


}