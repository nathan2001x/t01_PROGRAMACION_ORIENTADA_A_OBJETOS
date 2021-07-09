package t01_PROGRAMACION_ORIENTADA_A_OBJETOS;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int a,b,c;
		System.out.println("Ingrese primer numero");
		a=teclado.nextInt();
		System.out.println("Ingrese segundo numero");
		b=teclado.nextInt();
		if (b==0) {
			System.out.println("La division es imposible el segundo numero no debe ser cero");
		}else {
			c=a/b;
			System.out.println("La division es: "+c);
		}
		}

}
