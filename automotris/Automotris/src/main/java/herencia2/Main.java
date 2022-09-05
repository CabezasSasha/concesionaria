package herencia2;

public class Main {
	public static void main(String[] args) {
		Camion camion1 = new Camion("negro", "2019", "Renault", 80000.00 , 6, "AAA111", 3, 10000, 12000);
		Camion camion2 = new Camion("rojo", "2015", "Fiat", 80000.00 , 6, "AAA222", 3, 10000, 8000);
		
		Omnibus omnibus1 = new Omnibus("rojo", "2015", "Fiat", 90000.00 , 6, "AAA333", 40, 2);
		Omnibus omnibus2 = new Omnibus("verde", "2015", "BMW", 150000.00 , 6, "AAA444", 40, 2);
		
		camion1.arrancar(); //motodo heredado
		camion1.cargar(12000);// motodo propio de la clase
		Integer torneladaCargar = new Integer(8050);
		camion2.cargar(8000);
		
		omnibus1.arrancar();
		omnibus1.ocuparAsientos();
	}
}
