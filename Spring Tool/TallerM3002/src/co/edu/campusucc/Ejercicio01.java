package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio01 {
	public static void main(String[] args) {
	
		System.out.println("...........................................");
		System.out.println("...........................................");
		System.out.println("...........................................");
		System.out.println("...........................................");
		System.out.println("...Franz Erick Landazuri.");
		System.out.println("....Fecha:2020/11/18.....");
		System.out.println("..Programa que lee la inversa de un numero.");
		System.out.println("...........................................");
		System.out.println("...........................................");
		System.out.println();
		
	     int a;
	     int e=0;
	     int d;
	     Scanner land = new Scanner (System.in);
	     System.out.println("Digite un numero");
	     a=land.nextInt();
	     
	     while (a>0) {
	    	 d=a%10;
	    	 e=e*10+d;
	    	 a/=10;
	     }
	     System.out.println("El nuemro inverso es:"+e);
	     }
		}
