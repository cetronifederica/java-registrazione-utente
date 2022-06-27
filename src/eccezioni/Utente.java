package eccezioni;

public class Utente {

	// attributi
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private int eta;

	// costruttore

	public Utente(String nome, String cognome, String email, String password, int eta)
			throws IllegalArgumentException, NullPointerException {
		// metodo di controllo dell'email
		validaEmail(email);

		// valido password FATTO IN CORREZIONE
		isValidPassword(password);

		// valida età FATTO IN CORREZIONE
		isValidEta(eta);

		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.eta = eta;

	}

	// metodi getter and setter
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() throws IllegalArgumentException, NullPointerException {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() throws IllegalArgumentException, NullPointerException {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEta() throws IllegalArgumentException, NullPointerException {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	// metodi validazione FATTO IN CORREZIONE
	private void validaEmail(String emailInput) {
		if (emailInput == null) {
			throw new NullPointerException("Email non può essere null");

		}

		int counterChar = 0;
		for (int i = 0; i < emailInput.length(); i++) {
			char current = emailInput.charAt(i);
			if (current == '@') {
				counterChar++;
			}
		}
		if (counterChar != 1 || !emailInput.contains(".")) {
			// interrompi e solleva eccezione
			throw new IllegalArgumentException("email non valida");
		}
	}

	private void isValidEta(int etaInput) {
		if (etaInput < 18) {
			throw new IllegalArgumentException("età nn valida");

		}
	}

	private void isValidPassword(String passwordInput) {
		if (passwordInput == null) {
			throw new NullPointerException("password non può essere null");
		}
		if (passwordInput.length() < 8 && passwordInput.length() > 12) {
			throw new IllegalArgumentException("password non valida");

		}
	}

}
