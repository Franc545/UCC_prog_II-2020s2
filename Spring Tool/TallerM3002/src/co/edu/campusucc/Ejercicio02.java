package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio02 {
public static void main(String[] args) {
	
	
	System.out.println("..................................................");
	System.out.println("..................................................");
	System.out.println("..................................................");
	System.out.println("..................................................");
	System.out.println("...Franz Erick Landazuri.");
	System.out.println("....Fecha:2020/11/18.....");
	System.out.println("..Programa de numeros lea la suma de sus digitos..");
	System.out.println("..................................................");
	System.out.println("..................................................");
	System.out.println();
	
	
	
	
	Scanner lan = new Scanner(System.in);
    int n;
    int contador = 0;

    System.out.println("Digite un numero ");
    n = lan.nextInt();

    while(n > 0) {
        contador += n % 10;
        n = n / 10;

    }

    System.out.println("La suma es:" + contador);
}
}
