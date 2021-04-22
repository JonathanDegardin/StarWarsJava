package StarWars;
public class Film {
	String titre;
	String annéeDeSortie;
	int nombreEpisode;
	int cout;
	int recette;
	List<Acteur> lesActeurs = new List<Acteur>;
	public Film(String titre,String annéeDeSortie,int nombreEpisode,int cout,int recette) {
		this.titre = titre;
		this.annéeDeSortie = annéeDeSortie;
		this.nombreEpisode = nombreEpisode;
		this.cout = cout;
		this.recette = recette;
	}
	String getTitre(){
		return titre;
	}
	String getAnnéeDeSortie(){
		return annéeDeSortie;
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
		return("Le film " + this.titre + " sortie en " + this.annéeDeSortie + " d'une durée de " + this.nombreEpisode + " épisodes a couté " + this.cout + " et rapporté " + this.recette);
	}
}
