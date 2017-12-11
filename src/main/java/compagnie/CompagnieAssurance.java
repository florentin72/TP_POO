package compagnie;
import java.util.ArrayList;

import client.Personne;


public class CompagnieAssurance {
	
	
	private String nom ;
	private ArrayList <Personne> personnes ;
	
	public CompagnieAssurance (String n) {
		
		personnes = new ArrayList<Personne>();
		this.nom = n;
		
		
	}
	
	
	public int obtenirNombreDeClients () {
		
		
		return 0;
	}

	
	public int obtenirNombreDeProspects () {
			
			
			return 0;
		}
	
	public int obtenirNombreDeContrats () {
		
		
		return 0;
	}
}
