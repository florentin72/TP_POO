package contrats;

import java.util.ArrayList;
import java.util.List;

public class ContratAuto extends Contrat {
	
	
	
	public ContratAuto () {
		
		
		
		
		
		
	}
	
	
	public Contrat creationContrat () {
		return null;
		
		
		
	}
		
	
	public List<String> determinerGaranties(){
		
		
		
		List <String> garanties  = new ArrayList <String> ();
		
		garanties.add("Accidents");
		garanties.add("Bris de glace");
		garanties.add("Responsabilite Civile");
		
		return garanties;
		
		
		
		
	}
		

	
	public double determinerCotisation() {
		return 150.0;
		
	}
	

}
