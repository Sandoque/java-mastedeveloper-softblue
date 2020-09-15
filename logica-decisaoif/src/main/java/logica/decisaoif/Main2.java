package logica.decisaoif;

import br.com.softblue.commons.io.Console;

public class Main2 {

	public static void main(String[] args) {
		
		System.out.println("Digite a idade:");
		int idade = Console.readInt();
		
		if (idade <= 12) {
			System.out.println("Você é criança");
			
		} else {
			System.out.println("Você é adulto");
		}
		
		System.out.println("Fim do programa");
		

	}

}
