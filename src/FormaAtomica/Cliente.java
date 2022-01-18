package FormaAtomica;

public class Cliente {
	private int monedero;

	public Cliente(int monedero) {
		super();
		this.monedero = monedero;
	}

	public int getMonedero() {
		return monedero;
	}

	public void setMonedero(int monedero) {
		this.monedero = monedero;
	}

	
	public synchronized void pagadinero(int dinero) {
		if(monedero>=dinero) {
			monedero-=dinero;
			System.out.println("Tu vuelta es: "+monedero);
		}else {
			System.out.println("Dinero insuficiente");
		}
	}
	@Override
	public String toString() {
		return "Cliente [monedero=" + monedero + "]";
	}
	
}
