package main;
import java.util.Date;
import java.util.Scanner;

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
		

		@SuppressWarnings("deprecation")
		Date d2 = new Date (1995,12,12);
		Personne p2 = new Personne ("Dusse", "JC", d2, true);
		
		
		@SuppressWarnings("deprecation")
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
		
		
		
		Scanner sc = new Scanner (System.in);
		Personne p;
		
		System.out.println("Voulez vous creer un client (o/n)");
		if (sc.nextLine().equals("o")) {
			
			System.out.println("Prenom : ");
			String prenom = sc.nextLine();
			
			System.out.println("Nom : ");
			String nom = sc.nextLine();
			
			System.out.println("Client ou pas ? (o/n)");
			boolean client;
			if (sc.nextLine().equals("o")) {
				
				client = true;
				
			}
			else {
				
				
				client = false ;
			}
			
			p = new Personne(nom , prenom , d1 , client);
			mma.getPersonnes().add(new Personne(nom , prenom , d1 , client));
			
			System.out.println("Souscrire un contrat ? (o/n) ");
			
			
			
			if (sc.nextLine().equals("o")) {
				
				
			}
			
		}
	
		
		
		
		
	}
	
	

}
