package StarWars;
public class Acteur {
	String Nom;
	String Prenom;
	public Acteur(String Nom,String Prenom) {
		this.Nom = Nom;
		this.Prenom = Prenom;
	}
	
	String getNom(){
		return Nom;
	}
	String getPr�nom(){
		return Prenom;
	}
	public String ToString() {
		return(this.Nom + " " + this.Prenom);
	}
}
