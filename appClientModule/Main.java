import java.util.*;
import StarWars.*;
public class Main {
	public static void main(String[] args) {
		Film unFilm = new Film("LeFilm1",1998,4,154,185);
		Film unSecondFilm = new Film("LeFilm2",2012,6,256,450);
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le titre du film : ");
		String titre = sc.nextLine();
		System.out.println("Veuillez saisir l'année de sortie du film : ");
		String annee = sc.nextLine();
		int anneeSortie = Integer.parseInt(annee);
		System.out.println("Veuillez saisir le nombre d'épisode de la saga : ");
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
		Personnage unPerso = new Personnage("Jean","Luc");
		ArrayList<Film> CollectionFilm = new ArrayList<Film>();
		CollectionFilm.add(unFilm);
		CollectionFilm.add(unSecondFilm);
		CollectionFilm.add(unDernierFilm);
		collectionToString(CollectionFilm);
	}
	public Main() {}
	public static void collectionToString(ArrayList<Film> CollectionFilm) {
		for(int i = 0 ; i<CollectionFilm.size();i++) {
			System.out.println(CollectionFilm.get(i).ToString());
		}
		
	}


}