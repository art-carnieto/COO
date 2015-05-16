
public class compradorFranca extends Pessoas {

	private double ofertaFR = 3.0; // 3 euros
	public String moeda = "Euro";
	
	public double getOfertaFR() {
		return ofertaFR;
	}

	public compradorFranca(Mediator m){
		setMediator(m);
	}
	
	public boolean proporOferta(double valor){
		return mediator.proporOferta(valor, "Euros");
	}
}
