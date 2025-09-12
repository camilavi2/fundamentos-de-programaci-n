Algoritmo figura
    Definir n, i, j, k Como Entero
    Escribir "Ingrese el número de líneas que tendrá la figura: "
    Leer n
    i = n
    Mientras i >= 1 Hacer
		// Imprimir espacios para centrar
        Para j = 1 Hasta (n - i) Con Paso 1 Hacer
            Escribir Sin Saltar " "
        FinPara
        // Imprimir asteriscos
        Para k = 1 Hasta (2 * i - 1) Con Paso 1 Hacer
            Escribir Sin Saltar "*"
        FinPara
        Escribir "" // salto de línea
        i = i - 1
    FinMientras
    Escribir " "
	i=1
	Mientras i <= n Hacer
		// Imprimir espacios para centrar
        Para j = 1 Hasta (n - i) Con Paso 1 Hacer
            Escribir Sin Saltar " "
        FinPara
        // Imprimir asteriscos
        Para k = 1 Hasta (2 * i - 1) Con Paso 1 Hacer
            Escribir Sin Saltar "*"
        FinPara
        Escribir "" // salto de línea
        i = i + 1
    FinMientras
    Escribir " "
	i=1
	repetir 
		Para  r=1 hasta n con paso 1 Hacer
			escribir Sin Saltar "* "
			
		FinPara
		Escribir " " 
		i=i+1
	Hasta Que i==n
FinAlgoritmo
