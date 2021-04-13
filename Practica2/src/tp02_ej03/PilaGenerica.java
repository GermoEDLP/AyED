package tp02_ej03;

import ListasGenericas.*;

public class PilaGenerica<T> {

	private ListaEnlazadaGenerica<T> lista;

	public PilaGenerica() {
		this.lista = new ListaEnlazadaGenerica<T>();
	}

	public void apilar(T dato) {
		lista.agregarEn(dato, 1);
	}

	public T desapilar() {
		T x = lista.elemento(1);
		lista.eliminarEn(1);
		return x;
	}

	public T tope() {
		return lista.elemento(1);
	}

	public boolean esVacia() {
		return lista.tamanio() == 0;
	}

}
