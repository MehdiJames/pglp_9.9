package dessin;

/**
 * Dessin rectangle.
 * @author Mehdi
 *
 */

public class Rectangle extends Forme implements Dessin {
	/**
	 * Point situé au coin gauche.
	 */
	  private Point hag;
	   /**
	 	* Le point en bas a droite du rectangle.
	 	*/
      private Point bad;
     /**
      * Constructeur du rectangle.
      * @param nom2 le nom du rectangle
      * @param pt1 le point situé au coin gauche
      * @param pt2 le point situé au coin droit
      */
     public Rectangle(final String nom2, final Point pt1, final Point pt2) {
        this.nom = nom2;
        this.nomForme = "Rectangle";
        this.hag = pt1;
        this.bad = pt2;
    }
     /**
      *  Methode de hachage.
      */
     @Override
     public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((bad == null) ? 0 : bad.hashCode());
        result = prime * result + ((hag == null) ? 0 : hag.hashCode());
        return result;
     }
     /**
      * Methode de comparaison.
      */
     @Override
     public boolean equals(final Object obj) {
         if (this == obj) {
             return true;
         }
         if (obj == null) {
             return false;
         }
         if (getClass() != obj.getClass()) {
             return false;
         }
         Rectangle other = (Rectangle) obj;
         if (bad == null) {
             if (other.bad != null) {
                 return false;
             }
         } else if (!bad.equals(other.bad)) {
             return false;
         }
         if (hag == null) {
             if (other.hag != null) {
                 return false;
             }
         } else if (!hag.equals(other.hag)) {
             return false;
         }
         return true;
     }
     /**
      * Deplacer rectangle.
      *  @param valeurx valeur ajouter abscisse point
      * @param valeury valeur ajouter ordonnee point
      */
     @Override
     public void deplace(final int valeurx, final int valeury) {
         this.hag.deplace(valeurx, valeury);
         this.bad.deplace(valeurx, valeury);
     }
     /**
      * Methode pour recuperer le nom du rectangle.
      * @return le nom
      */
     public String getNom() {
         return this.nom;
     }
     /**
      * Methode pour recuperer le nom de la forme.
      * @return le nom de la forme
      */
     public String getNomForme() {
        return this.nomForme;
     }
     /**
      * Methode pour recupere le point en haut a gauche du rectangle.
      * @return hg
      */
     public Point getPointHG() {
         return this.hag;
     }
     /**
      * Methode pour recupere le point en bas a droite du rectangle.
      *   @return bd
      */
     public Point getPointBD() {
         return this.bad;
     }
     /**
      * Affiche les informations du rectangle.
      */
     public void affiche() {
         String s = this.nom + " = " + this.nomForme
                 + "((" + this.hag.getX() + ", " + this.hag.getY()
                 + "), (" + this.bad.getX() + ", " + this.bad.getY()
                 + "))\n";
        System.out.println(s);
     }

 }
