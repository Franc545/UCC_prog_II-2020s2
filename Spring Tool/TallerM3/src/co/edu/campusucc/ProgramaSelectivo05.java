package co.edu.campusucc;

import java.util.Scanner;

public class ProgramaSelectivo05 {
	public static void main(String[] args) {
		
		System.out.println("..............");
		System.out.println("................");
		System.out.println("..................");
		System.out.println("........................");
		System.out.println("...Franz Erick Landazuri.");
		System.out.println("....Fecha:2020/31/10.....");
		System.out.println(".........................");
		System.out.println("...Programa Selectivo05..");
		System.out.println(".....................");
		
		
		Scanner lan = new Scanner (System.in);
		int v=0, er=0, op=0, va=0, kl=0;
		
		
		
		System.out.println("seleccione el servicio");
		System.out.println("[1] Corriente");
		System.out.println("[2] Ejecutivo");

		er= lan.nextInt();
		
		System.out.println("Ingrese la ruta");
		System.out.println("[1] Ruta 1");
		System.out.println("[2] Ruta 2");
		System.out.println("[3] Ruta 3");
		System.out.println("[4] Ruta 4");
		v= lan.nextInt();
	
		
	switch (er)
	{
	case 1:
	{
		switch (er)
		{
			case 1:
			{
				op =200*30/100;
				va=200*10/100;
				kl=(200-va)-op;
				
				System.out.println("Valor del servicio : $200");
				System.out.println("Para el mantenimiento :-$" + va);
				System.out.println("Para el salario del conductor: -$" + op);
				System.out.println("Total para utilidades:$"+  kl );
				break;
				}
			
			case 2:
			{
				op =200*25/100;
				va=200*15/100;
				kl=(200-va)-op;
				
				System.out.println("Valor del servicio :$200");
				System.out.println("Para el mantenimiento :-$" + va);
				System.out.println("Para el salario del conductor: -$" + op);
				System.out.println("Total para utilidades: $"+ kl );
				break;
				}
				
			case 3:
			{
				op =200*20/100;
				va=200*20/100;
				kl=(200-va)-op;
				
				System.out.println("Valor del servicio :$200");
				System.out.println("Para el mantenimiento :-$" + va);
				System.out.println("Para el salario del conductor: -$" + op);
				System.out.println("Total para utilidades:$"+  kl );
				break;}
			
			case 4:
			{
				op =200*22/100;
				va=200*20/100;
				kl=(200-va)-op;
				
				System.out.println("Valor del servicio :$200");
				System.out.println("Para el mantenimiento :-$" + va);
				System.out.println("Para el salario del conductor: -$" + op);
				System.out.println("Total para utilidades:$"+  kl );
				break;
				}
				
		
		}
		
	}
	
	
	case 2: 
	{
		switch (er)
		{
			case 1:
			{
				op =300*30/100;
				va=300*10/100;
				kl=(300-va)-op;
				
				System.out.println("Valor del servicio : $300");
				System.out.println("Para el mantenimiento -$" + va);
				System.out.println("Para el salario del conductor: -$" + op);
				System.out.println("Total para utilidades: $"+  kl );
				break;
				}
			
			case 2:
			{
				op =300*25/100;
				va=300*15/100;
				kl=(300-va)-op;
				
				System.out.println("Valor del servicio :$300");
				System.out.println("Para el mantenimiento:-$" + va);
				System.out.println("Para el salario del conductor: -$" + op);
				System.out.println("Total para utilidades: $"+  kl );
				break;
				}
				
			case 3:
			{
				op =300*20/100;
				va=300*20/100;
				kl=(300-va)-op;
				
				System.out.println("Valor del servicio : $300");
				System.out.println("Para el mantenimiento :-$" + va);
				System.out.println("Para el salario del conductor: -$" + op);
				System.out.println("Total para utilidades:$"+  kl );
				break;
				}
				
			case 4:
			{
				op =300*22/100;
				va=300*20/100;
				kl=(300-va)-op;
				
				System.out.println("Valor del servicio :$300");
				System.out.println("Para el mantenimiento : -$" + va);
				System.out.println("Para el salario del conductor: -$" + op);
				System.out.println("Total para utilidades: $"+  kl );
				break;
			}
		}
	}
	}
	}
}

	
