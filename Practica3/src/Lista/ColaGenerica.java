package Lista;

public class ColaGenerica<T> {
	private ListaEnlazadaGenerica<T> cola;

	public ColaGenerica() {
		this.cola = new ListaEnlazadaGenerica<T>();
	}

	public void encolar(T dato) {
		cola.agregarFinal(dato);
	}

	public T desencolar() {
		T x = cola.elemento(1);
		cola.eliminarEn(1);
		return x;
	}

	public T tope() {
		return cola.elemento(1);
	}

	public boolean esVacia() {
		return cola.tamanio() == 0;
	}
}
