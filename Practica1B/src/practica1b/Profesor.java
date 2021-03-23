package practica1b;

public class Profesor {
	
	private String nombre;
	private String apellido;
	private String catedra;
	private String email;
	private String facultad;
	
	public Profesor(String nombre, String apellido, String email, String catedra, String facultad) {
		this.setApellido(apellido);
		this.setCatedra(catedra);
		this.setEmail(email);
		this.setFacultad(facultad);
		this.setNombre(nombre);
	}
	
	public String tusDatos() {
		return this.getApellido()+", "+ this.getNombre()+" ("+this.getEmail()+") <"+this.getFacultad()+" ("+this.getCatedra()+")>";
	}	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCatedra() {
		return catedra;
	}
	public void setCatedra(String catedra) {
		this.catedra = catedra;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}
	
	
	

}
