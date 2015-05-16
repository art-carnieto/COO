
public class Sistema {
	static ConcreteMediator Google = new ConcreteMediator();
	
	static compradorBrasil Victor = new compradorBrasil(Google) ;
	static compradorFranca Miguel = new compradorFranca(Google);
	static vendedorEUA Arthur = new vendedorEUA(Google);
	
	public static void main(String[] args) {
		//funcoes para teste do programa
		
		if (Miguel.proporOferta(Miguel.getOfertaFR())) System.out.println("Vendido para o Miguel!");
		if (Arthur.proporOferta(Arthur.getOfertaBR())) System.out.println("Vendido para o Arthur!");
		
		/*while(oferta < 10){
			
		}*/
	}
}
