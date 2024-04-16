package u4.d2;

import java.util.Scanner;

public class Main4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {
			System.out.print("Inserire un numero seguito dal tasto Invio: ");
			int test = scan.nextInt(); // Legge il prossimo intero dall'input dell'utente

			// Verifica che il numero inserito sia non negativo prima di eseguire il countdown
			if (test >= 0) {
				countdown(test);
			} else {
				System.out.println("Si prega di inserire un numero non negativo.");
			}
		} catch (Exception e) {
			System.out.println("Errore: non è stato inserito un numero valido.");
		} finally {
			scan.close(); // Assicura la chiusura dello scanner indipendentemente dal risultato
		}
	}

	public static void countdown(int num) {
		System.out.println("Conto alla rovescia da " + num + " a 0:");
		for (int i = num; i >= 0; i--) {
			System.out.println(i);
		}
	}
}

