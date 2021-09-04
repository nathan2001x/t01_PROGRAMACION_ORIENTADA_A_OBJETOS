package prueba.uno;

import java.util.Scanner;

public class MainReservaVuelos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner tecladoInt = new Scanner(System.in);
		Scanner tecladoString = new Scanner(System.in);

		System.out.println("Ingrese informacion del pasajero");
		System.out.println("Ingrese nombre:");
		String nombre = tecladoString.nextLine();
		System.out.println("Ingrese apellido");
		String apellido = tecladoString.nextLine();
		System.out.println("Ingrese codigo");
		int edad = tecladoInt.nextInt();
		System.out.println("Que tipo de pasajero es:   1:Pasajero Vip 2:Pasajero Eco");
		int opcion = tecladoInt.nextInt();

		String menbresia = "";
		String descuento = "";
		if (opcion == 1) {
			System.out.println("Ingrese Codigo Menbresia");
			menbresia = tecladoString.nextLine();
		} else {
			System.out.println("Ingrese Codido de Descuento");
			descuento = tecladoString.nextLine();
		}

		PasajeroVip pasajero1 = new PasajeroVip();
		pasajero1.setApellido(apellido);
		pasajero1.setNombre(nombre);
		pasajero1.setCodigoMenbresia(menbresia);
		pasajero1.setEdad(edad);

		PasajeroVip pasajero2 = new PasajeroVip("Javier", "Cruz", "dfdfdfd", 30);

		PasajeroEconomico pasajeroEconomico1 = new PasajeroEconomico();
		pasajeroEconomico1.setNombre("Edison");
		pasajeroEconomico1.setApellido("Cayambe");
		pasajeroEconomico1.setCodigoDescuento("65jf");
		pasajeroEconomico1.setEdad(34);

		PasajeroEconomico pasajeroEconomico2 = new PasajeroEconomico();
		pasajeroEconomico2.setNombre("Edison2");
		pasajeroEconomico2.setApellido("Cayambe2");
		pasajeroEconomico2.setCodigoDescuento("65jd");
		pasajeroEconomico2.setEdad(34);

		Pasajero[][] asientos = new Pasajero[4][5];
		asientos[0][0] = pasajero1;
		asientos[0][1] = pasajero2;
		asientos[0][2] = pasajeroEconomico1;
		asientos[3][2] = pasajeroEconomico2;

		int opcionSalir = 0;
		do {
			System.out.println("Ingrese datos del asiento, 0 continuar, -1 SALIR");
			opcionSalir = tecladoInt.nextInt();
			if(opcionSalir==0) {
			System.out.println("Ingrese fila del asiento");
			int fila = tecladoInt.nextInt();
			System.out.println("Ingrese columna del asiento");
			int columna = tecladoInt.nextInt();

			System.out.println("Los datos del pasajero son:");
			System.out.println(asientos[fila][columna]);
			} else if(opcionSalir==-1) {
				System.out.println("Va ha salir del sistema");
			}
			
		} while (opcionSalir != -1);

	}

}
