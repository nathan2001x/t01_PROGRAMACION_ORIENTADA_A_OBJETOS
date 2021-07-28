package pruebas;

import java.util.Scanner;

public class Prueba1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner (System.in);
		int n,s=0,c=0;
		float p=0f;
		for( int i=1;i!=0;i++) {
			System.out.println("Ingrese un numero positivo");
			n=teclado.nextInt();
			if(n==0) {
				i=-1;
			} else {
				s=s+n;
				p=s/i;
				c=c+1;
			}
			
		}
		
		System.out.println("La suma es: "+s);
		System.out.println("El promdio es: "+p);
		System.out.println("La cantidad es: " +c);
	}

}
