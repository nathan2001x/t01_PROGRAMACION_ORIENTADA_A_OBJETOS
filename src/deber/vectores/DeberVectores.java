package deber.vectores;

public class DeberVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.Declara un vector X(8)
		int X[]=new int [8];
		//2.Declarar un vector Y(3) de tipo char y asignar a la posición 2 el valor de A
		char Y[]=new char [3];
		Y[2]='A';
		//3.Declarar un vector A(5) asignar a la posición 0 el valor 25, posición 3 el valor 49 y a la posición 2 el valor de la posición 0
		int A[]=new int[5];
		A[0]=25;
		A[3]=49;
		A[2]=25;
		//4.Declarar un vector B(10), a la posición B[0] asignele el valor del vecto A[3] del ejercicio anterior
		int B[]=new int[10];
		B[0]=49;
		//5.Declara un vector Z(12) y asignar a todas sus posiciones valores que inician desde 1 y son secuenciales
		int Z[]=new int[12];
		Z[0]=1;
		Z[1]=2;
		Z[2]=3;
		Z[3]=4;
		Z[4]=5;
		Z[5]=6;
		Z[6]=7;
		Z[7]=8;
		Z[8]=9;
		Z[9]=10;
		Z[10]=11;
		Z[11]=12;
		//6.Declara un vector Y(10) y asignar a todas sus posiciones valores impares que inician desde 1 y son secuenciales
		int Y[]=new int[10];
		Y[1]=1;
		Y[3]=2;
		Y[5]=3;
		Y[7]=4;
		Y[9]=5;
		
		//7.Declara un vector H(10) y asignar solo a las posiciones impares letras que inician desde la A secuencialmente
		int H[]=new int[10];
		H[1]='A';
		H[3]='B';
		H[5]='C';
		H[7]='D';
		H[9]='E';
		
		/*8.Declarar un vector F(10) y en base al ejercicio anterior asignar los valores de la siguiente manera:
		F[0]=H[3]
		F[3]=H[2]
		F[4]=H[6]
		F[7]=H[0]
		F[8]=H[1]
		F[9]=H[9]  */
			
		int F[]=new int[10];
		   F[0]='B';
		// F[3]=; vacio 
		// F[4]=; vacio
		// F[7]=; vacio
		   F[8]='A';
		   F[9]='E';
		   
		//9.Declara un vector L(15) y asignar valores en base a los siguiente:
		 /*  L[0]= (promedio de 3,5,7 y 9)
		   L[4]= (la suma de 5, 7, 8 y 15)
		   L[7]= (la multiplicación de 6, 7 y 3)
		   L[10]= (la división de 10/2)   */
		   
		   int L[]=new int[15];
		   L[0]=6;
		   L[4]=35;
		   L[7]=126;
		   L[10]=5;
		   
		 //10.Declarar un vector N(12) y realizar las siguientes asignaciones:
		/*   N[0]= (promedio de 3,10 y 9)
	       N[4]= (la suma de 7, 8 y 10)
		   N[12]= (la multiplicación de 5, 7 y 3)
		   N[20]= (la suma de 7, -3 y 8)
		   en la última posición el valor de 20/4 */
		   
		   int N[]=new int [12];
		   N[0]=(int)7.33;
		   N[4]=25;
		  // N[12]=105; error posicion fuera de rango
		  // N[20]=12; error posicion fuera de rango
		   N[11]=5;
		
	}

}
