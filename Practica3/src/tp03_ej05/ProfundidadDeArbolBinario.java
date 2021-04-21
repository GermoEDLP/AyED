package tp03_ej05;

import ArbolBinario.ArbolBinario;
import Lista.ColaGenerica;

public class ProfundidadDeArbolBinario {
	
	ArbolBinario<Integer> ab;
	
	public ProfundidadDeArbolBinario(ArbolBinario<Integer> ab) {
		this.ab = ab;
	}

	public int sumaElementosProfundidad(int p) {
		ArbolBinario<Integer> arbol = null;
		ColaGenerica<ArbolBinario<Integer>> cola = new ColaGenerica<ArbolBinario<Integer>>();
		int suma = 0;
		int nivel = 0;
		cola.encolar(this.ab);
		cola.encolar(null);
		System.out.println("Nivel "+Integer.toString(p)+": ");
		while (!cola.esVacia()) {
			arbol = cola.desencolar();
			if (arbol != null) {
				if (nivel==p) {
					suma += arbol.getDato();
					System.out.print(arbol.getDato() + " ");
				}
				if (arbol.tieneHijoIzquierdo())
					cola.encolar(arbol.getHijoIzquierdo());
				if (arbol.tieneHijoDerecho())
					cola.encolar(arbol.getHijoDerecho());
			} else if (!cola.esVacia()) {
				nivel++;
				cola.encolar(null);
			}
		}
		return suma;
	}
	
}
