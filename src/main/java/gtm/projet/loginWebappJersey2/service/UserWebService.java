package gtm.projet.loginWebappJersey2.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import gtm.projet.loginWebappJersey2.dao.UserDao;
import gtm.projet.loginWebappJersey2.domaine.User;

@Path("userWS")
public class UserWebService {
	
	private UserDao userDao = new UserDao();

	//========= Test bonne parametrisation de la servlet Jersey 
	@GET
	@Path("/getit")
	@Produces(MediaType.TEXT_PLAIN)
	public String getIt() {
		return "Got it!";
	}
	
	//========= Test GET qui renvoi une reponse contenant un object
	@GET
	@Path("/get")	
	// -- Format de reponse: JSON
	// @Produces(MediaType.APPLICATION_JSON)
	// -- Format de reponse: Page web
	@Produces(MediaType.TEXT_PLAIN)
	public Response getClientInJSON(User client) {

		// TO-DO replace par appel DAO
		client = new User();
		client.setIdClient(1);
		client.setidConseiller(3);
		client.setNom("Moreno");
		client.setPrenom("Beatriz");
		client.setAdresse("1 rue Challemel Lacour");
		client.setCodePostal("69007");
		client.setEmail("moreno.ortega.beatriz@gmail.com");


		// Reponse WS
		// TODO appel create DAO !!!!!!!!!!!!!!!!!!
		String result = "Insert OK for:\n" + client;
		
		// Envoi reponse au client
		return Response.status(201).entity(result).build();

	}
	
	//========= Test GET qui renvoi une reponse contenant un object d'une BDD
	@GET
	@Path("/getFromBdd")	
	// -- Format de reponse: JSON
	// @Produces(MediaType.APPLICATION_JSON)
	// -- Format de reponse: Page web
	@Produces(MediaType.TEXT_PLAIN)
	public Response getClientFromBdd() {

		// TO-DO appel DAO
		User client = new User();
		client.setIdClient(1);
		client.setidConseiller(3);
		client.setNom("Moreno");
		client.setPrenom("Beatriz");
		client.setAdresse("1 rue Challemel Lacour");
		client.setCodePostal("69007");
		client.setEmail("moreno.ortega.beatriz@gmail.com");


		// Reponse WS
		// TODO appel create DAO !!!!!!!!!!!!!!!!!!
		String result = "Insert OK for:\n" + client;
		
		// Envoi reponse au client
		return Response.status(201).entity(result).build();

	}
	

	// Consumes: transforme FluxJSON --> Object Java
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createClientFromJSON(User client) {

		// TODO appel create DAO !!!!!!!!!!!!!!!!!!
		String result = "Insert OK for  : " + client;

		// Reponse WS
		return Response.status(201).entity(result).build();

	}

}
