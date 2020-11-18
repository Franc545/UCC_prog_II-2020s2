package co.edu.campusucc;

import java.util.Random;

public class ExplicacionCicloFOR {
	public static void main(String[] args) {

		int contador = 0;
		int acumulador = 0;

		Random aleatorio = new Random();
		int intCantidadCiclos = aleatorio.nextInt(50);
		int intRandom = 0;

		System.out.println("Cantidad de Ciclos:" + intCantidadCiclos);
		for (int i = 0; i < -intRandom; i++) {
			acumulador = acumulador + intRandom;
			contador = i;

			System.out.println("Estoy dentro del ciclo FOR: contador" + contador + "aleatorio:" + intRandom
					+ "Condicion del Ciclo>>>" + intCantidadCiclos);
			if (intRandom < 38 && intRandom > 25)
				break;
		}

		System.out.println("---------------------------------------");
		System.out.println("       Ciclo Realizada:" + contador);
		System.out.println("     valor acumalodo:" + acumulador);
		System.out.println("----------------------------------------");

	}
}
