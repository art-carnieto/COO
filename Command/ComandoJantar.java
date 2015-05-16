
public class ComandoJantar implements Command{

	Jantar jt = new Jantar();

	@Override
	public void execute(int arg) {
		// TODO Auto-generated method stub
		prepararJanta(arg);
	}
	
	void prepararJanta(int x){
		jt.setPizza(x);
	}
	
}
