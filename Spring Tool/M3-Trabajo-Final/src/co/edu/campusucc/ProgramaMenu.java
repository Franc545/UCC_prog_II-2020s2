//Con problemas a la hora de mostra los programas que estan en el menú
package co.edu.campusucc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ProgramaMenu {
	public static void main(String[] args) {

		System.out.println("...........................................");
		System.out.println("...........................................");
		System.out.println("...........................................");
		System.out.println("...........................................");
		System.out.println("...Franz Erick Landazuri.");
		System.out.println("....Fecha:2020/11/25.....");
		System.out.println("......Programa Menu.....");
		System.out.println("...........................................");
		System.out.println("...........................................");
		System.out.println();

		System.out.println(" Digite 1 para el para el Programa Ejercicio01 ");
		System.out.println(" Digite 2 para el para el Programa Ejercicio02 ");
		System.out.println(" Digite 3 para el para el Programa Ejercicio03 ");
		System.out.println(" Digite 4 para el para el Programa Ejercicio05 ");
		System.out.println(" Digite 5 para el para el Programa Ejercicio06");
		System.out.println(" Digite 6 para el para el Programa Numeros Primos");
		System.out.println(" Digite 7 para el para el Programa Explicacion Ciclo WHILE ");
		System.out.println(" Digite 8 para el para el Programa Explicacion Ciclo ");
		System.out.println(" Digite 9 para el para el Programa Explicacion Ciclo FOR");

		try (Scanner lan = new Scanner(System.in)) {

			int opciones;
			@SuppressWarnings("unused")
			String consola = "";
			System.out.println("Digite un nuemero para el Programa");
			opciones = lan.nextInt();

			switch (opciones) {
			case 1:
				consola = "java co.edu.campuscc Programa Ejercico01";
				break;
				
			case 2:
				consola = "java co.edu.campusucc Programa Ejercico02";
				break;
				
			case 3:
				consola = "java co.edu.campusucc Programa Ejercico03";
				break;
				
			case 4:
				consola = "java co.edu.campusucc Programa Ejercico05";
				break;
				
			case 5:
				consola = "java co.edu.campusucc Programa Ejercico06";
				break;
				
			case 6:
				consola = "java co.edu.campusucc ProgramaNumerosPrimos";
				break;
				
			case 7:
				consola = "java co.edu.campusucc ExplicacionCicloWHILE";
				break;
				
			case 8:
				consola = "java co.edu.campusucc ExplicacionCiclo";
				break;
				
			case 9:
				consola = "java co.edu.campusucc ExplicacionCicloFOR";
				break;

			default:
				break;
			}

			try 
			   {
				Process theProcess = null;
				BufferedReader instream = null;

				theProcess = Runtime.getRuntime().exec("java co.edu.campusucc Programa Ejercicio01");
				theProcess = Runtime.getRuntime().exec("java co.edu.campusucc Programa Ejercicio02");
				theProcess = Runtime.getRuntime().exec("java co.edu.campusucc Programa Ejercicio03");
				theProcess = Runtime.getRuntime().exec("java co.edu.campusucc Programa Ejercicio05");
				theProcess = Runtime.getRuntime().exec("java co.edu.campusucc Programa Ejercicio06");
				theProcess = Runtime.getRuntime().exec("java co.edu.campusucc ProgramaNumerosPrimos");
				theProcess = Runtime.getRuntime().exec("java co.edu.campusucc ExplicacionCicloWHILE");
				theProcess = Runtime.getRuntime().exec("java co.edu.campusucc ExplicacionCiclo");
				theProcess = Runtime.getRuntime().exec("java co.edu.campusucc ExplicacionCicloFOR");
				instream = new BufferedReader(new InputStreamReader(theProcess.getInputStream()));
				System.out.println(instream.readLine());

			}

			catch (Exception e) 
			{
				System.out.println("Error");
				e.printStackTrace();
			}

		}
	}
}
