package client;

import java.util.ArrayList;
import java.util.Date;

import contrats.Contrat;

public class Personne {

	
	private boolean estUnClient ; 
	private String nom;
	private String prenom;
	private Date dateDeNaissance;
	private ArrayList <Personne> membresFamilles;
	private ArrayList <Contrat> contrat;
	
	Personne (String n , String p , Date d , boolean e){
		
		
		
		this.nom = n ;
		this.prenom = p;
		this.dateDeNaissance = d;
		this.estUnClient = e ;
		
		membresFamilles = new ArrayList<Personne>();
		contrat = new ArrayList<Contrat>();
		
		
	}
	
	public boolean estClient () {
		
		
		return this.estUnClient;
		
		
	}

	
	
	public String obtenirNomComplet () {
		
		
		return this.prenom + this.nom;
		
		
	}
	
	
	public Date ObtenirDateDeNaissance () {
		
		return this.dateDeNaissance;
		
		
	}


	
	public Contrat creerContrat (Contrat c ) {
		
		this.contrat.add(c);
		
		return c ;
		
		
	}
	
	public void resilierContrat(Contrat c ) {
		
		for (Contrat cont : this.contrat) {
			
			if (c.getNumeroContrat().equals(cont.getNumeroContrat())) {
				
				contrat.remove(c);
				
			}
			
			
		}
		
		
	}
	
	public void resilierContrat(String contrat ) {
		
		
		
	}
	
	
	public ArrayList <Contrat> obtenirContrats () {
		return contrat;
		
		
	}
	
	public ArrayList <Contrat> obtenirContratsAuto () {
		ArrayList<Contrat> cAuto = new ArrayList<Contrat>();
		
		for (Contrat c : contrat) {
			if (c.getClass().equals("ContratAuto")) {
				
				
				cAuto.add(c);
				
				
			}
			
			
		}
		
		
		
		return cAuto;
		
		
	}
	
	public ArrayList <Contrat> obtenirContratsMRH () {
ArrayList<Contrat> cMHR = new ArrayList<Contrat>();
		
		for (Contrat c : contrat) {
			if (c.getClass().equals("ContratMHR")) {
				
				
				cMHR.add(c);
				
				
			}
			
			
		}
		
		
		
		return cMHR;
		
		
		
	}
	
	public String toString () {
		return nom;
		
		
	}

}


