Algoritmo Fabrica
	definir clave como entero
	definir Cproduccion como real
	definir Pventa Como Real
	definir Cmobra Como Real
	definir Gfabricacion Como Real
	escribir "Ingrse el costo de la materia prima"
	leer materia
	Escribir "Ingrese la clave del producto a calcular el precio (1-6)"
	leer clave
	segun clave hacer
		3,4:
			Cmobra=materia*.75
			cDisponible=Verdadero
		1,5:
			Cmobra=materia*0.80
			cDisponible=Verdadero
		2,6:
			Cmobra=materia*.85
			cDisponible=Verdadero
		De Otro Modo:
			escribir"Clave no disponible"
			cDisponible=Falso
	FinSegun
	si clave==2 o clave ==5 entonces
		Gfabricacion=materia*0.30
	sino si clave==1 o clave==4
			Gfabricacion=materia*0.28
			Fin si 
		FinSi
		si cDisponible<>Falso entonces
		Cproduccion=materia+cmobra+Gfabricacion
		Pventa=Cproduccion+(Cproduccion*.45)
		escribir "El costo de produccion es " Cproduccion
		escribir "El precio de venta es " Pventa
		fin si 
FinAlgoritmo
