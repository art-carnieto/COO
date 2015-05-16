
public class compradorBrasil extends Pessoas {

	private double ofertaBR = 12.0; //12 reais
	public String moeda = "Real";
	
	public double getOfertaBR() {
		return ofertaBR;
	}

	public compradorBrasil(Mediator m){
		setMediator(m);
	}
	
	public boolean proporOferta(double valor){
		return mediator.proporOferta(valor, "Reais");
	}

}
