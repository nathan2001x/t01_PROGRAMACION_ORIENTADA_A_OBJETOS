package deber.diagrama;

import java.util.Scanner;

public class Diagrama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado =new Scanner(System.in);
		int n,v;
		
		do {
			 System.out.println("***************************************");
			 System.out.println("*  Banco Pichincha seleccione opcion  *");
			 System.out.println("*       1. Retiro dinero              *");
			 System.out.println("*       2. Cambiar cuenta             *");
			 System.out.println("*       3. Bloquear cuenta            *");
			 System.out.println("*       4. Salir                      *");
			 System.out.println("***************************************");
		
			n=teclado.nextInt();
			
			if(n==1) {
				System.out.println("Ingrese valor a retirar");
				v=teclado.nextInt();
				System.out.println("El valor a retirar es: "+v);
			
			} if(n==2){
				System.out.println("Ingrese nueva clave");
				v=teclado.nextInt();
				System.out.println("Su clave ha sido cambiada");
			} if (n==3) {
				System.out.println("Su cuenta ha sido cambiada");
			}  if(n==4) {
				System.out.println("Plataforma cerrada");
			}
			n=teclado.nextInt();
			
		} while (n<=4);
		
		
		
	}

}
