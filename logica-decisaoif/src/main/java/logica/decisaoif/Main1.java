package logica.decisaoif;

import br.com.softblue.commons.io.Console;

public class Main1 {

	public static void main(String[] args) {
		
		System.out.println("Digite a idade:");
		int idade = Console.readInt();
		
		if (idade >= 0 && idade <= 12) {
			System.out.println("Voc� � crian�a");
			
		} else if (idade > 12 && idade <= 17) {
			System.out.println("Voc� � adolescente");
			
		} else if (idade > 17 && idade <= 59) {
			System.out.println("Voc� � adulto");
			
		} else if (idade > 59) {
			System.out.println("Voc� � idoso");
			
		} else {
			System.out.println("Voc� digitou idade inv�lida");
		}
		
		System.out.println("Fim do programa");
		

	}

}
