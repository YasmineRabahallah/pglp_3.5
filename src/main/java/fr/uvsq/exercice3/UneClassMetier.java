package fr.uvsq.exercice3;

public class UneClassMetier {
	AfficheMetier afficheMetier;

	public UneClassMetier(){
		
	}
	
	/**
	 * 
	 */
	public void uneMethodeMetier(final String message ) {
		MessageLog log =  new  AfficheMetier();
		log.messagelog(message);
	}

}
