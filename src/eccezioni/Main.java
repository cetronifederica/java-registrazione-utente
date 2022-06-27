package eccezioni;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// FATTO IN CORREZIONE

		Scanner scan = new Scanner(System.in);
		try {
			System.out.println("Benvenuto alla registrazione utente");

			System.out.println("Inserisci nome: ");
			String nomeUtente = scan.nextLine();

			System.out.println("Inserisci cognome: ");
			String cognomeUtente = scan.nextLine();

			System.out.println("Inserisci email: ");
			String emailUtente = scan.nextLine();

			System.out.println("Inserisci password: ");
			String passwordUtente = scan.nextLine();

			System.out.println("Inserisci età: ");
			int etaUtente = Integer.parseInt(scan.nextLine());

			// provo

			Utente nuovoUtente = new Utente(nomeUtente, cognomeUtente, emailUtente, passwordUtente, etaUtente);

			System.out.println("Grazie di esserti registrato " + nuovoUtente.getNome());
		} catch (NumberFormatException e) {
			System.out.println("numero non valido");

		} catch (IllegalArgumentException e) {
			// li ha presi dalla classe utente perchè avevamo detto che poteva
			// tirare quella eccezione
			System.out.println("Parametro non valido: " + e.getMessage());

		} catch (NullPointerException e) {
			// li ha presi dalla classe utente perchè avevamo detto che poteva
			// tirare quella eccezione
			System.out.println("Parametro nullo: " + e.getMessage());

		} catch (Exception genericExc) {
			System.out.println("Errore imprevisto");
		}
		scan.close();
	}
}
