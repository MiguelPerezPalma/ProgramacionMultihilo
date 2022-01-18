package CooperantesYJoin;

public class Caja {
	private int clientesatendidos;

	public Caja(int clientesatendidos) {
		super();
		this.clientesatendidos = clientesatendidos;
	}

	public Caja() {
		super();
	}

	public int getClientesatendidos() {
		return clientesatendidos;
	}

	public void setClientesatendidos(int clientesatendidos) {
		this.clientesatendidos = clientesatendidos;
	}
	
	public int incrementa() {
		clientesatendidos++;
		return clientesatendidos;
	}
}
