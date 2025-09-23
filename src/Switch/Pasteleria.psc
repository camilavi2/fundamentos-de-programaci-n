Algoritmo Pasteleria
    definir sabor, chocolate, res, nombre, snack Como Caracter
    definir precio, total, cantidad Como Entero
    total = 0
    saborvalido = Falso
    Escribir "Ingrese el sabor del pastel:"	
    leer sabor
    Segun sabor Hacer
        "manzana":
            precio = 200
            saborvalido = Verdadero
        "fresa":
            precio = 250
            saborvalido = Verdadero
        "chocolate":
            Escribir "Desea chocolate blanco o negro:"
            leer chocolate
            Segun chocolate Hacer
                "blanco":
                    precio = 300
					saborvalido=Verdadero
                "negro":
                    precio = 280
					saborvalido=Verdadero
                De Otro Modo:
                    Escribir "Tipo de chocolate no válido"
                    saborvalido = Falso
            FinSegun
		
        De Otro Modo:
            Escribir "Sabor de pastel no válido"
            saborvalido = Falso
    FinSegun
    si saborvalido == Verdadero Entonces
        total = precio
		
        Escribir "¿Desea añadir snack? (si/no)"
        leer snack
        si snack == "si" Entonces
            Escribir "¿Cuántos snacks desea agregar?"
            leer cantidad
            total = total + (cantidad * 25)
        FinSi
        Escribir "¿Desea añadir un nombre en su pastel? (si/no)"
        leer nombre
        si nombre == "si" Entonces
            total = total + 30
        FinSi
        Escribir "El precio total del pastel es: $", total
    FinSi
	
	FinAlgoritmo