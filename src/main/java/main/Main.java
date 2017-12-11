package main;
import java.util.Date;

import client.Personne;
import compagnie.CompagnieAssurance;
import contrats.ContratMRH;
import contrats.ContratPrevoyance;
public class Main {
	
	
	
	public static void main (String  [] args ) {
		
		
		@SuppressWarnings("deprecation")
		Date d1 = new Date (1995,7,5);
		Personne p1 = new Personne ("PA", "Louche", d1, false);
		ContratPrevoyance c1 = new ContratPrevoyance("Contrat1Prev", true);
		ContratMRH c2 = new ContratMRH ("Contrat1MRH", true);
		

		Date d2 = new Date (1995,12,12);
		Personne p2 = new Personne ("Dusse", "JC", d2, true);
		
		
		Date d3 = new Date (1995,6,12);
		Personne p3 = new Personne ("Boutreux", "Yael",  d3, true);
		
		CompagnieAssurance mma = new CompagnieAssurance("mma");
		p2.creerContrat(c1);
		p2.creerContrat(c2);
		mma.getPersonnes().add(p1);
		mma.getPersonnes().add(p2);
		mma.getPersonnes().add(p3);
		System.out.println(mma.obtenirNombreDeClients());
		System.out.println(mma.obtenirNombreDeProspects());
		System.out.println(p2);
		
		
		
	
		
		
		
		
	}
	
	

}
