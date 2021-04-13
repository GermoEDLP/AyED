package tp02_ej01;
import ListasDeEnteros.*;

public class TestListaDeEnterosConArreglos {
	public static void main(String[] parametro) {
		
		int[] array = {1,2,3,4};
		ListaDeEnteros l = new ListaDeEnterosConArreglos();
		for(int i = 0; i < array.length; i++) {
			l.agregarFinal(array[i]);
		}
		for(int i = 0; i < l.tamanio(); i++) {
			System.out.println(l.elemento(array[i]));;
		}
		
	}	
}
