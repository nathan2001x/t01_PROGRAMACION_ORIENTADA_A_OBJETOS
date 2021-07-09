package t01_PROGRAMACION_ORIENTADA_A_OBJETOS;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado=new Scanner(System.in);
		int s,st=0;
		System.out.println("Ingrese sueldo");
		s=teclado.nextInt();
		if (s<300){
			st=s+100;
		}if (s>=300 && s<=400) {
			st=s+70;
		} else if (s>400){
			st=s+50;
		}
		
		System.out.println("El sueldo total es:"+st);
	}

}
