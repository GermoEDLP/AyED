package practica1b;

public class Calculo {
	
	private static int minCalc;
	private static int maxCalc;
	private static float promCalc;
	
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
		Calculo.setMinCalc(min);
		Calculo.setMaxCalc(max);
		Calculo.setPromCalc(prom);
	}

	public static int getMinCalc() {
		return minCalc;
	}

	public static void setMinCalc(int minCalc) {
		Calculo.minCalc = minCalc;
	}

	public static int getMaxCalc() {
		return maxCalc;
	}

	public static void setMaxCalc(int maxCalc) {
		Calculo.maxCalc = maxCalc;
	}

	public static float getPromCalc() {
		return promCalc;
	}

	public static void setPromCalc(float promCalc) {
		Calculo.promCalc = promCalc;
	}
}
