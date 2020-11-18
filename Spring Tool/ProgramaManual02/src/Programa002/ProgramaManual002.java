package Programa002;

import java.util.Scanner;

public class ProgramaManual002 {
	public static void main(String[] args) {
		
		
		System.out.println("..............");
		System.out.println("................");
		System.out.println("..................");
		System.out.println("........................");
		System.out.println("...Franz Erick Landazuri.");
		System.out.println("....Fecha:2020/17/10.....");
		System.out.println(".........................");
		System.out.println("....................");
		System.out.println(".....................");
		
		
		Scanner scan = new Scanner (System.in);
		int tierra=0, cuadrado=0, resultadot=0;
		
		System.out.println("¿La tierra es redonda? [0]Para no, [1]Para si");
		tierra= scan.nextInt();
		
		System.out.println("¿25 es un mumero cuadrado? [0]Para no, [1]Para si");
		cuadrado= scan.nextInt();
		
		resultadot = tierra + cuadrado;
		System.out.println("el resultado es :" + resultadot);

	}

}
