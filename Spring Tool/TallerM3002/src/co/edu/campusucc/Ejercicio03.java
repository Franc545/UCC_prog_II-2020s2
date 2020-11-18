package co.edu.campusucc;

import java.util.Scanner;

public class Ejercicio03 {
	public static void main(String[] args) {
		
		
		System.out.println("......................................");
		System.out.println("......................................");
		System.out.println("...Franz Erick Landazuri.");
		System.out.println("....Fecha:2020/11/16.....");
		System.out.println("..Programa que lee si un numero es:  ..");
		System.out.println(".............capicua o no..............");
		System.out.println("........................................");
		System.out.println();
		
		
		int M;
		int a;
		int contador = 0;
		int e;
        Scanner lan = new Scanner(System.in);
        do {
            System.out.println("Digite un número  ");                                                 
            M = lan.nextInt();
        } while (M < 10);
       

        a = M;
        while (a!=0){
            e = a % 10;
           contador = contador * 10 + e;
            a = a / 10;
        }
    
        if(M == contador){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
	}

}
