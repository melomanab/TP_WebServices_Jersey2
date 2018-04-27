package gtm.projet.loginWebappJersey2.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import gtm.projet.loginWebappJersey2.domaine.User;

public class UserDao {
	
	ConnexionMySql con;
	Connection maConexion;
	
	public UserDao() {
		super();
		this.con = new ConnexionMySql();
		this.maConexion =con.getConnexionMySQL("proxibanque");
	}
	
	
	public boolean create(User client) {
		
		// Déclaration reponse en sortie de la méthode
		boolean reponse = false; 
		PreparedStatement  stmt ;
		
		try {			
			// Requete SQL
			String sql = "INSERT INTO `client`(`adresse`, `nom`, `prenom`, `codePostal`,"
					+ " `ville`, `email`, `idConseiller`, `telephone`, `soldeTotal`) "
					+ "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
			
			// Statement
			stmt = maConexion.prepareStatement(sql);
			stmt.setString(1, client.getAdresse());
			stmt.setString(2, client.getNom());
			stmt.setString(3, client.getPrenom());
			stmt.setString(4, client.getCodePostal());
			stmt.setString(5, client.getVille());
			stmt.setString(6, client.getEmail());
			stmt.setInt(7, client.getIdConseiller());
			stmt.setString(8, client.getTelephone());
			stmt.setDouble(9, client.getSoldeTotal());
		
			
			// Exécution de la requête qui renvoi le nombre de lignes modifiés
			int result = stmt.executeUpdate(sql); 
			
			// Exploitation resultat
			if (result > 0) { 
				reponse = true;
			} 
			return reponse; // retour de la réponse
			
		} catch (SQLException e) {
			System.out.println("Problème de connexion lors de la création du client !");
			e.printStackTrace();
			return reponse;
		}
		
	}


}
