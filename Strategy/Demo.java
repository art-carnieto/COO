
public class Demo {

	
	public static void main(String[] args) {
		Contexto c = new Contexto();
		
		c.setTemperatura(-26);
		c.setEstrategia(new StrategyEscalada());

		System.out.println(c.getTemperatura());
		if (c.getResultado() == true) System.out.println("OK!");
		else System.out.println("Nao OK!");
		
		c.setEstrategia (new StrategyEsqui());
		System.out.println(c.getTemperatura());
		if (c.getResultado() == true) System.out.println("OK!");
		else System.out.println("Nao OK!");
		
	}
	
}
