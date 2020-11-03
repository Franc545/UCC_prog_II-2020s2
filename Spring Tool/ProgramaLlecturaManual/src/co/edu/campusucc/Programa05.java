package co.edu.campusucc;

import java.util.Scanner;

public class Programa05 {

	public static void main(String[] args) {
		
		System.out.println("..............");
		System.out.println("................");
		System.out.println("..................");
		System.out.println("........................");
		System.out.println("...Franz Erick Landazuri.");
		System.out.println("....Fecha:2020/31/10.....");
		System.out.println(".........................");
		System.out.println("....................");
		System.out.println(".....................");
		
		
		Scanner lan = new Scanner(System.in);
		String nombre;
		int fr = 0;
		int ol = 0;
		int de = 0;

		System.out.println("Digite su nombre");
		nombre = lan.next();

		System.out.println("Ingrese valor del producto");
		fr = lan.nextInt();

		System.out.println("Cuanto dinero entrego el cliente");
		de = lan.nextInt();

		ol = de - fr;

		System.out.println("saldo a pagar es:" + ol);

	}
}