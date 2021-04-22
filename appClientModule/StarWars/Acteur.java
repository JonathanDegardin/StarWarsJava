package StarWars;
public class Acteur {
	String Nom;
	String Prénom;
	public Acteur(String Nom,String Prénom) {
		this.Nom = Nom;
		this.Prénom = Prénom;
	}
	
	String getNom(){
		return Nom;
	}
	String getPrénom(){
		return Prénom;
	}
	public String ToString() {
		return(this.Nom + " " + this.Prénom);
	}
}
