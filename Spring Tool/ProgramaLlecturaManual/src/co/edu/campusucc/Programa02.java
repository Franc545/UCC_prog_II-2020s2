package co.edu.campusucc;

import java.util.Scanner;

public class Programa02 {
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
		
		long tarea;
		try (Scanner tar = new Scanner(System.in)) {
		}
		int a1=10;
		int a2=5;
		int b1=4;
		int b2=5;
		int suma;
		int resta;
		int producto;
		int sumae;
		int restae;
		int productoe;
		
		suma = a1+b1;
		System.out.println("El resultados es: "+suma);
		
		resta = a1-b1;
		System.out.println("El resultado es: "+resta);
		
		producto =a1*b1;
		System.out.println("El resultado es : "+producto);
		
		tarea=suma+resta-producto/3;
		System.out.println("El promedio es :"+tarea);
		
		sumae = a2+b2;
		System.out.println("El resultados es: "+sumae);
		
		restae = a2-b2;
		System.out.println("El resultado es: "+restae);
		
		productoe =a2*b2;
		System.out.println("El resultado es: "+productoe);
		tarea =sumae+restae-productoe/3;
		System.out.println("El promedio2 es: "+tarea);
		
		
		
	}

}
