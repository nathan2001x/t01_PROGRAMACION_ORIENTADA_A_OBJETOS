package ejercicios.vectores;

public class MainVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.Declarar un vector a[10] tipo int
		int miVector[] = new int[10];

		// 2.declarar un miVector[5] tipo char
		char miVector1[] = new char[5];

		// declarar un vector miVec[4] tipo char, y asignamos la letra 'A' a la posicion
		// 0 y 2.
		char miVec[] = new char[4];
		miVec[0] = 'A';
		miVec[2] = 'A';

		// declarar un vector miVec[3] tipo byte, y asignamos el numero 0 a la posicion
		// 0,1,2,3.
		byte miVec1[] = new byte[3];
		miVec1[0] = 0;
		miVec1[1] = 0;
		miVec1[2] = 0;
		// miVec1[3]=0; Esta es una mala asiganacion porque esta fuera de rango la
		// posicion 3

		/*
		 * declarar un vector miVec2[3] de tipo char y asignamos la letra 'A' a las
		 * posiciones 0 y 1, y a la posicion 2 la letra 'B' finalmente imprimir las
		 * posiciones 0 y 2
		 */

		char miVec2[] = new char[3];
		miVec2[0] = 'A';
		miVec2[1] = 'A';
		miVec2[2] = 'B';
		System.out.println("Impresion 1: " + miVec2[0]);

		miVec2[0] = 'Z';

		System.out.println("Impresion 2: " + miVec2[0]);
		System.out.println("Impresion 3: " + miVec2[2]);
		System.out.println(miVec2);


	}

}
