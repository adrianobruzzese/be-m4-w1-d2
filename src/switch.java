package u4.d2;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Inserisci un numero tra 0 e 3: "); // Aggiunto prompt per l'utente
		int test = scan.nextInt();
		System.out.println(stampaNumero(test));
		scan.close();
	}

	// Metodo per convertire un numero in una stringa che rappresenta il numero in lettere
	public static String stampaNumero(int num) {
		switch (num) {
			case 0:
				return "zero";
			case 1:
				return "uno";
			case 2:
				return "due";
			case 3:
				return "tre";
			default:
				return "Numero non compreso tra 0 e 3, impossibile convertire";
		}
		// Non è necessario utilizzare una variabile risultato qui perché
		// possiamo semplicemente restituire il valore desiderato direttamente
		// all'interno di ciascun caso del costrutto switch.
	}
}
