package logica.prioridadedeoperadores;

public class Main {

	public static void main(String[] args) {
		
		boolean v = true;
		
		boolean x = 5 * 5 + Math.sqrt(7 * 7 ) <= 100 || !v && v;
		System.out.println(x);
		
		

	}

}
