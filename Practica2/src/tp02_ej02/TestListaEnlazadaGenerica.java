package tp02_ej02;
import ListasGenericas.*;
import practica1b.Estudiante;

/*
 * Para importar una clase de otro proyecto (en este caso Pracyica1B), haga clic con el botón 
 * derecho del ratón en la carpeta del proyecto Practica2 --> propiedades(properties) --> 
 * ruta de construcción(Java Build Path) --> proyectos(Projects) --> ClassPath --> añadir(Add).
 * Ahora agregue el proyecto Practica1B.
 * Luego importelo como se ve arriba.
 * */


public class TestListaEnlazadaGenerica {

	public static void main(String[] parametro) {
		
		ListaEnlazadaGenerica<Estudiante> l = new ListaEnlazadaGenerica<Estudiante>();
		// l.agregarInicio(new Estudiante("German", "Brassini", "67 #40", "test@test.com", "A"));
		// l.agregarInicio(new Estudiante("German", "Brassini", "67 #40", "test@test.com", "A"));
		// l.agregarInicio(new Estudiante("German", "Brassini", "67 #40", "test@test.com", "A"));
		// l.agregarInicio(new Estudiante("German", "Brassini", "67 #40", "test@test.com", "A"));

		/*for(int i =1; i<=l.tamanio();i++) {
			System.out.println(l.elemento(i).tusDatos());
		}*/
		
		
		
		/*
		 * 2.4 d) Trabajando con agregar(T[]) en una lista generica.
		 */
		Estudiante[] listaDeEstuduantes = new Estudiante[4];
		
		listaDeEstuduantes[0] = new Estudiante("German", "Brassini", "67 #40", "test@test.com", "A");
		listaDeEstuduantes[1] = new Estudiante("German", "Brassini", "67 #40", "test@test.com", "A");
		listaDeEstuduantes[2] = new Estudiante("German", "Brassini", "67 #40", "test@test.com", "A");
		listaDeEstuduantes[3] = new Estudiante("German", "Brassini", "67 #40", "test@test.com", "A");
		
		l.agregar(listaDeEstuduantes);
		
		for(int i =1; i<=l.tamanio();i++) {
			System.out.println(l.elemento(i).tusDatos());
		}
	}
	
}
