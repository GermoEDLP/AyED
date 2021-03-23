package practica1b;

public class ej2 {
	
	public static int[] crearArrayDeMultiplos(int n){
		int[] array = new int[n];		
		for(int i = 1; i <= n; i++) {
			array[i-1] = n*i;
		}		
		return array;
	}
	
	public static void arrayDeMultiplos(int n) {
		int[] array = ej2.crearArrayDeMultiplos(n);
		for(int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}
		
	}

}
