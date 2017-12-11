package compagnie;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import client.Personne;
import contrats.ContratMRH;
import contrats.ContratPrevoyance;

public class CompagnieAssuranceTest {

	

	@Test
	public void testObtenirNombreDeClients() {
		@SuppressWarnings("deprecation")
		Date d1 = new Date (1995,7,5);
		Personne p1 = new Personne ("PA", "Louche", d1, false);
		ContratPrevoyance c1 = new ContratPrevoyance("Contrat1Prev", true);
		ContratMRH c2 = new ContratMRH ("Contrat1MRH", true);
		

		@SuppressWarnings("deprecation")
		Date d2 = new Date (1995,12,12);
		Personne p2 = new Personne ("Dusse", "JC", d2, true);
		
		
		@SuppressWarnings("deprecation")
		Date d3 = new Date (1995,6,12);
		Personne p3 = new Personne ("Boutreux", "Yael",  d3, true);
		
		CompagnieAssurance mma = new CompagnieAssurance("mma");
		p2.creerContrat(c1);
		p2.creerContrat(c2);
		mma.getPersonnes().add(p1);
		mma.getPersonnes().add(p2);
		mma.getPersonnes().add(p3);
	
		assertEquals("Pas bon", 2,mma.obtenirNombreDeClients());
		
	}
	@Test
	public void testObtenirNombreDeProspects() {
		@SuppressWarnings("deprecation")
		Date d1 = new Date (1995,7,5);
		Personne p1 = new Personne ("PA", "Louche", d1, false);
		ContratPrevoyance c1 = new ContratPrevoyance("Contrat1Prev", true);
		ContratMRH c2 = new ContratMRH ("Contrat1MRH", true);
		

		@SuppressWarnings("deprecation")
		Date d2 = new Date (1995,12,12);
		Personne p2 = new Personne ("Dusse", "JC", d2, true);
		
		
		@SuppressWarnings("deprecation")
		Date d3 = new Date (1995,6,12);
		Personne p3 = new Personne ("Boutreux", "Yael",  d3, true);
		
		CompagnieAssurance mma = new CompagnieAssurance("mma");
		p2.creerContrat(c1);
		p2.creerContrat(c2);
		mma.getPersonnes().add(p1);
		mma.getPersonnes().add(p2);
		mma.getPersonnes().add(p3);
	
		assertEquals("Pas bon", 1,mma.obtenirNombreDeProspects());
	}

	@Test
	public void testObtenirNombreDeContrats() {
		
		
		@SuppressWarnings("deprecation")
		Date d1 = new Date (1995,7,5);
		Personne p1 = new Personne ("PA", "Louche", d1, false);
		ContratPrevoyance c1 = new ContratPrevoyance("Contrat1Prev", true);
		ContratMRH c2 = new ContratMRH ("Contrat1MRH", true);
		

		@SuppressWarnings("deprecation")
		Date d2 = new Date (1995,12,12);
		Personne p2 = new Personne ("Dusse", "JC", d2, true);
		
		
		@SuppressWarnings("deprecation")
		Date d3 = new Date (1995,6,12);
		Personne p3 = new Personne ("Boutreux", "Yael",  d3, true);
		
		CompagnieAssurance mma = new CompagnieAssurance("mma");
		p2.creerContrat(c1);
		p2.creerContrat(c2);
		mma.getPersonnes().add(p1);
		mma.getPersonnes().add(p2);
		mma.getPersonnes().add(p3);
	
		assertEquals("Pas bon", 2,mma.obtenirNombreDeContrats());
		
	}

	@Test
	public void testObtenirPlusGrosClient() {
		@SuppressWarnings("deprecation")
		Date d1 = new Date (1995,7,5);
		Personne p1 = new Personne ("PA", "Louche", d1, false);
		ContratPrevoyance c1 = new ContratPrevoyance("Contrat1Prev", true);
		ContratMRH c2 = new ContratMRH ("Contrat1MRH", true);
		

		@SuppressWarnings("deprecation")
		Date d2 = new Date (1995,12,12);
		Personne p2 = new Personne ("Dusse", "JC", d2, true);
		
		
		@SuppressWarnings("deprecation")
		Date d3 = new Date (1995,6,12);
		Personne p3 = new Personne ("Boutreux", "Yael",  d3, true);
		
		CompagnieAssurance mma = new CompagnieAssurance("mma");
		p2.creerContrat(c1);
		p2.creerContrat(c2);
		mma.getPersonnes().add(p1);
		mma.getPersonnes().add(p2);
		mma.getPersonnes().add(p3);
	
		assertEquals("Pas bon", p2,mma.obtenirPlusGrosClient());
		
	}

}
