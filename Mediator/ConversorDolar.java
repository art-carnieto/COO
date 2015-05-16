public class ConversorDolar {
	public double converter(double valor, String cambio) {
		if (cambio.equals("Real"))
			return valor * 0.34;
		if (cambio.equals("Euros"))
			return valor * 1.08;
		throw new IllegalArgumentException("Sua moeda nao vale!");
	}
}
