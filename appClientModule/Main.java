import java.util.*;
import StarWars.*;
public class Main {
	public static void main(String[] args) {
		Film unFilm = new Film("LeFilm1",1998,4,154,185);
		Film unSecondFilm = new Film("LeFilm2",2012,6,256,450);
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le titre du film : ");
		String titre = sc.nextLine();
		System.out.println("Veuillez saisir l'ann?e de sortie du film : ");
		String annee = sc.nextLine();
		int anneeSortie = Integer.parseInt(annee);
		System.out.println("Veuillez saisir le nombre d'?pisode de la saga : ");
		String episode = sc.nextLine();
		int episodeFilm = Integer.parseInt(episode);
		System.out.println("Veuillez saisir le cout du film : ");
		String cout = sc.nextLine();
		int coutFilm = Integer.parseInt(cout);
		System.out.println("Veuillez saisir la recette du film : ");
		String recette = sc.nextLine();
		int recetteFilm = Integer.parseInt(recette);
		Film unDernierFilm = new Film(titre,anneeSortie,episodeFilm,coutFilm,recetteFilm);
		System.out.println(unFilm.ToString());
		System.out.println(unSecondFilm.ToString());
		System.out.println(unDernierFilm.ToString());
		unFilm.AddFilm(unFilm);
		unFilm.AddFilm(unDernierFilm);
		unFilm.AddFilm(unSecondFilm);
		ArrayList<Film> CollectionFilm = new ArrayList<Film>();
		CollectionFilm.add(unFilm);
		CollectionFilm.add(unSecondFilm);
		CollectionFilm.add(unDernierFilm);
		collectionToString(unFilm.getEpisodes());
		Personnage unPremierPerso = new Personnage("Han","Solo");
		Personnage unSecondPerso = new Personnage("Indiana","Jones");
		Acteur unActeur = new Acteur("Harisson","Ford");
		unActeur.AddPersonnage(unPremierPerso);
		unActeur.AddPersonnage(unSecondPerso);
		System.out.println(unActeur.nbPersonnage());
		if (unFilm.isBenefice() == true) {
			System.out.println(unFilm.calculBenefice());
		}
		}
	public Main() {}
	public static void collectionToString(ArrayList<Film> CollectionFilm) {
		for(int i = 0 ; i<CollectionFilm.size();i++) {
			System.out.println(CollectionFilm.get(i).ToString());
		}
		
	}


}