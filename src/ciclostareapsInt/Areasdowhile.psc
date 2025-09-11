Algoritmo Areasdowhile
	definir respuesta Como Caracter
	repetir
	Escribir "Ingrese el nombre de la figura de la cual se calculara el area (cuadrado, rectangulo, triangulo, circulo)"
	leer figura
	segun figura hacer
		"cuadrado":
			escribir "Ingresar la medida del lado"
			leer lado
			area=lado*lado
			escribir "El area del cuadrado es " area
		"rectangulo":
			Escribir "Ingrese la medida de la base y de la altura"
			leer base, altura
			area=base*altura
			escribir "El area del rectangulo es " area
		"triangulo":
			Escribir "Ingrese la medida de la base y de la altura"
			leer base, altura
			area=(base*altura)/2
			escribir "El area del triangulo es " area
		"circulo":
			Escribir "Ingrese la medida del radio"
			leer radio
			area=pi*(radio^2)
			escribir "El area del circulo es " area
		De Otro Modo:
			escribir "Entrada no valida"
	FinSegun
	Escribir "Ingrese si para repetir el proceso(cualquier letra para salir)"
	leer respuesta
Hasta Que  respuesta <>"si"
	
FinAlgoritmo
