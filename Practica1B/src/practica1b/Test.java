package practica1b;

public class Test {
	
	public static void main(String[] parametro) {
		
		Profesor[] prof = new Profesor[3];
		Estudiante[] est = new Estudiante[2];
		
		prof[0] = new Profesor("Juan", "Perez", "juanp@mail.com", "AyED", "Informatica");
		prof[1] = new Profesor("Alicia", "Lopez", "alil@mail.com", "CADP", "Informatica");
		prof[2] = new Profesor("Pedro", "Gimenez", "pedrog@mail.com", "COC", "Informatica");

		est[0] = new Estudiante("Alberto", "Rodriguez", "Anchorena 1595", "albertr@mail.com", "A");
		est[1] = new Estudiante("Agustina", "Pons", "Sanz Peña 863", "ponsa@mail.com", "B");
		
		for(int i = 0; i < prof.length; i++) {
			System.out.println(prof[i].tusDatos());
		};
		for(int i = 0; i < est.length; i++) {
			System.out.println(est[i].tusDatos());
		};
		
	}

}
