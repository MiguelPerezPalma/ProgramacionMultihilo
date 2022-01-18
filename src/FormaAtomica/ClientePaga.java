package FormaAtomica;

public class ClientePaga extends Thread{
	private int dinero;
	private Cliente c;
	
	public ClientePaga(int dinero, Cliente c) {
		super();
		this.dinero = dinero;
		this.c = c;
	}
	
	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}

	public Cliente getC() {
		return c;
	}

	public void setC(Cliente c) {
		this.c = c;
	}

	@Override
	public void run() {
		c.pagadinero(dinero);
	}
}
