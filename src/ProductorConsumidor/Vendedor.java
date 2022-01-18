package ProductorConsumidor;


public class Vendedor extends Thread{
	private Caja c;
	private int productos;
	
	public Vendedor(Caja c, int productos) {
		super();
		this.c = c;
		this.productos = productos;
	}

	public Caja getC() {
		return c;
	}

	public void setC(Caja c) {
		this.c = c;
	}

	public int getProductos() {
		return productos;
	}

	public void setProductos(int productos) {
		this.productos = productos;
	}

	public void run() {
		
		for(int i=1;i<=productos;i++) {
			c.entregar(i);
			System.out.println("Vendedor entrega producto "+i);
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
		}
	}
}
