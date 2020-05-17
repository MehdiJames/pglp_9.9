package dessin;
/**
 * il s'agit de la classe qui fait le Dessin du Triangle
 * @author Mehdi
 *
 */

public class Triangle extends Forme implements Dessin {
	 
	  /**
       * decalaration point1.
       */
    private Point pt1;
    
	/**
       * declaration point2.
       */
    private Point pt2;
    
	/**
        * declaration point3.
       */
    private Point pt3;
    
	
    /**
      * Constructeur d'un triangle.
      * @param nom2 Le nom du triangle
      * @param point1 1er point triangle
      * @param point2 2eme point triangle
      * @param point3 3eme point triangle
      */
    public Triangle(final String nom2, final Point point1,
            final Point point2, final Point point3) {
        this.nom = nom2;
        this.nomForme = "Triangle";
        this.pt1 = point1;
        this.pt2 = point2;
        this.pt3 = point3;
    }

    
    
    /**
     * deplacer triangle.
     * @param valeurx valeur a ajouter en abscisse du point
     * @param valeury valeur a ajouter en ordonnee du point
     */
    @Override
    public void deplace(final int valeurx, final int valeury) {
        this.pt1.deplace(valeurx, valeury);
        this.pt2.deplace(valeurx, valeury);
        this.pt3.deplace(valeurx, valeury);
    }
    
    
    
    
    /**
     * retourne nom triangle.
     * @return nom
     */
    @Override
    public String getNom() {
        return this.nom;
    }
    
    
    
    
    /**
     * retourne le nom de la forme.
     * @return le nom de la forme
     */
    @Override
    public String getNomForme() {
        return this.nomForme;
    }
    
    
    
    
    /**
     * premier point triangle.
     * @return p1
     */
    public Point getPoint1() {
        return this.pt1;
    }
    
    
    /**
     * deuxieme point triangle.
     * @return p2
     */
    public Point getPoint2() {
        return this.pt2;
    }
    
    
    /**
     * Retourne le troisieme point du triangle.
     * @return p3
     */
    public Point getPoint3() {
        return this.pt3;
    }
    
    
    /**
     * Affiche les informations du triangle.
     */
    public void affiche() {
        String s = this.nom + " = " + this.nomForme
                + "((" + this.pt1.getX() + ", " + this.pt1.getY()
                + "), (" + this.pt2.getX() + ", " + this.pt2.getY()
                + "), (" + this.pt3.getX() + ", " + this.pt3.getY()
                + "))\n";
        System.out.println(s);
    }
    
    
    /**
     * Methode de hachage.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pt1 == null) ? 0 : pt1.hashCode());
        result = prime * result + ((pt2 == null) ? 0 : pt2.hashCode());
        result = prime * result + ((pt3 == null) ? 0 : pt3.hashCode());
        return result;
    }
    
    
    /**
     * Methode de comparaison.
     */
    @Override
    public boolean equals(final Object objet) {
        if (this == objet) {
            return true;
        }
        if (objet == null) {
            return false;
        }
        if (getClass() != objet.getClass()) {
            return false;
        }
        Triangle other = (Triangle) objet;
        if (pt1 == null) {
            if (other.pt1 != null) {
                return false;
            }
        } else if (!pt1.equals(other.pt1)) {
            return false;
        }
        if (pt2 == null) {
            if (other.pt2 != null) {
                return false;
            }
        } else if (!pt2.equals(other.pt2)) {
            return false;
        }
        if (pt3 == null) {
            if (other.pt3 != null) {
                return false;
            }
        } else if (!pt3.equals(other.pt3)) {
            return false;
        }
        return true;
    }
}
