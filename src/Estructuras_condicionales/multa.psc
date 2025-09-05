Algoritmo multa
	escribir "Ingrese la velocidad"
	leer velocidad
	escribir "¿hoy es el cumpleaños del conductor?"
	leer respuesta
	si respuesta=="no" entonces 
		si velocidad <=60 Entonces
			escribir "0=sin multa"
		SiNo
			si velocidad >=61 y velocidad <= 80 Entonces
				escribir "1=multa pequeña"
			Sino 
				escribir "2=multa grande"
			FinSi
		FinSi
		sino 	escribir "No hay multa"
	FinSi
FinAlgoritmo
