package contrats;

import java.util.ArrayList;
import java.util.List;

public class ContratMRH extends Contrat {

	public Contrat creationContrat () {
		return null;
		
		
		
	}
		
	
	public List<String> determinerGaranties(){
List <String> garanties  = new ArrayList <String> ();
		
		garanties.add("Incendies");
		garanties.add("Vitres");
		garanties.add("Inondattion");
		garanties.add("Responsabilite Civile");
		
		return garanties;
			
		
		
	}
		

	
	public double determinerCotisation() {
		return 100.0;
		
	}
}
