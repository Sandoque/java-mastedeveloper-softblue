package logica.repeticao;

import br.com.softblue.commons.io.*;

public class Main2 {

	public static void main(String[] args) {
		
		double nota = 0;
		int cont = 1;
		double soma = 0;
		
		while (true) {
			System.out.println("Digite a nota " + cont + ":");
			nota = Console.readDouble();
			
			if (nota == -1) {
				cont--;
				break;
			}
			
			cont++;
			soma += nota;
			System.out.println("(soma = " + soma + ")");
		}
		
		System.out.println("soma = " + soma);
		System.out.println("cont = " + cont);
		
		double media = soma / cont;
		System.out.println("Média = " + media);
		

	}

}
