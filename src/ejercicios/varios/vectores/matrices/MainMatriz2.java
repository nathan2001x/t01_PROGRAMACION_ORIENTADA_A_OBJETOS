package ejercicios.varios.vectores.matrices;

public class MainMatriz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//desarrollar un programa que imprima la siguiente imagen(excel)
		
		int a[][]=new int [5][5];
		
		for(int f=0;f<5;f++) {
			for(int c=0;c<5;c++) {
				if(f==c) {
					a[f][c]=1;
				}else {
					a[f][c]=0;
				}
				System.out.print(a[f][c]);
			}
			System.out.println();
		}
	}

}
