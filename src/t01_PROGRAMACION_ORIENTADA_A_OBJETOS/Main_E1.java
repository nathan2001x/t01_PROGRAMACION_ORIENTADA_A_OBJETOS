package t01_PROGRAMACION_ORIENTADA_A_OBJETOS;

import java.util.Scanner;

public class Main_E1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		System.out.println("Ingrese el valor del sueldo");
		int S=teclado.nextInt();
		if(S<300) {

			System.out.println("Su bonificacion es: 40$"); // SI
		}else {
			System.out.println("Su bonificacion es: 0$"); // NO
			
		}
	}

}
