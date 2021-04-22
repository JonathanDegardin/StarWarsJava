package StarWars;
public class Film {
	String titre;
	String ann�eDeSortie;
	int nombreEpisode;
	int cout;
	int recette;
	List<Acteur> lesActeurs = new List<Acteur>;
	public Film(String titre,String ann�eDeSortie,int nombreEpisode,int cout,int recette) {
		this.titre = titre;
		this.ann�eDeSortie = ann�eDeSortie;
		this.nombreEpisode = nombreEpisode;
		this.cout = cout;
		this.recette = recette;
	}
	String getTitre(){
		return titre;
	}
	String getAnn�eDeSortie(){
		return ann�eDeSortie;
	}
	int getNombreEpisode(){
		return nombreEpisode;
	}
	int getRecette(){
		return recette;
	}
	int getCout(){
		return cout;
	}
	public String ToString() {
		return("Le film " + this.titre + " sortie en " + this.ann�eDeSortie + " d'une dur�e de " + this.nombreEpisode + " �pisodes a cout� " + this.cout + " et rapport� " + this.recette);
	}
}
