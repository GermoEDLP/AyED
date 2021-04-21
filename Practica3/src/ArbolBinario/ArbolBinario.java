package ArbolBinario;

import Lista.ColaGenerica;
import Lista.ListaEnlazadaGenerica;
import Lista.ListaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;
	private ArbolBinario<T> hijoDerecho;

	public ArbolBinario() {
		super();
	}

	public ArbolBinario(T dato) {
		this.dato = dato;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * 
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo != null;
	}

	public boolean tieneHijoDerecho() {
		return this.hijoDerecho != null;
	}

	public void entreNiveles(int n, int m) {
		ArbolBinario<T> arbol = null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		int nivel = 0;
		cola.encolar(this);
		cola.encolar(null);
		while (!cola.esVacia() && nivel <= m) {
			arbol = cola.desencolar();
			if (arbol != null) {
				if (nivel >= n)
					System.out.print(arbol.getDato() + " ");
				if (arbol.tieneHijoIzquierdo())
					cola.encolar(arbol.getHijoIzquierdo());
				if (arbol.tieneHijoDerecho())
					cola.encolar(arbol.getHijoDerecho());
			} else if (!cola.esVacia()) {
				System.out.println();
				nivel++;
				cola.encolar(null);
			}
		}
	}

	public boolean esLleno() {
		ArbolBinario<T> arbol = null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		boolean lleno = true;
		cola.encolar(this);
		int cant_nodos = 0;
		cola.encolar(null);
		int nivel = 0;
		while (!cola.esVacia() && lleno) {
			arbol = cola.desencolar();
			if (arbol != null) {
				if (arbol.tieneHijoIzquierdo()) {
					cola.encolar(arbol.getHijoIzquierdo());
					cant_nodos++;
				}
				if (arbol.tieneHijoDerecho()) {
					cola.encolar(arbol.getHijoDerecho());
					cant_nodos++;
				}
			} else if (!cola.esVacia()) {
				if (cant_nodos == Math.pow(2, ++nivel)) {
					cola.encolar(null);
					cant_nodos = 0;
				} else
					lleno = false;
			}
		}
		return lleno;
	}

	boolean esCompleto() {
		return false;
	}

	public ArbolBinario<T> espejo() {
		if (!this.tieneHijoDerecho() && !this.tieneHijoIzquierdo())
			return this;
		ArbolBinario<T> aux = this.hijoIzquierdo;
		this.agregarHijoIzquierdo(this.hijoDerecho);
		this.agregarHijoDerecho(aux);
		if (this.tieneHijoIzquierdo())
			this.getHijoIzquierdo().espejo();
		if (this.tieneHijoDerecho())
			this.getHijoDerecho().espejo();
		return this;
	}

	// imprime el árbol en preorden
	public void printPreorden() {
		System.out.println(this.getDato());
		if (this.tieneHijoIzquierdo()) {
			this.getHijoIzquierdo().printPreorden();
		}
		if (this.tieneHijoDerecho()) {
			this.getHijoDerecho().printPreorden();
		}
	}

	// imprime el �rbol en postorden
	public void printPostorden() {
		if (this.tieneHijoIzquierdo()) {
			this.getHijoIzquierdo().printPostorden();
		}
		if (this.tieneHijoDerecho()) {
			this.getHijoDerecho().printPostorden();
		}
		System.out.println(this.getDato());
	}

	public void printInorden() {
		if (this.tieneHijoIzquierdo()) {
			this.getHijoIzquierdo().printInorden();
		}
		System.out.println(this.getDato());
		if (this.tieneHijoDerecho()) {
			this.getHijoDerecho().printInorden();
		}
	}

	public void recorridoPorNiveles() {
		ArbolBinario<T> arbol = null;
		ColaGenerica<ArbolBinario<T>> cola = new ColaGenerica<ArbolBinario<T>>();
		cola.encolar(this);
		cola.encolar(null);
		while (!cola.esVacia()) {
			arbol = cola.desencolar();
			if (arbol != null) {
				System.out.print(arbol.getDato() + " ");
				if (arbol.tieneHijoIzquierdo())
					cola.encolar(arbol.getHijoIzquierdo());
				if (arbol.tieneHijoDerecho())
					cola.encolar(arbol.getHijoDerecho());
			} else if (!cola.esVacia()) {
				System.out.println();
				cola.encolar(null);
			}
		}
	}

	public ListaGenerica<T> frontera() {
		ListaGenerica<T> l = new ListaEnlazadaGenerica<T>();

		return l;
	}

	public int contarHojas() {
		int cont = 0;
		if (!this.tieneHijoDerecho() && !this.tieneHijoIzquierdo()) {
			return 1;
		}
		if (this.tieneHijoIzquierdo())
			cont += this.getHijoIzquierdo().contarHojas();
		if (this.tieneHijoDerecho())
			cont += this.getHijoDerecho().contarHojas();

		return cont;
	}

	public int contarNodos() {
		int cont = 1;
		if (this.tieneHijoIzquierdo())
			cont += this.getHijoIzquierdo().contarNodos();
		if (this.tieneHijoDerecho())
			cont += this.getHijoDerecho().contarNodos();

		return cont;
	}

}
