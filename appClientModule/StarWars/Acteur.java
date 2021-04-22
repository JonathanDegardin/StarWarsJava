package StarWars;

import java.util.ArrayList;

public class Acteur {
	String Nom;
	String Prenom;
	ArrayList<Personnage> lesRoles = new ArrayList<Personnage>();
	public Acteur(String Nom,String Prenom) {
		this.Nom = Nom;
		this.Prenom = Prenom;
	}
	
	public String getNom(){
		return Nom;
	}
	public String getPrénom(){
		return Prenom;
	}
	public void SetNom(String nom) {
		this.Nom=nom;
	}
	public void SetPrenom(String Prenom) {
		this.Prenom=Prenom;
	}
	public void AddPersonnage(Personnage unPerso) {
		this.lesRoles.add(unPerso);
	}
	public String ToString() {
		return(this.Nom + " " + this.Prenom);
	}
	public int nbPersonnage() {
		
		int nb = 0;
		for(int i = 0 ; i< this.lesRoles.size();i++) {
			nb = nb+1;
		}
		return nb;
	}
}
