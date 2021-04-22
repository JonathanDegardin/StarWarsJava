package StarWars;

import java.util.*;

public class Film {
	String titre;
	int anneeDeSortie;
	int nombreEpisode;
	int cout;
	int recette;
	ArrayList<Acteur> lesActeurs = new ArrayList<Acteur>();
	public Film(String titre,int anneeDeSortie,int nombreEpisode,int cout,int recette) {
		this.titre = titre;
		this.anneeDeSortie = anneeDeSortie;
		this.nombreEpisode = nombreEpisode;
		this.cout = cout;
		this.recette = recette;
	}
	String getTitre(){
		return titre;
	}
	int getAnneeDeSortie(){
		return anneeDeSortie;
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
		return("Le film " + this.titre + " sortie en " + this.anneeDeSortie + " d'une durée de " + this.nombreEpisode + " épisodes a couté " + this.cout + " et rapporté " + this.recette);
	}
}
