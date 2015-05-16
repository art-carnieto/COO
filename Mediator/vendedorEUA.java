
public class vendedorEUA extends Pessoas {
	private double venda = 10.0; //10 dolares
	//public String moeda = "Dolar";
	
	public double getVenda() {
		return venda;
	}
	
	public vendedorEUA(Mediator m){
		setMediator(m);
	}
	
	public boolean aceitarOferta(double limite){
		if (limite >= getVenda()) return true;
		return false;
	}
}
