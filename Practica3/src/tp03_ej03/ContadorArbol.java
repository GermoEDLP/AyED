package tp03_ej03;

import ArbolBinario.ArbolBinario;
import Lista.ColaGenerica;

public class ContadorArbol {
	public static ColaGenerica<Integer> cola = new ColaGenerica<Integer>();

	public static void numerosParesInOrden(ArbolBinario<Integer> ab) {

		if (ab.tieneHijoIzquierdo())
			ContadorArbol.numerosParesInOrden(ab.getHijoIzquierdo());
		if (ab.getDato() % 2 == 0)
			cola.encolar(ab.getDato());
		if (ab.tieneHijoDerecho())
			ContadorArbol.numerosParesInOrden(ab.getHijoDerecho());
	}

	public static void numerosParesPostOrden(ArbolBinario<Integer> ab) {

		if (ab.tieneHijoIzquierdo())
			ContadorArbol.numerosParesInOrden(ab.getHijoIzquierdo());
		if (ab.tieneHijoDerecho())
			ContadorArbol.numerosParesInOrden(ab.getHijoDerecho());
		if (ab.getDato() % 2 == 0)
			cola.encolar(ab.getDato());
	}

	public static ColaGenerica<Integer> retornarPares() {
		return ContadorArbol.cola;
	}

}
