package ec.edu.uce.modelo;

public class Propietario {
	private String nombre,apellido;
	private int edad;
	
//	Setters y Getters	
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
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Propietario [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + "]";
	}
	
	
}
