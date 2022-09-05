package concesionaria;

public class Concesionaria {
	
	public static void main(String[] args) {
		Automovil auto1 = new Automovil("rojo", "AAD334");
		Automovil auto2 = new Automovil("azul", "EDD754");
		Automovil auto3 = new Automovil("gris", "YTR123", false);
		
		Vendedor vend1 = new Vendedor("Jose", "Suarez");
		Vendedor vend2 = new Vendedor("Pedro", "Diaz");
		
		Cliente cli1 = new Cliente("Rozario", "Sanchez");
		
		vend1.venderAuto(auto2, cli1);
		
		auto3.arrancar();
	}

}
