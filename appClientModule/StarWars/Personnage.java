package StarWars;
public class Personnage {
	String Nom;
	String Prénom;
	public Personnage(String Nom,String Prénom) {
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
