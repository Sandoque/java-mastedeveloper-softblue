package logica.operadores.relacionaiselogicos;

import br.com.softblue.commons.io.*;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println("N�mero 1");
		int n1 = Console.readInt();
		
		System.out.println("N�mero 2");
		int n2 = Console.readInt();
				
		boolean igual = n1 == n2;
		System.out.println("Iguais? " + igual);
		
		boolean diferente = n1 != n2;
		System.out.println("Diferentes? " + diferente);
		
		boolean primeiroMaiorQueSegundo = n1 > n2;
		System.out.println("Primeiro maior que segundo?" + primeiroMaiorQueSegundo);
		
		boolean primeiroMaiorIgualQueSegundo = n1 >= n2;
		System.out.println("Primeiro maior ou igual que segundo?" + primeiroMaiorIgualQueSegundo);
		
		

	}

}
