package fr.uvsq.exercice3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * class AfficheMetier.
 * @author rabahallah yasmine.
 *
 */

public class AfficheMetier implements MessageLog {
  /**
   * @param message le message qu'on veux l'afficher.
   */
  public void messagelog( final String message) {
    Logger logger = LoggerFactory.getLogger(AfficheMetier.class);
    logger.info(message);
  }
}
