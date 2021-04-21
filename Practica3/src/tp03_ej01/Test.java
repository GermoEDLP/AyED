package tp03_ej01;

import ArbolBinario.ArbolBinario;

public class Test {

	public static void main(String[] parametro) {
		ArbolBinario<Integer> ab = new ArbolBinario<Integer>(40);
		
		
		ArbolBinario<Integer> izq = new ArbolBinario<Integer>(25);
		izq.agregarHijoIzquierdo(new ArbolBinario<Integer>(10));
		izq.agregarHijoDerecho(new ArbolBinario<Integer>(32));
		
		ArbolBinario<Integer> der = new ArbolBinario<Integer>(78);
		der.agregarHijoIzquierdo(new ArbolBinario<Integer>(62));
		der.agregarHijoDerecho(new ArbolBinario<Integer>(90));
		
		ab.agregarHijoIzquierdo(izq);
		ab.agregarHijoDerecho(der);
		
		 ab.printPreorden();
		 System.out.println();
		 ab.printPostorden();
		 System.out.println();
		 ab.printInorden();
		 System.out.println();
		 ab.recorridoPorNiveles();
		 System.out.println();
		 System.out.println();
		 System.out.println("Es lleno: "+(ab.esLleno()?"Si":"No"));
		 System.out.print("Nodos: ");
		 System.out.println(ab.contarNodos());

	}

}
