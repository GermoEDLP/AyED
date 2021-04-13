package tp02_ej04;

import java.util.Scanner;
import tp02_ej03.PilaGenerica;

public class ejercicio04_b {

	public static void main(String[] parametro) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese la cadena a balancear");
		ejercicio04_b e = new ejercicio04_b();
		System.out.print(e.evaluarBalance(s.next())?"Balanceada":"Desbalanceada");
		s.close();
	}

	public boolean evaluarBalance(String s) {
		PilaGenerica<Character> pila = new PilaGenerica<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (c == '[' || c == '(' || c == '{') {
				pila.apilar(c);
			} else if (c == ']') {
				if (pila.esVacia() || pila.desapilar() != '[') {
					return false;
				}
			} else if (c == ')') {
				if (pila.esVacia() || pila.desapilar() != '(') {
					return false;
				}
			} else if (c == '}') {
				if (pila.esVacia() || pila.desapilar() != '{') {
					return false;
				}
			}
		}
		return pila.esVacia();
	}

}
