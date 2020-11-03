package co.edu.campusucc;

import java.util.Scanner;

public class Programa04 {
		
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
		
		Scanner lan = new Scanner (System.in);
		
		float a=0, e=0, f=0, z=(float) 0.3, x=(float) 0.3, y=(float) 0.4, n1=0, n2=0, n3=0,pro=0;
		  
		System.out.println("ingrese la primera nota");
		a= lan.nextInt();
		if (a>10)
			System.out.println("nota invalida");
		if (a<0)
			System.out.println("nota invalida");
		
		
		System.out.println("ingrese la nota2");
		e= lan.nextInt();
		if(e>10)
			System.out.println("invalido");
		if(e<0)
			System.out.println("invalido");
		
		
		System.out.println("ingrese la  nota3");
		f= lan.nextInt();
		
		if(f>10)
			System.out.println("invalido");
		
		if(f<0)
			System.out.println("invalido");
		
		
		n1 = a * z;
		n2 = e * x;
		n3 = f * y;
		
		pro= n1 + n2 + n3;
		
	
		
		System.out.println("El promedio es:" + pro);
	
	
}
}
