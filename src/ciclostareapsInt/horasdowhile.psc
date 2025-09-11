Algoritmo horasdowhile

	Definir  hora como entero 
	definir respuesta Como Caracter
	Repetir
	escribir "Ingrese la hora(0-23)"
	leer hora
	Segun hora hacer 
		6,7,8,9,10,11,12:
			escribir "buenos dias"
		13,14,15,16,17,18,19,20:
			escribir "buenas tardes"
		21,22,23,0,1,2,3,4,5:
			escribir "buenas noches"
		De Otro Modo:
			Escribir "entrada de hora no valida"
	FinSegun
	Escribir "Ingrese si para volver a repetir el proceso(cualquier letra para salir)"
	leer respuesta
	Hasta Que respuesta<>"si"
	
FinAlgoritmo
