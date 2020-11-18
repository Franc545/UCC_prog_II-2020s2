package co.edu.campusucc;

import java.util.Random;

public class ExplicacionCciclosWHILE {
	public static void main(String[] args) {

		boolean condicion = true;
		int contador = 0;
		int acumulador = 0;

		while (condicion) {
			contador = contador + 1;
			Random aleatorio = new Random();
			int intRandom = aleatorio.nextInt(50);

			acumulador = acumulador + intRandom;

			condicion = true;

			if (intRandom < 30 && intRandom > 25)
				condicion = false;

			System.out.println("Estoy dentro del HAGA MIENTRAS: randon" + intRandom + "condicion de Salida del Ciclo>>>"
					+ condicion);
		}

		System.out.println("+-------------------------------------------------------------");
		System.out.println("     Ciclo realizados:" + contador);
		System.out.println("     Valor acumulado:" + acumulador);
		System.out.println("+--------------------------------------------------------------");
	}
}
