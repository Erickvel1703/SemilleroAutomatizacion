package org.example;

public class TallerJavaEjercicio4 {

    public static void main(String[] args) {

//Ejercicio 4 tipo de clima con switch


  int Temp = 0;

switch ((0 <= Temp && Temp <= 10 ) ? 0 : (11 <= Temp && Temp <= 20) ? 1 : (20 <= Temp && Temp <= 30) ? 2 : 3)  {

    case 0:
        System.out.println("Tipo de clima Frio");
        break;
    case 1 :
        System.out.println("Tipo de clima Nublado");
        break;
    case 2 :
        System.out.println("Tipo de clima Caluroso");
        break;
    case 3 :
        System.out.println("Tipo de clima Tropical");
        break;
}




    }
}