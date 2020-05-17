package dessin;
/**
 * il s'agit de la classe qui trace un point
 * @author Mehdi
 *
 */
public class Point {
	 /**
     * abscisse point.
     */
    private int x;
    /**
     * ordonnee point.
     */
    private int y;
    /**
     * Constructeur point.
     * @param x2 abscisse point
     * @param y2 ordonnee point
     */
    public Point(final int x2, final int y2) {
        this.x = x2;
        this.y = y2;
    }
    /**
     * recuperation point.
     * @return instance courante
     */
    public Point getPoint() {
        return this;
    }
    /**
     * Methode pour retourner la coordonnee x du point.
     * @return x
     */
    public int getX() {
        return this.x;
    }
    /**
     * Méthode pour retourner la coordonnee y du point.
     * @return y
     */
    public int getY() {
        return this.y;
    }
    /**
     * Methode qui deplace un point.
     * @param valx la valeur a ajoute a x
     * @param valy la valeur a ajoute a y
     */
    public void deplace(final int valeurx, final int valeury) {
        this.x += valeurx;
        this.y += valeury;
    }
    /**
     * Fonction de hachage.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + x;
        result = prime * result + y;
        return result;
    }
    /**
     * Fonction de comparaison.
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
        Point other = (Point) objet;
        if (x != other.x) {
            return false;
        }
        if (y != other.y) {
            return false;
        }
        return true;
    }
}
