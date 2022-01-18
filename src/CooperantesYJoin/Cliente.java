package CooperantesYJoin;

public class Cliente extends Thread{
	private int misclientes;
	private int numerodecaja;
	private int misclientesatendidos;
	private Caja c;
	
	public Cliente(int misclientes, int numerodecaja, Caja c) {
		super();
		this.misclientes = misclientes;
		this.numerodecaja = numerodecaja;
		this.c = c;
	}


	public int getMisclientes() {
		return misclientes;
	}


	public void setMisclientes(int misclientes) {
		this.misclientes = misclientes;
	}


	public int getNumerodecaja() {
		return numerodecaja;
	}


	public void setNumerodecaja(int numerodecaja) {
		this.numerodecaja = numerodecaja;
	}


	public int getMisclientesatendidos() {
		return misclientesatendidos;
	}


	public void setMisclientesatendidos(int misclientesatendidos) {
		this.misclientesatendidos = misclientesatendidos;
	}


	public Caja getC() {
		return c;
	}


	public void setC(Caja c) {
		this.c = c;
	}

	@Override
	  public void run() {
	    for (int i=0; i<misclientes; i++) {
	      this.c.incrementa();
	      misclientesatendidos++;
	      System.out.printf("Esta es la caja numero:"+numerodecaja+" con un total de clientes atendidos de "+getMisclientesatendidos()+"\n");
	    }
	    
	  }
}
