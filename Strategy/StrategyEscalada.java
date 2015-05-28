
public class StrategyEscalada implements Strategy {

	public boolean verificaTemperatura(int temperatura) {
		
		if (temperatura >= 18 && temperatura <= 26) return true;
		return false;
	
	}
	
}
