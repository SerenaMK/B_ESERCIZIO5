package Esercizio;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);
	int litri;

	public static void main(String[] args) {

		calcola();

	}
	
	public static void calcola() {
		try {
			System.out.println("Inserire il numero di kilometri percorsi:");
			int km = Integer.parseInt(sc.nextLine());
			
			System.out.println("Inserire il numero di litri di carburante consumati:");
			int litri = Integer.parseInt(sc.nextLine());
			
			int kmPerLitro = km/litri;
			System.out.println("Kilometri per litro: " + kmPerLitro);
		}
		catch ( NumberFormatException e ){
			System.out.println("ERRORE: il valore inserito non è un numero intero.\n");
		}
		catch ( ArithmeticException e) {
			System.out.println("ERRORE: il valore inserito non può essere 0.\n");
		}
		catch ( Exception e ) {
			System.out.println("ERRORE: c'è stato un errore.");
		}
	}

}
