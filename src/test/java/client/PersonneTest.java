package client;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import contrats.Contrat;
import contrats.ContratAuto;

public class PersonneTest {

	@Test
	public void testCreerContrat() {
		
		
		@SuppressWarnings("deprecation")
		Date d2 = new Date (1995,12,12);
		ContratAuto c1 = new ContratAuto("123456",true);
		Personne p1 = new Personne("Dusse", "JC", d2, true);
		p1.creerContrat(c1);
		
		assertEquals("Pas Bon", "123456", p1.obtenirContrats().get(0).getNumeroContrat());
		
	
		
	}

	/*@Test
	public void testResilierContratContrat() {
		fail("Not yet implemented");
	}

	@Test
	public void testResilierContratString() {
		fail("Not yet implemented");
	}

	@Test
	public void testObtenirContrats() {
		fail("Not yet implemented");
	}

	@Test
	public void testObtenirContratsAuto() {
		fail("Not yet implemented");
	}

	@Test
	public void testObtenirContratsMRH() {
		fail("Not yet implemented");
	}
*/
	
}
