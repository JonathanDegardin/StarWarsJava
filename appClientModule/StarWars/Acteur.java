package StarWars;
public class Acteur {
	String Nom;
	String Pr�nom;
	public Acteur(String Nom,String Pr�nom) {
		this.Nom = Nom;
		this.Pr�nom = Pr�nom;
	}
	
	String getNom(){
		return Nom;
	}
	String getPr�nom(){
		return Pr�nom;
	}
	public String ToString() {
		return(this.Nom + " " + this.Pr�nom);
	}
}
