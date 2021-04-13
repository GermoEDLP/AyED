package practica1b;

public class ej1 {
	
	public static void entreNumerosFor(int a, int b){		
		for(int i = a; i<=b; i++) {
			System.out.println(i);
		}		
	};
	
	public static void entreNumerosWhile(int a, int b){		
		while(a<=b) {
			System.out.println(a);
			a++;
		}
	};
	
	public static void entreNumerosSinLoop(int a, int b){		
		System.out.println(a);
		if(a<b) {
			ej1.entreNumerosSinLoop(a+1, b);
		}
	};

}
