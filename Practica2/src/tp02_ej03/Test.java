package tp02_ej03;


public class Test {
	public static void main(String[] parametro) {
		PilaGenerica<Integer> p = new PilaGenerica<Integer>();
		p.apilar(10);
		p.apilar(20);
		p.apilar(30);
		System.out.println("Tope Lista: " + p.tope());
		
		ColaGenerica<Integer> c = new ColaGenerica<Integer>();
		c.encolar(10);
		c.encolar(20);
		c.encolar(30);
		System.out.println("Tope Cola: " + c.tope());
	}
}
