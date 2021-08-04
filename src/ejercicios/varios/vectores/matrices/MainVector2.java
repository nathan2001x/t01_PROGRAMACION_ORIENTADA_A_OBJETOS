package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainVector2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* declare un vector X[3]cuya longitud se solicite al usuario de tipo int y construya un programa que pida al usuario que 
		 * ingrese los valores a cada posicion
		 */
		// Y finalmente que se imprima los valores ingresados
		Scanner teclado=new Scanner (System.in);
		
		int n;
		System.out.println("Ingrese la longitud del vector");
		n=teclado.nextInt();
		int X[]=new int [n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Ingrese el valor del vector "+i);
			 n=teclado.nextInt();
			X[i]=n;
		
	}
		for(int i=0;i<n;i++) {
			System.out.println("El valor de la posicion es: "+i);
			System.out.println(X[i]);
		}
	}
}
