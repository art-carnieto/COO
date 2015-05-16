
public class Sistema {
	static ConcreteMediator c = new ConcreteMediator();
	
	static compradorBrasil A = new compradorBrasil(c) ;
	static compradorFranca B = new compradorFranca(c);
	static vendedorEUA V = new vendedorEUA(c);
	
	public static void main(String[] args) {
		//funcoes para teste do programa
		
		if (A.proporOferta(A.getOfertaBR())) System.out.println("Vendido para o A!");
		if (B.proporOferta(B.getOfertaFR())) System.out.println("Vendido para o B!");
		
		/*while(oferta < 10){
			
		}*/
	}
}
