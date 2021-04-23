// In questo Esercizio creeró una calcolatrice che misuri in automatico perimetro ed altezza di un triangolo rettangolo conoscendo i lati

package testJava1aSettimana;

import java.util.Scanner;

public class TestJava1aSettimana {
	public static void main(String[] args) {
		
//		 qui vado a richiamare il metodo scanner in modo da poterlo utilizzare in seguito per l'input dei dati
	
		Scanner s = new Scanner(System.in);
//		Chiedo all'utente di inserire i vari  dati per effettuare il calcolo 
		
		System.out.println("Inserisci la base");
		int baseInserita = s.nextInt();
		
		System.out.println("Inserisci l'altezza ");
		int altezzaInserita = s.nextInt();
		
		
//		chiedo l'ipotenusa 
		System.out.println("Inserisci l'ipotenusa ");
		int ipotenusaInserita = s.nextInt();
		
//		Qui faccio stampare a schermo 
		System.out.println("base: " + baseInserita);
		
		
		System.out.println("altezza: " + altezzaInserita);
		
		System.out.println("ipotenusa: " + ipotenusaInserita);
		
		
//		qui avviene l'operazione di calcolo del perimetro 
		
		int perimetro = baseInserita + altezzaInserita + ipotenusaInserita ;
		
		
//		Risultato finale
		System.out.println("Perimetro = " + perimetro);
		
		
		
	}
}
