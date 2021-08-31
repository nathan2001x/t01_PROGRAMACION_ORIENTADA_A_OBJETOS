package prueba.pasajeros;

public class Adultos {
	
	private String Nombre;
	private String Apellido;
	private int edad;
	private int codigoSeguro;
	private int codigoJubilacion;
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
	public int getCodigoSeguro() {
		return codigoSeguro;
	}
	public void setCodigoSeguro(int codigoSeguro) {
		this.codigoSeguro = codigoSeguro;
	}
	public int getCodigoJubilacion() {
		return codigoJubilacion;
	}
	public void setCodigoJubilacion(int codigoJubilacion) {
		this.codigoJubilacion = codigoJubilacion;
	}
	@Override
	public String toString() {
		return "Adultos [Nombre=" + Nombre + ", Apellido=" + Apellido + ", edad=" + edad + ", codigoSeguro="
				+ codigoSeguro + ", codigoJubilacion=" + codigoJubilacion + "]";
	}
	
	
	
}
