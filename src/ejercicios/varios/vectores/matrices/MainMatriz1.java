package ejercicios.varios.vectores.matrices;

import java.util.Scanner;

public class MainMatriz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.Declare una matriz A[3,4] tipo chary  desarrolle un programa que vaya solicitando cada una de sus posiciones 
		// este es mi teclado
		Scanner teclado=new Scanner (System.in);
		
		int longitudFila=teclado.nextInt();
		int longitudColumnas=teclado.nextInt();
		
		char A[][]=new char [longitudFila][longitudColumnas];
		for(int fila=0;fila<longitudFila;fila++) {
			
			for(int columna=0;columna<longitudColumnas;columna++) {
			System.out.println("Ingrese el valor fila: "+ fila +" Columna: "+ columna);	
			//el usuario digita el valor por teclado y acontinuacion lee
			char n=teclado.next().charAt(0);
			A[fila][columna]=n;
			}
		}
		
		System.out.println("Iniciamos a imprimir la matriz");
			for(int fila=0;fila<longitudFila;fila++) {
			for(int columna=0;columna<longitudColumnas;columna++) {
			System.out.println(A[fila][columna]+" ");	
			}
			System.out.println();
		}	
	}
}

