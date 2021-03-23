package practica1b;


public class ej5 {

	public static void main(String[] parametro) {
		int[] datos = {8,5,6,8,9,2,12,23,7,98,56,78,8,1,105};
		
		/*Ejercicio a)
		 * Los datos son retornados en forma de objeto por el mismo metodo que los calcula
		 * */
		Datos ej5a = Calculo.calcular(datos);
		System.out.println("Maximo: "+ej5a.getMax()+" | Minimo: "+ej5a.getMin()+" | Promedio: "+ej5a.getProm());
		
		/*Ejercicio b)
		 * Los datos son agregados a un objeto pasado por referencia al metodo que los calcula
		 * */
		Datos ej5b = new Datos();
		Calculo.calcularPorReferencia(datos, ej5b);
		System.out.println("Maximo: "+ej5b.getMax()+" | Minimo: "+ej5b.getMin()+" | Promedio: "+ej5b.getProm());
		
		/*Ejercicio c)
		 * Los datos son albergados en variables estaticas dentro de la clase que provee el metodo de calculo.
		 * */
		Calculo.calcularSinRetorno(datos);
		System.out.println("Maximo: "+Calculo.getMaxCalc()+" | Minimo: "+Calculo.getMinCalc()+" | Promedio: "+Calculo.getPromCalc());
	}
}
