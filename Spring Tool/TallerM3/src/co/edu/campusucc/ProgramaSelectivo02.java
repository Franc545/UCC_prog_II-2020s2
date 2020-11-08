package co.edu.campusucc;

import java.util.Scanner;

public class ProgramaSelectivo02 {
	public static void main(String[] args) {
		System.out.println("..............");
		System.out.println("................");
		System.out.println("..................");
		System.out.println("........................");
		System.out.println("...Franz Erick Landazuri.");
		System.out.println("....Fecha:2020/31/10.....");
		System.out.println(".........................");
		System.out.println("...Programa Selectivo02..");
		System.out.println(".....................");

		Scanner lan = new Scanner(System.in);
		int a = 0, e = 0;

		String nombre = "";

		System.out.println("Digite su nombre");
		nombre = lan.nextLine();

		System.out.println("¿En qué semestre esta?");
		System.out.println("[1] Entre 1 a 3 semestres ");
		System.out.println("[2] Entre 4 a 7 semestres ");
		System.out.println("[3] Entre 8 a 10 semestres ");
		a = lan.nextInt();

		System.out.println("¿Qué carrera está cursando");
		System.out.println("[1] Economia ");
		System.out.println("[2] Administración ");
		System.out.println("[3] Ciencias ");

		e = lan.nextInt();

		switch (a) {
		case 1: {
			switch (e) {
			case 1: {
				System.out.println("Usted," + nombre);
				System.out.println("Estudiante de Economia debera pagar: $" + 1500);
				break;
			}
			case 2: {
				System.out.println("Usted," + nombre);
				System.out.println("Estudiante de Administración debera pagar: $" + 2000);
				break;
			}
			case 3: {
				System.out.println("Usted," + nombre);
				System.out.println("Estudiante de Ciencias debera pagar: $" + 1800);
				break;
			}

			}
			break;
		}

		case 2: {
			switch (e) {
			case 1: {
				System.out.println("Usted" + nombre);
				System.out.println(" Estudiante de Economia debera pagar:" + 2220);
				break;
			}
			case 2: {
				System.out.println("Usted," + nombre);
				System.out.println("Estudiante de Administración debera pagar: " + 4000);
				break;
			}
			case 3: {
				System.out.println("Usted" + nombre);
				System.out.println("Estudiante de Ciencias debera pagar: " + 5000);
				break;
			}

			}
			break;
		}

		case 3: {
			switch (e) {
			case 1: {
				System.out.println("Usted," + nombre);
				System.out.println("Estudiante de Economia debera pagar:" + 3000);
				break;
			}
			case 2: {
				System.out.println("Usted," + nombre);
				System.out.println("Estudiante de Administración debera pagar:" + 6000);
				break;
			}
			case 3: {
				System.out.println("Usted," + nombre);
				System.out.println("Estudiante de Ciencias debera pagar:" + 7000);
				break;
			}

			}
			break;
		}
		case 0:
			System.out.println("seleccion no disponible");
			break;

		}

	}
}
