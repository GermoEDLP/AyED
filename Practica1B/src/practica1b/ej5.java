package practica1b;


public class ej5 {

	public static void main(String[] parametro) {
		int[] datos = {8,5,6,8,9,2,12,23,7,98,56,78,8,1,105};
		
		/*Ejercicio a)*/
		Datos ej5a = Calculo.calcular(datos);
		System.out.println("Maximo: "+ej5a.getMax()+" | Minimo: "+ej5a.getMin()+" | Promedio: "+ej5a.getProm());
		
		/*Ejercicio b)*/
		Datos ej5b = new Datos();
		Calculo.calcularPorReferencia(datos, ej5b);
		System.out.println("Maximo: "+ej5b.getMax()+" | Minimo: "+ej5b.getMin()+" | Promedio: "+ej5b.getProm());
		
		/*Ejercicio c)*/
		Calculo.calcularSinRetorno(datos);
	}
}
