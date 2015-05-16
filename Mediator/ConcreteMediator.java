public class ConcreteMediator implements Mediator{
	ConversorDolar c = new ConversorDolar();

	
	vendedorEUA Arthur = new vendedorEUA(this);
	
	@Override
	public boolean proporOferta(double ofertada, String unidMonet) {
		double convertido = c.converter(ofertada, unidMonet);
		if (convertido>=Arthur.getVenda()) return true;
		return false;
	}

}
