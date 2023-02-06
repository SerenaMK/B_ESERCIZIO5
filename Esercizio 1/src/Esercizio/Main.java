package Esercizio;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	static int[] array = new int[5];
	static boolean repeat = true;

	public static void main(String[] args) {
		
		randomize();
		
		getArray();
		
		setNumber();

	}
	
	public static void randomize() {
		Random r = new Random();  // crea un numero casuale.
		
		for (int i = 0; i < array.length; i++) {
			array[i] = r.nextInt(11);
		}
		
		// APPUNTI:
		// System.out.println(r.nextInt(11));
		// ^ se non uso nextInt, mi stampa il puntatore invece che il numero.
		// se specifico 11, creerà un numero casuale tra 1 e 10.
	}
	
	public static void getArray() {
		System.out.println("\n-------------------");
		System.out.println("L'array di cinque numeri attuale è:");
		System.out.println(java.util.Arrays.toString(array));
		System.out.println("\n(Per uscire dal programma, inserire il numero 0)");
		System.out.println("-------------------\n");
	}
	
	public static void setNumber() {
		Scanner sc = new Scanner(System.in);
		
		while (repeat) {
			
			try {
				System.out.println("Specificare un numero da inserire nell'array:");
				int n = Integer.parseInt(sc.nextLine());
				
				// int n = sc.nextInt(); <--- usando solo nextInt mi continua a ripetere la frase di errore all'infinito.
				// quindi userò invece Integer.parseInt(sc.nextLine()), che non mi crea lo stesso problema.
				// inoltre, con nextInt() il nome dell'exception era InputMismatchException invece che NumberFormatException
				
				System.out.println("Specificare la posizione in cui inserire il numero (da 1 a 5):");
				int p = Integer.parseInt(sc.nextLine());
				
				if(n == 0 || p == 0) {
					repeat = false;
					sc.close();
					System.out.println("Chiusura programma in corso...");
					System.out.println("Il programma è stato chiuso.");
				} else {
					int pos = p - 1;
					array[pos] = n;
					getArray();
				}
			}
			catch (NumberFormatException e) {
				System.out.println("ERRORE: il valore inserito non è un numero intero.\n");
			}
			catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ERRORE: la posizione indicata deve essere un numero tra 1 e 5.\n");
			}
			
		}
		
	}

}
