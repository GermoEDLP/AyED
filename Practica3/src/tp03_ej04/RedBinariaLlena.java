package tp03_ej04;

import ArbolBinario.ArbolBinario;

public class RedBinariaLlena {
	
	public static int retardoReenvio(ArbolBinario<Integer> ab) {
		int cont = 0, izq = 0, der = 0;
		if(ab.tieneHijoIzquierdo()) {
		     izq = retardoReenvio(ab.getHijoIzquierdo());
		}
		if(ab.tieneHijoDerecho()) {
		     der = retardoReenvio(ab.getHijoDerecho());
		}
		cont = ab.getDato();
		if(izq!=0 || der!=0) {
			System.out.println("Del nodo con "+Integer.toString(cont)+ "ms el hijo mas lento ->  "+ Integer.toString((izq>der)?izq:der)+"ms");			
		}
		return cont = (izq>der)?cont+izq:cont+der;
	}

}
