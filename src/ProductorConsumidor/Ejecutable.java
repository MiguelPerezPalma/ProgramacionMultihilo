package ProductorConsumidor;

import java.util.Scanner;

public class Ejecutable {
	public static void main(String[] args) {
		Caja cola = new Caja();
		int productos;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la cantidad de productos a comprar");
		productos=sc.nextInt();
		Vendedor p = new Vendedor(cola,productos); 
		Cliente c = new Cliente (cola,productos); 
		p.start();
		c.start();
	}
}
