package tp1.ej3;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String comision;
	private String email;
	private String direccion;
	
	public Estrudiante () {}
	
public Estudiante (String n, String a, String c, String e, String d) {
	this.nombre= n;
	this.apellido= a;
	this.comision=c;
	this.email=e;
	this.direccion=d;
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
	public String getComision() {
		return comision;
	}
	public void setComision(String comision) {
		this.comision = comision;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String tusDatos() {
		   return "nombre: "+ getNombre() +" apellido: "+ getApellido() +" email: "+ getEmail() + " comision: "+ getComision() +" direccion: "+ getDireccion();}

}
