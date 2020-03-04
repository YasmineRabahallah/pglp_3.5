package fr.uvsq.exercice3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AfficheMetier implements MessageLog {
	

	

	public void messagelog( final String message) {
		Logger logger = LoggerFactory.getLogger(AfficheMetier.class);
		 logger.info(message);
	}
}
