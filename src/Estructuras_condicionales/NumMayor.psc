Algoritmo NumMayor
	Escribir  "¿Cuántos numeros desea ingresar?"
	leer serie
	i=1
	m=-99
		Mientras i<=serie Hacer
			escribir "Ingrese un número"
			leer num
				si num>=-99 y num<=99 y num<>0 entonces
				si num>m Entonces
					m=num
					si num<0
						escribir "Se ingreso un número negativo"
					
					FinSi
				FinSi
				i=i+i
				sino 
						Escribir "Número no valido, ingrese un número entre -99 a 99 que no sea 0"
			FinSi
		Fin Mientras
		Escribir "El numero mayor es " m

FinAlgoritmo
