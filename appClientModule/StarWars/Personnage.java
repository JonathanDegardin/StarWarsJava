package StarWars;
public class Personnage {
	String Nom;
	String Pr�nom;
	public Personnage(String Nom,String Pr�nom) {
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
