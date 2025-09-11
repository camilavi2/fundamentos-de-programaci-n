Algoritmo Horoscopowhile
	definir respuesta Como Caracter
	respuesta="si"
	mientras respuesta="si" hacer
	Escribir "Ingrsese su mes de nacimiento"
	leer mes
	Escribir "Ingrese día de nacimiento"
	leer dia
	Segun mes Hacer
		"enero":
			si dia >=1 y dia <=19 entonces 
				escribir "Su signo es capricornio"
			sino si dia>=20 y dia<=31
					escribir "Su signo es Acuario"
				sino escribir "día no valido"
				FinSi
			FinSi
		"febrero":
			si dia >=1 y dia <=18 entonces 
				escribir "Su signo es Acuario"
			sino si dia>=19 y dia<=29
					escribir "Su signo es Piscis"
				sino escribir "día no valido"
				FinSi
			FinSi
			
		"marzo":
			si dia >=1 y dia <=20 entonces 
				escribir "Su signo es Piscis"
			sino si dia>=21 y dia<=31
					escribir "Su signo es Aries"
				sino escribir "día no valido"
				FinSi
			FinSi
			
		"abril":
			si dia >=1 y dia <=19 entonces 
				escribir "Su signo es Aries"
			sino si dia>=20 y dia<=30
					escribir "Su signo es Tauro"
				sino escribir "día no valido"
				FinSi
			FinSi
		"mayo":
			si dia >=1 y dia <=20 entonces 
				escribir "Su signo es Tauro"
			sino si dia>=21 y dia<=31
					escribir "Su signo es Geminis"
				sino escribir "día no valido"
				FinSi
			FinSi
		"junio":
			si dia >=1 y dia <=20 entonces 
				escribir "Su signo es Geminis"
			sino si dia>=21 y dia<=31
					escribir "Su signo es Cancer"
				sino escribir "día no valido"
				FinSi
			FinSi
		"julio": 
			si dia >=1 y dia <=22 entonces 
				escribir "Su signo es Cancer"
			sino si dia>=23 y dia<=31
					escribir "Su signo es Leo"
				sino escribir "día no valido"
				FinSi
			FinSi
		"agosto":
			si dia >=1 y dia <=22 entonces 
				escribir "Su signo es Leo"
			sino si dia>=23 y dia<=31
					escribir "Su signo es Virgo"
				sino escribir "día no valido"
				FinSi
			FinSi
		"septiembre":
			si dia >=1 y dia <=22 entonces 
				escribir "Su signo es Virgo"
			sino si dia>=23 y dia<=30
					escribir "Su signo es Libra"
				sino escribir "día no valido"
				FinSi
			FinSi
		"octubre":
			si dia >=1 y dia <=22 entonces 
				escribir "Su signo es Libra"
			sino si dia>=23 y dia<=31
					escribir "Su signo es Escorpio"
				sino escribir "día no valido"
				FinSi
			FinSi
		"noviembre":
			si dia >=1 y dia <=21 entonces 
				escribir "Su signo es Escorpio"
			sino si dia>=22 y dia<=30
					escribir "Su signo es Sagitario"
				sino escribir "día no valido"
				FinSi
			FinSi
		"didiembre":
			si dia >=1 y dia <=21 entonces 
				escribir "Su signo es Sagitario"
			sino si dia>=22 y dia<=31
					escribir "Su signo es Capricornio"
				sino escribir "día no valido"
				FinSi
			FinSi
			
		De Otro Modo:
			escribir "mes y (o) día no valido"
	Fin Segun
	Escribir "Ingresa si deseas repetir el proceso (si/no)"
	leer respuesta
fin mientras

FinAlgoritmo

