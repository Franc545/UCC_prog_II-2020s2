package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio05 {
	public static void main(String[] args) {
		
		
		System.out.println("..............");
		System.out.println("................");
		System.out.println("..................");
		System.out.println("........................");
		System.out.println("...Franz Erick Landazuri.");
		System.out.println("....Fecha:2020/11/16.....");
		System.out.println("..Programa de nuemros primos..");
		System.out.println("..................................");
		System.out.println(".....................");
		System.out.println();
		
		Scanner land =new Scanner(System.in);
		int contador=0;
		int a;
		int n;
		
		System.out.println("Digite un numero");
		n=land.nextInt();
		
		for(a=1; a<=n; a++) {
			if((n%a) ==0){
				contador++;
			}
		}
		if (contador<=2) {
			System.out.println("El numero digitado es primo");
		} else {
			System.out.println("El numero digitado no es primo");
		}
	}
}
