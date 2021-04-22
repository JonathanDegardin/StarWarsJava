package StarWars;

public class Gentil extends Personnage{
	boolean Force;
	public Gentil(String Nom, String Prenom, boolean Cote) {
		super(Nom, Prenom);
		this.Force = Cote;
	}

}
