package pruebas;

import java.util.Scanner;

public class Prueba3ParesImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado=new Scanner (System.in);
		int n,s=0, sp=0,si=0,ci=1;
		float pi=0f;
		for( int i=1;i!=-1;i++) {
			System.out.println("Ingrese un numero positivo");
			n=teclado.nextInt();
			if(n==-1) {
				i=-2;
			} if(n%2==0) {
				sp=sp+n;
			} else {
				si=si+n;
				ci=ci+1;
				pi=si/ci;
			}
			
		}
		
		System.out.println("La suma de los pares es: "+sp);
		System.out.println("El promedio de los impares es: "+pi);
	}

}
