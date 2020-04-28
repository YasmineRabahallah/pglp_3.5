package fr.uvsq.exercice3;

/**
 * class UneClassMetier.
 * @author rabahallah yasmine.
 *
 */
public class UneClassMetier {

  /**
   *methode  pour Récupérer le message.
   * @param message le message qu'on veux l'afficher.
   */

  public void uneMethodeMetier(final String message) {
    MessageLog log =  new  AfficheMetier();
    log.messagelog(message);
  }

}
