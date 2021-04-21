package tp03_ej03;

import ArbolBinario.ArbolBinario;
import Lista.ColaGenerica;

public class a {
	public static void main(String[] parametro) {
		ArbolBinario<Integer> ab = new ArbolBinario<Integer>(5);

		ArbolBinario<Integer> izq = new ArbolBinario<Integer>(3);
		izq.agregarHijoIzquierdo(new ArbolBinario<Integer>(2));
		izq.agregarHijoDerecho(new ArbolBinario<Integer>(4));

		ArbolBinario<Integer> der = new ArbolBinario<Integer>(8);
		der.agregarHijoIzquierdo(new ArbolBinario<Integer>(7));
		der.agregarHijoDerecho(new ArbolBinario<Integer>(10));

		ab.agregarHijoIzquierdo(izq);
		ab.agregarHijoDerecho(der);
		
		ContadorArbol.numerosParesInOrden(ab);
		ColaGenerica<Integer> cola = ContadorArbol.retornarPares();
		while(!cola.esVacia()) {
			System.out.println(cola.desencolar());
		}
	}
}
