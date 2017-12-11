package compagnie;
import java.util.ArrayList;

import client.Personne;
import contrats.Contrat;


public class CompagnieAssurance {
	
	
	private String nom ;

	private ArrayList <Personne> personnes ;
	
	public CompagnieAssurance (String n) {
		
		personnes = new ArrayList<Personne>();
		this.nom = n;
		
		
	}
	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public ArrayList<Personne> getPersonnes() {
		return personnes;
	}


	public void setPersonnes(ArrayList<Personne> personnes) {
		this.personnes = personnes;
	}

	
	
	public int obtenirNombreDeClients () {
		
		int nbClient =0;
		for (Personne p : personnes) {
			if (p.estClient()) {
				
				nbClient ++;
				
			}
			
			
		}
		
		
		
		return nbClient ;
	}

	
	public int obtenirNombreDeProspects () {
			
			
		
		int nbProspect =0;
		for (Personne p : personnes) {
			if (!p.estClient()) {
				nbProspect ++;
				
			}
			
			
		}
		
		
		
		return nbProspect ;
		}
	
	public int obtenirNombreDeContrats () {
		int nbContrat = 0;
		
		
		for (Personne p : personnes ) {
			
			if (p.estClient()){
				for (Contrat c : p.obtenirContrats()) {
					
					
					if (c.isContratValide()) {
					nbContrat = nbContrat +1;
					}
					
				}
				
				
				
				
			}
			
		}
		
		return nbContrat;
	}
}
