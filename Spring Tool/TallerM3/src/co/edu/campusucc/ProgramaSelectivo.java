package co.edu.campusucc;

public class ProgramaSelectivo {
	public static void main(String[] args) {

		int condicion = 0;

		// t1
		condicion = 4;

		// t2
		condicion = 89;

		// t3
		condicion = 100;

		// t4
		condicion = 22;

		// t5
		condicion = 670;

		int condicion2 = 1000;

		if (condicion == 100) {
			// Realizar trabajo t3

		} else if (condicion == 89) {
			// Realizar trabajo t2

		} else if (condicion == 4) {
			// Realizar trabajo t1

		} else if (condicion == 22) {
			// Realizar trabajo t5

		}

		switch (condicion) {
		case 4:
			// Realizar trabajo
			switch (condicion2) {
			case 100:
				// Realizar trabajo
				break;
			case 1000:
				break;
			case 89:
				// Realizar trabajo
				break;
			case 22:
				// Realizar trabajo
				break;
			case 670:
				// Realizar trabajo
				break;
			default:
				// Realizar trabajo
				break;

			}
		}
	}
}
