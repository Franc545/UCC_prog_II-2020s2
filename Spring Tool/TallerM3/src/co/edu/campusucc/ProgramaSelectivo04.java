package co.edu.campusucc;

import java.util.Scanner;

public class ProgramaSelectivo04 {
	
	public static void main(String[] args) {
		System.out.println("..............");
		System.out.println("................");
		System.out.println("..................");
		System.out.println("........................");
		System.out.println("...Franz Erick Landazuri.");
		System.out.println("....Fecha:2020/31/10.....");
		System.out.println(".........................");
		System.out.println("...Programa Selectivo04..");
		System.out.println(".....................");
		
		Scanner lan = new Scanner (System.in);
		int a=0, e=0, f=0;
		double iva=0;
		
		String nombre="";
		
		System.out.println("Digite su nombre");
		nombre= lan.nextLine();
		
		System.out.println("Ingrese el tipo de producto");
		System.out.println("[1] Producto a ");
		System.out.println("[2] Producto b ");
		System.out.println("[3] Producto c ");

		e= lan.nextInt();
		
		System.out.println("Ingrese la cantidad");
		a= lan.nextInt();
	
		
	if  (a<501)
	{
		switch (e)
		{
			case 1:
			{
				f =500*a;
				iva=f*7/100;
				System.out.println("Valor unitario: $800");
				System.out.println("Cantidad de unidades: "+ a);
				System.out.println("Iva 7%: $" + iva);
				System.out.println("El total es : "+ f+iva +" Iva incluido");
				break;
				}
			
			case 2:
			{
				f =800*a;
				iva=f*8/100;
				System.out.println("Valor unitario: $800");
				System.out.println("Cantidad de unidades: "+ a);
				System.out.println("Iva 8%: " + iva);
				System.out.println("El total es de: "+ f+iva +" Iva incluido");
				break;
			}
				
			case 3:
			{
				f =1000*a;
				iva=f*5/100;
				System.out.println("Valor unitario: $1000");
				System.out.println("Cantidad de unidades: "+ a);
				System.out.println("Iva 5%: $" + iva);
				System.out.println("El total es de: $"+ f+iva +" Iva incluido");
				break;
				}
				
		
		}
		
	}
	
	else 
	{
		switch (e)
		{
			case 1:
			{
				f =1000*a;
				iva=f*9/100;
				System.out.println("Valor unitario: $1000");
				System.out.println("Cantidad de unidades: "+ a);
				System.out.println("Iva 9%: " + iva);
				System.out.println("El total es de: $"+ f+iva +" Iva incluido");
				break;
				}
			
			case 2:
			{
				f =1400*a;
				iva=f*11/100;
				System.out.println("Valor unitario: $1400");
				System.out.println("Cantidad de unidades: "+ a);
				System.out.println("Iva 11%: $" + iva);
				System.out.println("El total es de: $"+ f+iva +" Iva incluido");
				break;
				}
				
			case 3:
			{
				f =1600*a;
				iva=f*10/100;
				System.out.println("Valor unitario: $1600");
				System.out.println("Cantidad de unidades: "+ a);
				System.out.println("Iva 10%: $" + iva);
				System.out.println("El total es de: $"+ f+iva +" Iva incluido");
				break;
			}
			
		}
	}
	}
}
	