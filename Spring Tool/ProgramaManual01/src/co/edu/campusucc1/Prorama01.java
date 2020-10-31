package co.edu.campusucc1;

import java.util.Scanner;

public class Prorama01 {
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
		
		
		Scanner in = new Scanner (System.in);
		int tierra=0, simon=1, k=0;
		
		System.out.println("¿La tierra es redonda? [0]Para no, [1]Para si");
		tierra= in.nextInt();
		
		System.out.println("¿Simón Bolivar liberto Panama? [0]Para no, [1]Para si");
		simon= in.nextInt();
		
		k = tierra + simon;
		System.out.println("el resultado de k es :" + k);
	}
}



