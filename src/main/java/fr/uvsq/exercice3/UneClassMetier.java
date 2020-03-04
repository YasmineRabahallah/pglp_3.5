package fr.uvsq.exercice3;

public class UneClassMetier {
	AfficheMetier afficheMetier;

	public UneClassMetier(){
		
	}
	
	
	public void uneMethodeMetier() {
		afficheMetier.afficheDebut(); // log message
		//Traitements métiers
		afficheMetier.afficheFin(); // log message
	}

}
