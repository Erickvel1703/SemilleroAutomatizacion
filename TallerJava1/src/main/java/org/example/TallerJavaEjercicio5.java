package org.example;

import java.util.Scanner;

public class TallerJavaEjercicio5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor introduzca un Numero");

        int entradaTeclado = scanner.nextInt();


        if (entradaTeclado < 0) {
            System.out.println("El numero es negativo");
        } else if (entradaTeclado > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("el numero es igual a cero");
        }

    }
}