package org.example;

public class TallerJavaEjercicio3 {

    public static void main(String[] args) {

//Ejercicio 3 tipo de clima con if-else

        int Temperatura = 1;

        if (Temperatura <= 10) {
            System.out.println("Tipo de clima frio");
        } else if (Temperatura > 10 && Temperatura <= 20) {
            System.out.println("Tipo de clima nublado");
        } else if (Temperatura > 20 && Temperatura <= 30) {
            System.out.println("tipo de clima caluroso");
        } else {
            System.out.println("Tipo de clima tropical");
        }
    }
}