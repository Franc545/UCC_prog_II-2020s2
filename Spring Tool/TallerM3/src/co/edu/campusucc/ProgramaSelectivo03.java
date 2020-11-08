package co.edu.campusucc;

import java.util.Scanner;

public class ProgramaSelectivo03 {
	public static void main(String[] args) {

		System.out.println("..............");
		System.out.println("................");
		System.out.println("..................");
		System.out.println("........................");
		System.out.println("...Franz Erick Landazuri.");
		System.out.println("....Fecha:2020/31/10.....");
		System.out.println(".........................");
		System.out.println("...Programa Selectivo03..");
		System.out.println(".....................");

		Scanner lan = new Scanner(System.in);
		int r = 0, v = 0;

		String nombre = "";

		System.out.println("Digite su nombre");
		nombre = lan.nextLine();

		System.out.println("¿Dondé esta ubicado?");
		System.out.println("[1] Norte ");
		System.out.println("[2] Sur ");
		System.out.println("[3] Oriente ");
		System.out.println("[4] Occidente ");

		r = lan.nextInt();

		switch (r) {
		case 1: {
			System.out.println("Marque deacuerdo al tamaño de su telefono");
			System.out.println("[1] Pequeño ");
			System.out.println("[2] Mediano ");
			System.out.println("[3] Grande ");
			v = lan.nextInt();

			switch (v) {
			case 1: {
				System.out.println("Señor o señora " + nombre);
				System.out.println("El costo por minuto es de: $" + 500);

				v = lan.nextInt();
				break;
			}

			case 2: {
				System.out.println("Señor o señora " + nombre);
				System.out.println("El costo por minuto es de:" + 250);
				break;
			}
			case 3: {
				System.out.println("Señor o señora " + nombre);
				System.out.println("El costo por minuto es de:" + 100);
				break;
			}

			}
			break;
		}

		case 2: {
			System.out.println("Marque deacuerdo al tamaño de su telefono");
			System.out.println("[1] Pequeño ");
			System.out.println("[2] Mediano ");

			v = lan.nextInt();
			switch (v) {
			case 1: {
				System.out.println("Señor o señora " + nombre);
				System.out.println("El costo por minuto es de: $" + 400);
				break;
			}
			case 2: {
				System.out.println("Señor o señora " + nombre);
				System.out.println("El costo por minuto es de: $" + 200);
				break;
			}

			}
			break;
		}

		case 3:

		{
			System.out.println("Marque deacuerdo al tamaño de su telefono");
			System.out.println("[1] Grande ");

			v = lan.nextInt();

			switch (v) {
			case 1: {
				if (v != 1)
					System.out.println("Seleccion incorrecta");
				else
					System.out.println("Señor o señora " + nombre);
				System.out.println("El costo por minuto es de:" + 100);

				break;
			}

			}
			break;

		}

		case 4: {
			System.out.println("Marque deacuerdo al tamaño de su telefono");
			System.out.println("[1] Pequeño ");
			System.out.println("[2] Grande ");

			v = lan.nextInt();

			switch (v) {
			case 1: {
				System.out.println("Señor (a) " + nombre);
				System.out.println("El costo por minuto es de:" + 300);
				break;
			}
			case 2: {
				System.out.println("Señor (a) " + nombre);
				System.out.println("El costo por minuto es de:" + 200);
				break;
			}

			}

			break;
		}

		}

	}
}
