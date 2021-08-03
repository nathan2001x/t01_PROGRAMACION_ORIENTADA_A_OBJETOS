package pruebas;

import java.util.Scanner;

public class Prueba3ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int n=-1,s=0, sp=0,si=0,ci=1,i=1;
		float pi=00f;
		/*for( int i=1;i!=-1;i++) {
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
		*/
		do {
			System.out.println("Ingrese un numero positivo");
			n=teclado.nextInt();
			si=si+n;
			ci=ci+1;
			pi=si/ci;
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
		while (n!=-1);
		
		System.out.println("La suma de los pares es: "+sp);
		System.out.println("El promedio de los impares es: "+pi);
	}

}


