package t01_PROGRAMACION_ORIENTADA_A_OBJETOS;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int a,b;
		System.out.println("Ingrese primer numero");
		a=teclado.nextInt();
		System.out.println("Ingrese segundo numero");
		b=teclado.nextInt();
		if(a%b==0) {
			System.out.println("A es multiplo de B");
		}else {
			System.out.println("A no es multiplo de B");
		}
		
	}

}
