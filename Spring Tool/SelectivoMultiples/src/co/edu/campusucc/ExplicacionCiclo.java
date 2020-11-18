package co.edu.campusucc;

import java.util.Random;

public class ExplicacionCiclo {
	public static void main(String[] args) {

		boolean condicion = false;

		do {
			Random randon = new Random();
			int intRandom = randon.nextInt(10);

			condicion = true;
			if (intRandom < 5)
				condicion = false;

			System.out.println("Estoy dentro del HAGA MIENTRAS: randon" + intRandom + "condicion de Salida del Ciclo>>>"
					+ condicion);
		} while (condicion);
	}
}
