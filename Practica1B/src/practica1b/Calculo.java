package practica1b;

public class Calculo {
	public static Datos calcular(int[] datos) {
		int max = 0, min = 9999; float cont = 0, total = 0;
		for (int i = 0; i < datos.length; i++) {
			if (datos[i] > max)
				max = datos[i];
			if (datos[i] < min)
				min = datos[i];
			cont++;
			total+=datos[i];
		}
		Datos objeto = new Datos();
		float prom = total/cont;
		objeto.setMax(max);
		objeto.setMin(min);
		objeto.setProm(prom);
		return objeto;
	}
	
	public static void calcularPorReferencia(int[] nums, Datos datos) {
		int max = 0, min = 9999; float cont = 0, total = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max)
				max = nums[i];
			if (nums[i] < min)
				min = nums[i];
			cont++;
			total+=nums[i];
		}
		float prom = total/cont;
		datos.setMax(max);
		datos.setMin(min);
		datos.setProm(prom);
	}
	
	public static void calcularSinRetorno(int[] nums) {
		int max = 0, min = 9999; float cont = 0, total = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > max)
				max = nums[i];
			if (nums[i] < min)
				min = nums[i];
			cont++;
			total+=nums[i];
		}
		float prom = total/cont;
		Datos datos = new Datos();
		datos.setMax(max);
		datos.setMin(min);
		datos.setProm(prom);
		System.out.println("Maximo: "+datos.getMax()+" | Minimo: "+datos.getMin()+" | Promedio: "+datos.getProm());
	}
}
