Algoritmo NumMayor
	Escribir  "�Cu�ntos numeros desea ingresar?"
	leer serie
	i=1
	m=-99
		Mientras i<=serie Hacer
			escribir "Ingrese un n�mero"
			leer num
				si num>=-99 y num<=99 y num<>0 entonces
				si num>m Entonces
					m=num
					si num<0
						escribir "Se ingreso un n�mero negativo"
					
					FinSi
				FinSi
				i=i+i
				sino 
						Escribir "N�mero no valido, ingrese un n�mero entre -99 a 99 que no sea 0"
			FinSi
		Fin Mientras
		Escribir "El numero mayor es " m

FinAlgoritmo
