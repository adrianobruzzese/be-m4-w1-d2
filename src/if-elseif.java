package u4.d2;

public class Main1 {

	public static void main(String[] args) {
		// Esempio di utilizzo del metodo stringaPariDispari
		System.out.println("La stringa 'Ciao' ha lunghezza pari? " + stringaPariDispari("Ciao"));
		System.out.println("La stringa 'Hello' ha lunghezza pari? " + stringaPariDispari("Hello"));

		// Esempio di utilizzo del metodo annoBisestile
		System.out.println("L'anno 2020 è bisestile? " + annoBisestile(2020));
		System.out.println("L'anno 1900 è bisestile? " + annoBisestile(1900));
	}

	// Metodo semplificato per controllare se una stringa ha lunghezza pari o dispari
	public static boolean stringaPariDispari(String str) {
		// Restituisce direttamente l'espressione booleana senza l'uso dell'operatore ternario
		return str.length() % 2 == 0;
	}

	// Metodo per determinare se un anno è bisestile secondo le regole fornite
	public static boolean annoBisestile(int anno) {
		// Controlla se l'anno è divisibile per 400 oppure divisibile per 4 ma non per 100
		return (anno % 400 == 0) || (anno % 4 == 0 && anno % 100 != 0);
	}

}

