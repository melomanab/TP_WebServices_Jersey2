package gtm.projet.loginWebappJersey2.domaine;

public class User {

	// Declaration des attributs caracterisant un objet de type Client
	private int idClient;
	private String nom;
	private String prenom;
	private String adresse;
	private String codePostal;
	private String ville;
	private String email;
	private String telephone;
	private String situationProfessionnel;
	private String situationFinanciere;
	private double soldeTotal;
	private int idConseiller;

	// Constructeur par defaut et parametre

	public User() {
		super();
		this.nom = "Entrez votre nom";
		this.prenom = "Entrez votre prenom";
		this.adresse = "Entrez votre adresse";
		this.codePostal = "Entrez votre Code Postal";
		this.ville = "Entrez votre ville";
		this.email = "Entrez votre email";
		this.telephone = "Entrez votre téléphone";
	}
	
	

	public User(int idClient, String nom, String prenom, int idConseiller) {
		super();
		this.idClient = idClient;
		this.nom = nom;
		this.prenom = prenom;
		this.idConseiller = idConseiller;
	}


	

	public User(String nom, String prenom, int idConseiller) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.idConseiller = idConseiller;
	}



	// Getters et Setters
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdConseiller() {
		return idConseiller;
	}

	public void setIdConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}

	public double getSoldeTotal() {
		return soldeTotal;
	}

	public void setSoldeTotal(double soldeTotal) {
		this.soldeTotal = soldeTotal;
	}

	public void setIdClient(int idClient) {
		this.idClient = idClient;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getSituationFinanciere() {
		return situationFinanciere;
	}

	public void setSituationFinanciere(String situationFinanciere) {
		this.situationFinanciere = situationFinanciere;
	}

	public String getSituationProfessionnel() {
		return situationProfessionnel;
	}

	public void setSituationProfessionnel(String situationProfessionnel) {
		this.situationProfessionnel = situationProfessionnel;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public int getidConseiller() {
		return idConseiller;
	}

	public void setidConseiller(int idConseiller) {
		this.idConseiller = idConseiller;
	}

	public int getIdClient() {
		return idClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	/* Redéfinition de la méthode toString()
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return  "Client num: " + this.getIdClient() 
				+ "\nNom: " + this.getNom() + "\tPrenom: " + this.getPrenom()
				+ "\nAdresse: " + this.getAdresse() 
				+ "\tCode postal: " + this.getCodePostal() 
				+ "\nMail: " + this.getEmail() 
				+ "\nConseiller num: " + this.getIdConseiller() +"\n";
	}
}
