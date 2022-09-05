 package compo;

/**
 * Clase que simula una pantalla web del banco
 * y se consulta datos de cliente y de su cuenta.
 * 
 * @author Cabezas
 *
 */
public class Banco {

	public static void main(String[] args) {
		Cuenta ctaCte = new Cuenta(10000.50, 455666, "cuenta corriente", "pesos");
		Cuenta cajaAhorro = new Cuenta(500.00, 435666, "caja ahorro", "dolares");
		Cliente cli1 = new Cliente("Pedro", "Suarez", ctaCte, cajaAhorro);
		
		
		System.out.println(cli1.getNombre());
		System.out.println(cli1.getCtaCte().getSaldo());
		System.out.println(cli1.getCtaCte().getTipoCuenta());
		
		System.out.println(cli1.getCajaAhorro().getSaldo());
		
		
		Cuenta ctaCte2 = new Cuenta(10000.50, 455666, "cuenta corriente", "pesos");
		Cuenta cajaAhorro2 = new Cuenta(500.00, 435666, "caja ahorro", "dolares");
		Cliente cli2 = new Cliente("Roxana", "Gimenez", ctaCte2, cajaAhorro2);
		System.out.println(cli2.getCtaCte().getSaldo());
		
		
	}
}
