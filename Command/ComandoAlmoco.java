
public class ComandoAlmoco implements Command{

	Almoco amc = new Almoco();

	@Override
	public void execute(int arg) {
		// TODO Auto-generated method stub
		prepararAlmoco(arg);
	}
	
	void prepararAlmoco(int x){
		amc.setFeijoada(x);
	}

}
