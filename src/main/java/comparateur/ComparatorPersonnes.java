package comparateur;

import java.util.Comparator;

import client.Personne;

public class ComparatorPersonnes implements Comparator <Personne> {
	
	
	public int compare (Personne p1, Personne p2 ){
		
		
		
		return p2.obtenirContrats().size() - p1.obtenirContrats().size();
		
		
		
	}

}
