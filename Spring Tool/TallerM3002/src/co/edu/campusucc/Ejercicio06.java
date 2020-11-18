package co.edu.campusucc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio06 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		System.out.println("......................................");
		System.out.println("......................................");
		System.out.println("...Franz Erick Landazuri.");
		System.out.println("....Fecha:2020/11/16.....");
		System.out.println("..Programa que lee el digito mayor:  ..");
		System.out.println(".............De un numero ..............");
		System.out.println("........................................");
		System.out.println();
		
		
		int a;
		int e1;
		int f;

		BufferedReader in=new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Digite un numero");
		a=Integer.parseInt(in.readLine());

		e1=a;
		f=0;

		while(a>0){
		if((a%10)>f){f=a%10;}
		a=a/10;}

		System.out.println("El digito mayor es :"+f);
	}
}

