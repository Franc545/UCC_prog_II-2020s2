Proceso sin_titulo
	Definir resp1, resp2, resp3, resp4, k Como Entero
	
	Escribir "¿Benjamin Franklin invento el pararrayos? [0] Falso [1] Verdadero"
	
	Escribir "¿Samuel Morse invento el telegrafo? [0] Falso [1] Verdadero"
	
	Escribir "¿Perú es un pais suramericano? [0] Falso [1] Verdadero"
	
	Escribir "¿5 es un numero primo? [0] Falso [1] Verdadero"
	leer resp4;
	
	Si (resp1>=resp2) y (resp3==resp4) Entonces
		k <- 1;
	SiNo
		k <- 0;
	FinSi
	
	Escribir "El valor final vale:",k;
FinProceso
