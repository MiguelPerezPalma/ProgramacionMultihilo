package ProductorConsumidor;

public class Caja {
	private int numero;
	private boolean entregado=false;
	
	public synchronized int recoger() {
		while(!entregado) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		entregado=false;
			notifyAll();
		return numero;
	}
	
	public synchronized void entregar(int n) {
		while(entregado) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		numero = n;
		entregado = true;
		notifyAll();
	}
}