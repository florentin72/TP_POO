package contrats;

import java.util.List;

public abstract class Contrat {
	

	protected String numeroContrat;
	protected boolean contratValide;
	
	public String getNumeroContrat() {
		return numeroContrat;
	}


	public void setNumeroContrat(String numeroContrat) {
		this.numeroContrat = numeroContrat;
	}


	public boolean isContratValide() {
		return contratValide;
	}


	public void setContratValide(boolean contratValide) {
		this.contratValide = contratValide;
	}



	
	public Contrat creationContrat () {
		return null;
		
		
		
	}
		
	
	public List<String> determinerGaranties(){
		return null;
		
		
		
	}
		

	
	public double determinerCotisation() {
		return 12;
		
	}
}
