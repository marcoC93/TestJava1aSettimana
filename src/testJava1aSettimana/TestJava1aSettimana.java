// In questo Esercizio creeró una calcolatrice che misuri in automatico perimetro ed altezza di un triangolo

package testJava1aSettimana;

import java.util.Scanner;

public class TestJava1aSettimana {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Inserisci la base");
		int baseInserita = s.nextInt();
		
		System.out.println("Inserisci l'altezza ");
		int altezzaInserita = s.nextInt();
		
		
		System.out.println("base: " + baseInserita);
		
		System.out.println("altezza: " + altezzaInserita);
		
	}
}
