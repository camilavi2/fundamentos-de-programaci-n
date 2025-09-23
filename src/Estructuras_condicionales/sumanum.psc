Algoritmo siete
	Escribir "Ingrse 3 números enteros"
	definir a, b, c Como Entero
	leer a, b, c
	
	si a+b=10 o b+c=10 o a+c=10 Entonces
		res=10
		Escribir "El resultado es " res
	sino 
		si a+b==(b+c+10) o a+b==(a+c+10)
			entonces res=5
			Escribir "El resultado es " res
		SiNo
			res=0
			escribir "El resultado es " res
FinSi
	FinSi
FinAlgoritmo
