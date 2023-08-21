package empresa;

public class Principal {

	public static void main(String[] args) {
		Conta c1 = new Conta(111,"Eduardo", 2000,500);
		
		c1.info();
		
		if(!c1.sacar(2000)) {
			System.out.println("Problema ao sacar!");
		}
		
		if(!c1.depositar(-500)) {
			System.out.println("Problema ao depositar!");
		}
		System.out.println();
		c1.info();
		
		c1.sacar(200);
		c1.depositar(500);
		System.out.println();
		c1.info();

	}

}
