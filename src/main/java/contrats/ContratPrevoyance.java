package contrats;

import java.util.ArrayList;
import java.util.List;

public class ContratPrevoyance extends Contrat {
	
	
	public ContratPrevoyance(String n, boolean c) {
		super(n, c);

	}


	public Contrat creationContrat () {
		return null;
		
		
	}
		
	
	public List<String> determinerGaranties(){


		
		List <String> garanties  = new ArrayList <String> ();
		
		garanties.add("Accidents de la vie");
		garanties.add("Maladie");
		garanties.add("Mutuelle");
		
		return garanties;
		
		
		
	}
		

	
	public double determinerCotisation() {
		return 75.0;
		
	}

}
