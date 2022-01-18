package FormaAtomica;

import java.util.Scanner;

public class Ejecutable {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Cuanto dinero tiene el cliente en la cartera?");
		int midinero=sc.nextInt();
		Cliente c=new Cliente(midinero);
		System.out.println("Cuanto te ha costado la compra?");
		int pagar=sc.nextInt();
		ClientePaga cp=new ClientePaga(pagar, c);
		
		cp.start();
	}
}
