package diagramas.de.flujo;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		// TODO Auto-generated method s
				int n;
				Scanner teclado=new Scanner(System.in);
				System.out.println("Ingrese numero de filas ");
				n=teclado.nextInt();
				for(int f=n;f>=1;f=f-1) {
					for(int a=f;a>=1;a=a-1) {
						System.out.print("*");
					}
					System.out.println("");
				
	}
	}
}

