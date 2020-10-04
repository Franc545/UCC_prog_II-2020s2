Proceso entrenamiento_05
	Definir x Como Entero;
	Definir yy Como Logico;
	Definir c Como Caracter;
	
	x <- 10;  yy <- Falso;  c <- 'a';
	si x > 0 entonces 
	yy <- Verdadero;
	SiNo
		yy <- Falso;
	FinSi
	yy <- Verdadero;
	c <- 'b'; 
	yy <- Verdadero;
	
	Escribir "El valor final de x es:",x;
	Escribir "El valor final de yy es:",yy;
	Escribir "El valor final de c es:",c;
	
	
FinProceso
