package tp03_ej02;

import ArbolBinario.ArbolBinario;

public class a {
	public static void main(String[] parametro) {
		ArbolBinario<Integer> ab = new ArbolBinario<Integer>(1);

		ArbolBinario<Integer> izq = new ArbolBinario<Integer>(2);
		izq.agregarHijoIzquierdo(new ArbolBinario<Integer>(4));
		izq.agregarHijoDerecho(new ArbolBinario<Integer>(5));

		ArbolBinario<Integer> der = new ArbolBinario<Integer>(3);
		der.agregarHijoIzquierdo(new ArbolBinario<Integer>(6));

		ab.agregarHijoIzquierdo(izq);
		ab.agregarHijoDerecho(der);
		
		System.out.println(ab.contarHojas());
	}
}
