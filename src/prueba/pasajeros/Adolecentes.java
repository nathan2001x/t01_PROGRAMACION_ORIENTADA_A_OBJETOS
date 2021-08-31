package prueba.pasajeros;

public class Adolecentes {
	
	private String Nombre;
	private String Apellido;
	private int edad;
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Adolecentes [Nombre=" + Nombre + ", Apellido=" + Apellido + ", edad=" + edad + "]";
	}
	
	
	
	
	
	
	
}
