package co.edu.campusucc;

import java.util.Scanner;

public class ProgramaSelectivo06 {
	public static void main(String[] args) {

		System.out.println("..............");
		System.out.println("................");
		System.out.println("..................");
		System.out.println("........................");
		System.out.println("...Franz Erick Landazuri.");
		System.out.println("....Fecha:2020/31/10.....");
		System.out.println(".........................");
		System.out.println("...Programa Selectivo06..");
		System.out.println(".....................");
		
		Scanner lan =new Scanner(System.in);
		int r=0, c=0, mn=0;
		double v=0, va=0;
		
		System.out.println("Seleccione el tipo de carro");
		System.out.println("[1] Mazdas");
		System.out.println("[2] Renault");
		System.out.println("[3] Chevrolet");
		System.out.println("[4] Fiat");
		System.out.println("[5] Dodge");
		System.out.println("[6] Otros");
		
		r=lan.nextInt();
		
		System.out.println("[1] Cambio de aceite");
		System.out.println("[2] Alineacion y balanceo");
		System.out.println("[3] Engrase");
		System.out.println("[4] Cambio");
		System.out.println("[5] Lavado");
		System.out.println("[6] Otros");
		
		c=lan.nextInt();
		
		
		
		switch(r)
		{
		case 1:
		{
		switch (r)
		{
		case 1:
		{
			mn= 5000;
			v=3500;
			va=mn+v;
			System.out.println("El cargo es:"+mn);
			System.out.println("El valor es:"+v);
			System.out.println("El valor a pagar es:"+va);
			break;
		}
		case 2:
		{
			mn= 3000;
			v=2800;
			va=mn+v;
			System.out.println("El cargo es:"+mn);
			System.out.println("El valor es:"+v);
			System.out.println("El valor a pagar es:"+va);
			break;
		}
		
		case 3:
		{
			mn= 2500;
			v=1950;
			va=mn+v;
			System.out.println("El cargo es:"+mn);
			System.out.println("El valor es:"+v);
			System.out.println("El valor a pagar es:"+va);
			break;
			
		}
		
		case 4:
		{
			mn= 2000;
			v=2750;
			va=mn+v;
			System.out.println("El cargo es:"+mn);
			System.out.println("El valor es:"+v);
			System.out.println("El valor a pagar es:"+va);
			break;
			
		}
		
		case 5:
		{
			mn= 2200;
			v=3000;
			va=mn+v;
			System.out.println("El cargo es:"+mn);
			System.out.println("El valor es:"+v);
			System.out.println("El valor a pagar es:"+va);
			break;
		}
		
		case 6:
		{
			mn= 1700;
			v=1600;
			va=mn+v;
			System.out.println("El cargo es:"+mn);
			System.out.println("El valor es:"+v);
			System.out.println("El valor a pagar es:"+va);
			break;
		}
			
			default:
			va=0;
			System.out.println("incorrecto");
					
			
		}
			
			
		}
		}
	}

}
