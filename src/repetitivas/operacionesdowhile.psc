Algoritmo operacionesdowhile
	definir respuesta Como Caracter
	Repetir
	Escribir "Ingrese dos numeros"
	leer num1,num2
	Escribir "Ingrese el signo de operacion (+,-,*,/)"
	leer signo
	Segun signo Hacer
		"+":
			res=num1+num2
			Escribir "El resultado de la suma es " res
		"-":
			res=num1-num2
			Escribir "El resultado de la resta es " res
		"*":
			res=num1*num2
			Escribir "El resultado de la multiplicaci�n es " res
		"/":
			si num2==0 Entonces
				escribir "Error de divisi�n entre cero"
			SiNo
				res=num1/num2
				Escribir "El resultado de la divisi�n es " res
			fin si
			
		De Otro Modo:
			Escribir "Operador no valido"
	Fin Segun
	Escribir "Ingrese si para repetir el proceso(cuaquier tecla para salir)"
	leer respuesta
Hasta Que respuesta <>"si"
FinAlgoritmo