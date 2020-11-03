package co.edu.campusucc;

import java.util.Scanner;

public class Programa03 {
	public static void main(String[] args) {
		System.out.println("..............");
		System.out.println("................");
		System.out.println("..................");
		System.out.println("........................");
		System.out.println("...Franz Erick Landazuri.");
		System.out.println("....Fecha:2020/17/31.....");
		System.out.println(".........................");
		System.out.println("....................");
		System.out.println(".....................");
	
		String numero ="";
		int n=0;
		try (Scanner land = new Scanner(System.in)) {
			System.out.println("Digite el numero de piezas que corta el sastre por dias");
			numero=land.next();
			n=Integer.parseInt(numero);
		n=n*n*n;
		
		System.out.println("El resultado de n es:"+n);
		
		System.out.println("¿cuantos dias tardos el sastre?" +numero);
		
		
		

		}
}
}
