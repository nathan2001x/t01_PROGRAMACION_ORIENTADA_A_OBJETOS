package prueba.uno;

public class PasajeroVip extends Pasajero{
	
	private String codigoMenbresia;
	
	public PasajeroVip() {
		// TODO Auto-generated constructor stub
	}
	
	public PasajeroVip(String nombre, String apellido, String codigoMenbresia,int edad) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.codigoMenbresia=codigoMenbresia;
	}
	

	
	

	// metodos set y get
	public String getCodigoMenbresia() {
		return codigoMenbresia;
	}

	public void setCodigoMenbresia(String codigoMenbresia) {
		this.codigoMenbresia = codigoMenbresia;
	}

}
