package fr.uvsq.exercice3;

import java.time.LocalDateTime;

public class AfficheMetier implements MessageLog {
	/**
	 * fonction pour l'affichage un message log au début.
	 */
	public void afficheDebut() {
		System.out.println(LocalDateTime.now()
				+ " : Début de UneMethodeMetier");
	}
	/**
	 * fonction pour l'affichage message log  à la fin.
	 */
	public void afficheFin() {
		System.out.println(LocalDateTime.now()
				+ " : Fin de UneMethodeMetier");
	}
}
