package co.edu.campusucc;

import java.util.Scanner;

public class ProgramaSelectivo01 {
	public static void main(String[] args) {

		System.out.println("..............");
		System.out.println("................");
		System.out.println("..................");
		System.out.println("........................");
		System.out.println("...Franz Erick Landazuri.");
		System.out.println("....Fecha:2020/07/11.....");
		System.out.println(".........................");
		System.out.println("..Programas selectivos..");
		System.out.println(".....................");

		Scanner lan = new Scanner(System.in);
		String nombre = "";
		double sueldo = 0;
		int cate;

		System.out.println("Digite su nombre");
		nombre = lan.next();

		System.out.println("Digite la categoria");
		cate = lan.nextInt();

		System.out.println("Digite sueldo");
		sueldo = lan.nextDouble();
		switch (cate) {

		case 1:
			sueldo = (int) (sueldo * 1.15);
			break;
		case 2:
			sueldo = (int) (sueldo * 1.10);
			break;
		case 3:
			sueldo = (int) (sueldo * 1.08);
			break;
		case 4:
			sueldo = (int) (sueldo * 1.07);

		default:
			sueldo = 0;
			System.out.println("La categoria no existe");

		}

		System.out.println("El empleado es:" + nombre);
		System.out.println("El sueldo a pagar es:" + sueldo);
	}
}
