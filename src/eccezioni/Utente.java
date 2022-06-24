package eccezioni;

public class Utente {

	// attributi
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private int eta;

	// costruttore

	public Utente(String nome, String cognome, String email, String password, int eta) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	// metodi validazione

	private boolean isValidEta(int etaInput) {
		if (etaInput > 18) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isValidPassword(int passInput) {
		if (passInput > 8 && passInput < 12) {
			return true;
		} else {
			return false;
		}
	}

}
