package CooperantesYJoin;

import java.util.Scanner;
public class Ejecutable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el numero de cajeros del supermercado");
		int ncajas=sc.nextInt();
		Caja c=new Caja();
		Thread[] cajeros=new Thread[ncajas];
		
		for(int i=0;i<ncajas;i++) {
			System.out.println("Introduce el numero de Clientes del supermercado");
			int clientes=sc.nextInt();
			Thread t=new Thread(new Cliente(clientes, i, c));
			t.start();
			cajeros[i]=t;
		}
		for(Thread t: cajeros) {
			try {
				t.join();
			} catch (Exception e) {
				
			}
		}
		System.out.println("Clientes totales atendidos "+c.getClientesatendidos());
	}
}
