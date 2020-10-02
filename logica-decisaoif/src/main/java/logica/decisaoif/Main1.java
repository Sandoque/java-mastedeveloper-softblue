package logica.decisaoif;


import br.com.softblue.commons.io.Console;

public class Main1 {

	public static void main(String[] args) {
		
		System.out.println("Digite valor:");
		int valor = Console.readInt();
		int n50=0, n10=0, n5=0, n1=0;
		
		
		if (valor > 0 && valor <= 1000) {
	 		while (valor > 0) {
				
				if (valor >= 50) {
					valor -=50;
					n50++;
					
				}
				
				else if (valor >= 10) {
					valor -=10;
					n10++;
					
				}
				
	
				else if (valor >= 5) {
					valor -=5;
					n5++;
					
				}
	
				else if (valor < 5) {
					valor -=1;
					n1++;
					
				}
				
				
			}
		
	 		System.out.println("Aí está: ");
			if (n50 > 0) {
				if (n50 == 1) {
					System.out.println(n50 + " nota de 50 Bit");
				} else {
					System.out.println(n50 + " notas de 50 Bits");
				}
			}
			
			if (n10 > 0) {
				if (n10 == 1) {
					System.out.println(n10 + " nota de 10 Bit");
				} else {
					System.out.println(n10 + " notas de 10 Bits");
				}
			}
			
			if (n5 > 0) {
				if (n5 == 1) {
					System.out.println(n5 + " nota de 5 Bit");
				} else {
					System.out.println(n5 + " notas de 5 Bits");
				}
			}
				
			if (n1 > 0) {
				if (n1 == 1) {
					System.out.println(n1 + " nota de 1 Bit");
				} else {
					System.out.println(n1 + " notas de 1 Bits");
				}
			}
			
		
		}
		
	
	}
	

}
