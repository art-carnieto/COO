
public class Contexto {

	private int temperatura;
	private Strategy estrategia;
	
	public Strategy getEstrategia() {
		return estrategia;
	}
	
	public void setEstrategia(Strategy estrategia) {
		this.estrategia = estrategia;
	}
	
	public int getTemperatura() {
		return temperatura;
	}
	
	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	boolean getResultado() {
		return estrategia.verificaTemperatura(temperatura);
	}
	
}
