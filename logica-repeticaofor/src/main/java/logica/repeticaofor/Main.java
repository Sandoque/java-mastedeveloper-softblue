package logica.repeticaofor;

import br.com.softblue.commons.io.Console;

public class Main {

	public static void main(String[] args) {
		int x;
		for (x = 0; x <= 10; x++) {
			System.out.println(x);
		}
		System.out.println(x);
		
		System.out.println("Digite um n�mero:");
		int n = Console.readInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " X " + i + " = " + (n * i));
		}
		
		

	}

}
