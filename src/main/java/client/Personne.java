package client;

import java.util.ArrayList;
import java.util.Date;

import contrats.Contrat;
import contrats.ContratAuto;
import contrats.ContratMRH;

public class Personne {

	
	private boolean estUnClient ; 

	private Date dateDeNaissance;
	private ArrayList <Personne> membresFamilles;
	private ArrayList <Contrat> contrat;
	
	public Personne (String n , String p , Date d , boolean e){
		
		
		
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
				
				cont.setContratValide(false);
				
			}
			
			
		}
		
		
	}
	
	public void resilierContrat(String contrat ) {
		
	for (Contrat c : this.contrat) {
			
			if (c.getNumeroContrat().equals(contrat)) {
				
				c.setContratValide(false);
				
			}
			
		
	}
		
	}
	
	
	public ArrayList <Contrat> obtenirContrats () {
		return contrat;
		
		
	}
	
	public ArrayList <Contrat> obtenirContratsAuto () {
		ArrayList<Contrat> cAuto = new ArrayList<Contrat>();
		
		for (Contrat c : contrat) {
			
			if (c instanceof ContratAuto) {
				cAuto.add(c);
				
			}	
				
			
			
		}
		
		
		
		return cAuto;
		
		
	}
	
	public ArrayList <Contrat> obtenirContratsMRH () {
		
		
		ArrayList<Contrat> cMHR = new ArrayList<Contrat>();
		
		for (Contrat c : contrat) {
			
			if (c instanceof ContratMRH) {
				cMHR.add(c);
				
			}	
				
			
				
			
			
			
		}
		
		
		
		return cMHR;
		
		
		
	}
	
	public String toString () {
		
		
		String str = prenom + "  " + nom + "\n"; 
		
		for (Contrat c : contrat ) {
			
		str = str + "contrat numero : " + c.getNumeroContrat() + "\n";	
			
			
		}
		
		
		return str;
		
		
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

	private String nom;
	private String prenom;
}


