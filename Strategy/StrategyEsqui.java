
public class StrategyEsqui implements Strategy {

	public boolean verificaTemperatura(int temperatura) {
		
		if (temperatura < 0) return true;
		return false;
	}
	
}
