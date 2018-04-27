package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import gtm.projet.loginWebappJersey2.dao.UserDao;
import gtm.projet.loginWebappJersey2.domaine.User;

public class TestUserDao {

	// Declaration de la classe à tester comme proprieté de la classe de test
	private UserDao userDao;
	User nouveauClient;
	User clientEnBase;


	/**
	 * Constructeur
	 */
	public TestUserDao() {
		super();
		this.userDao = new UserDao();
		this.nouveauClient = new User();
		this.clientEnBase = new User();
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {				
		nouveauClient = new User ("Grillo" , "Pepito", 2);
		clientEnBase = new User (3, "Agostini" , "Jean", 2);
	}

	@After
	public void tearDown() throws Exception {
	}

//	@Test
//	public void testAssertEquals() {
//		System.out.println("@Test test1()");
//		assertEquals("failure - strings are not equal", "Hello", "Hello");
//			
//	}

	/**
	 * Tester que la methode create() renvoi true lorsque l'insertion est realisé
	 */
	@Test
	public void testEnregistrementClient() {
		// fail("Enregistrement non realisé pour un nouveau client");
		boolean res = this.userDao.create(nouveauClient);
		System.out.println(res);
		
		assertEquals(true, res);
		
	}
	
	/**
	 * Tester que l'insertion se fait pas lorsque l'id client existe déjà
	
	@Test
	public void testEnregistrementClientExistant() {
		fail("Enregistrement realisé alors que l'id client déjà existant");
		boolean res = this.userDao.create(clientEnBase);
		assertEquals(false, res);

	}
	 */
}
