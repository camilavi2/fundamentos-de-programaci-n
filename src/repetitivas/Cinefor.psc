Algoritmo Cinefor
	definir dia Como Caracter
	definir personas Como Entero
	definir rep Como Entero
	precio=50
	Escribir "Ingrese el numero de veces que desea realizar el proceso"
	leer rep
	Para i=1 Hasta rep Con Paso 1 Hacer
	Escribir "Ingrese el número de personas"
	leer personas
	Escribir "Ingrese el día de la semana ej: lunes"
	leer dia
	segun dia Hacer
		"lunes", "martes", "viernes", "sabado", "domingo":
			diaValido=Verdadero
			total =personas*precio
		"miercoles":
			diaValido=Verdadero
			precio=30
			total =personas*precio
		"jueves":
			diaValido=Verdadero
			parejas=0
			si personas mod 2=0 Entonces
				parejas=personas/2
				precio=75
				total=parejas*precio
			sino si personas>1 y personas mod 2<>0 entonces
					parejas =(personas-1)/2
					
					total=parejas*75+50
					Escribir "Queda 1 persona pagando precio individual de $50"
				sino
					si personas==1 entonces
						total=50
						Escribir "El precio individual es de 50"
					Finsi
				FinSi
			FinSi
			
			escribir "El precio de boleto por pareja es de $75"
			Escribir "Se formaron " parejas " parejas"
			
		De Otro Modo:
			escribir "Entrada de día no valida"
			diaValido <- Falso 	
	FinSegun
	
	
	Si diaValido Entonces
		escribir "¿cuentas con membresia?"
		leer res
        Si res="no" Entonces
            Escribir "El total a pagar por " personas " personas es ", total
        Sino
            Si res="si" Entonces
                total = total * 0.90
                Escribir "El total a pagar por ", personas, " personas con un descuento del 10% es ", total
            Sino
                Escribir "Respuesta no válida, escriba si o no"
            FinSi
        FinSi
    FinSi
Fin Para
FinAlgoritmo
