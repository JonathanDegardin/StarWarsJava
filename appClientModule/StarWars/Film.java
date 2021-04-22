package StarWars;

import java.util.*;

public class Film {
	String titre;
	int anneeDeSortie;
	int nombreEpisode;
	int cout;
	int recette;
	ArrayList<Acteur> lesActeurs = new ArrayList<Acteur>();
	ArrayList<Film> lesEpisodes = new ArrayList<Film>();
	ArrayList<Personnage> lesPersonnages = new ArrayList<Personnage>();
	public Film(String titre,int anneeDeSortie,int nombreEpisode,int cout,int recette) {
		this.titre = titre;
		this.anneeDeSortie = anneeDeSortie;
		this.nombreEpisode = nombreEpisode;
		this.cout = cout;
		this.recette = recette;
	}
	public void AddFilm(Film unFilm) {
		this.lesEpisodes.add(unFilm);
	}
	public String getTitre(){
		return titre;
	}
	public int getAnneeDeSortie(){
		return anneeDeSortie;
	}
	public int getNombreEpisode(){
		return nombreEpisode;
	}
	public int getRecette(){
		return recette;
	}
	public int getCout(){
		return cout;
	}
	public ArrayList<Film> getEpisodes(){
		return lesEpisodes;
	}
	public int nbActeur() {
		
		int nb = 0;
		for(int i = 0 ; i< this.lesPersonnages.size();i++) {
			nb=nb+1;
		}
		return nb;
	}
	public int nbPersonnage() {
	int nb = 0;
	for(int i = 0 ; i< this.lesActeurs.size();i++) {
		nb = nb+1;
	}
	return nb;
	}
	public boolean isBenefice() {
		if(cout>recette) {
			return false;
		}
		else {
			return true;
		}
	}
	public int calculBenefice() {
		int benefice;
		benefice = this.recette - this.cout;
		return benefice;
	}
	public String ToString() {
		return("Le film " + this.titre + " sortie en " + this.anneeDeSortie + " d'une durée de " + this.nombreEpisode + " épisodes a couté " + this.cout + " et rapporté " + this.recette);
	}
}
