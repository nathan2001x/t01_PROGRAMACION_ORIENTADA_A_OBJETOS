package ejercicios.interfaces;

public class CajeroProdubanco implements CajeroInterfaz {

	@Override
	public void solicitarTarjeta(String numero) {
		System.out.println("Tarjeta Ingresada");

	}

	@Override
	public void solicitarClave(String clave) {
		System.out.println("Clave ingresada");

	}

	@Override
	public void solicitarTipoTransaccion() {
		System.out.println("Transaccion Ingresada");

	}

	@Override
	public void solicitarMonto(int monto) {
		System.out.println("Monto Ingresado");
	}

	@Override
	public void validarSaldo() {
		System.out.println("Saldo Validado");

	}

	@Override
	public void entregarDinero() {
		System.out.println("Dinero entregado");

	}

	@Override
	public void realizarLaTransaccion() {
		System.out.println("Transaccion realizada");

	}

	@Override
	public void entregarRecibo() {
		System.out.println("Recibo entregada");

	}

}