package ProductorConsumidor;

public class Cliente extends Thread{
	private Caja c;
	private int productos;
	
	public Cliente(Caja c, int productos) {
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
		int valor=0;
		for(int i=1;i<=productos;i++) {
			valor=c.recoger();
			System.out.println("Cliente recoge producto "+valor);
		}try{
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			
		}
	}
}
