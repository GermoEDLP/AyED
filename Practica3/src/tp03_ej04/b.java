package tp03_ej04;

import ArbolBinario.ArbolBinario;

public class b {
	public static void main(String[] parametro) {
		ArbolBinario<Integer> ab = new ArbolBinario<Integer>(30);

		ArbolBinario<Integer> izq = new ArbolBinario<Integer>(25);
		izq.agregarHijoIzquierdo(new ArbolBinario<Integer>(110));
		izq.agregarHijoDerecho(new ArbolBinario<Integer>(90));

		ArbolBinario<Integer> der = new ArbolBinario<Integer>(70);
		der.agregarHijoIzquierdo(new ArbolBinario<Integer>(45));
		der.agregarHijoDerecho(new ArbolBinario<Integer>(65));

		ab.agregarHijoIzquierdo(izq);
		ab.agregarHijoDerecho(der);
		
		int retraso = RedBinariaLlena.retardoReenvio(ab);
		System.out.println();
		System.out.println("Retraso máximo: "+Integer.toString(retraso)+"ms");
	}
}
