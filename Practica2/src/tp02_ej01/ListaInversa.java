package tp02_ej01;

import ListasDeEnteros.*;

public class ListaInversa {
	public static void main(String[] parametro) {

		ListaDeEnteros l = generarLista();

		imprimirInverso(l, 1);

	}

	private static ListaDeEnteros generarLista() {
		int[] array = { 1, 2, 3, 4, 5, 6 };
		ListaDeEnteros l = new ListaDeEnterosEnlazada();
		for (int i = 0; i < array.length; i++) {
			l.agregarFinal(array[i]);
		}
		return l;
	}

	private static void imprimirInverso(ListaDeEnteros l, int pos) {
		if(pos<=l.tamanio()) {
			int a = l.elemento(pos);
			imprimirInverso(l, pos+1 );
			System.out.print(a + " ");			
		}
			
	}
}
