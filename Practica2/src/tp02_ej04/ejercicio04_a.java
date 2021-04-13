package tp02_ej04;

public class ejercicio04_a {
	/**
	 * Para resolver este problema utilizaría una Pila ya que me permite guardar elementos a comparar
	 * y poder acceder facilmente a ellos utilizando un sistema LIFO (Last In First Out).
	 * 
	 * La logica de resolución seŕa la siguiente:
	 * 	- Tomar la cadena de texto ingresada por el usuario para procesarla
	 * 	- Crear una nueva Pila (en este caso de caracteres) y recorrer el string como si fuera un array
	 * 		de caracteres.
	 * 	- Si el caracter leído es un caracter de apertura <{[(>, entonces se apila.
	 *  - Si el caracter es de cierre <}])>, primero se evalua si la pila esta vacia (si lo estuviera
	 *  	se entiende la cadena como desbalanceada por tener un caracter de cierre sin uno de apertura).
	 *  	Y en el caso de que el de cierre no sea igual al de apertura en el tope de la pila, se
	 *  	entiende como desbalanceada por no cerrar en orden los simbolos.
	 *  - La ultima evaluación se realiza al retornar "si la pila esta vacía". Si no lo esta, retornará falso,
	 *  	al quedar simbolos abiertos sin cerrar, por lo que estaría desbalanceada.
	 *  - Entonces, una vez pasadas estas validaciones, y retornando la pila vacia, se puede asegurar que
	 *  	la cadena esta balanaceada.
	 */
}
