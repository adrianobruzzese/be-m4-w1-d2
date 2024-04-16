package u4.d2;

import java.util.Scanner;

public class Main3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) { // Utilizzo di un ciclo infinito con una condizione di break chiara
			System.out.println("Inserire una stringa seguita dal tasto Invio (o 'q' per uscire):");
			String input = scanner.nextLine();

			// Controlla se l'input è "q", in tal caso esce dal ciclo
			if ("q".equals(input)) {
				break;
			}

			// Suddivide la stringa in caratteri e li unisce con la virgola
			String[] caratteri = input.split("");
			System.out.println(String.join(",", caratteri));
		}

		scanner.close();
		System.out.println("Uscita dal programma."); // Messaggio finale più chiaro
	}
}

