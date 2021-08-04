package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* declare un vector X[3]tipo char y construya un programa que pida al usuario que ingrese los valores para cada posicion 
		 */
		// Y finalmente que se imprima los valores ingresados
		Scanner teclado=new Scanner(System.in);
		char X[]=new char [3];
		
		for(int i=0;i<3;i++) {
		System.out.println("Ingrese el valor de la posicion: "+i);
		char n=teclado.next().charAt(0);
		X[i]=n;
		

	}
		//System.out.println(X);
		//recoriendo el vector lleno 
		for(int i=0;i<3;i++) {
			System.out.println("El valor de la posicion es: "+i);
			System.out.println(X[i]);
		}
		
	}
}






