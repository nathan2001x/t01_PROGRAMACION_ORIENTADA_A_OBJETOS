// 1.declaracion de paquete

package ejercicios.metodos;
// 2 declaracion de importaciones

//3. comentarios
// clase que se encarga de realizar una impresion en formatos A4

//4. declaracion de la clase
public class Impresora {
	
	// 5. constantes
	//6. variables
	public String color;
	
	// 7. constructor
	public Impresora() {
		
	}
	// 8. metodos
	public void imprimir(String datosAImprimir, int letra) {
		
		System.out.println("Logo UCE");
		System.out.println("*************");
		System.out.println(datosAImprimir);
		System.out.println("*************");
		System.out.println("Pie de firma");
	}
}
