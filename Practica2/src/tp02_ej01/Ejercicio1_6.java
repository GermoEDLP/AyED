package tp02_ej01;

import ListasDeEnteros.*;

public class Ejercicio1_6 {

	public static void main(String[] parametro) {

		Ejercicio1_6 f = new Ejercicio1_6();
		ListaDeEnterosEnlazada l = f.calcularSucesion(6);

		for (int i = 0; i < l.tamanio(); i++) {
			System.out.print(l.elemento(i + 1) + " ");
		}

	}

	public ListaDeEnterosEnlazada calcularSucesion(int n) {
		ListaDeEnterosEnlazada l;
		if (n % 2 == 0) {
			l = calcularSucesion(n / 2);
			l.agregarInicio(n);
		} else if (n == 1) {
			l = new ListaDeEnterosEnlazada();
			l.agregarInicio(1);
		} else {
			l = calcularSucesion((3 * n) + 1);
			l.agregarInicio(n);
		}
		return l;
	}

}
