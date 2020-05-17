package dessin;

/**
 * Dessin carre.
 * @author Mehdi
 *
 */

public class Carre extends Forme implements Dessin {
	/**
     * Point situé au coin gauche.
     */
    private Point hag;
    /**
     * longueur côte carre.
     */
    private int longueur;
    /**
     * Constructeur carre.
     * @param nom2 nom du carre
     * @param p point en haut a gauche du carre
     * @param l longueur du carre
     */
    public Carre(final String nom2, final Point p, final int l) {
            this.nom = nom2;
            this.nomForme = "Carré";
            this.hag = p;
            this.longueur = l;
    }
    /**
     * Methode pour deplacer le carre.
     * @param valeurx la valeur a ajouter au x d'un point
     * @param valy la valeur a ajouter au y d'un point
     */
    @Override
    public void deplace(final int valx, final int valy) {
        this.hag.deplace(valx, valy);
    }
    /**
     * Methode pour retourner le point en haut a gauche du carre.
     * @return hg
     */
    public Point getPointHG() {
        return this.hag;
    }
    /**
     * Methode pour recuperer la longueur des cotes.
     * @return longueur
     */
    public int getLongueur() {
        return longueur;
    }
    /**
     * Methode pour retourner le nom du carre.
     */
    @Override
    public String getNom() {
        return this.nom;
    }
    /**
     * Methode pour retourner le nom de la forme.
     */
    @Override
    public String getNomForme() {
        return this.nomForme;
    }
    /**
     * Affiche les informations du carre.
     */
    public void affiche() {
        String s = this.nom + " = " + this.nomForme
                + "((" + this.hag.getX() + ", " + this.hag.getY()
                + "), " + this.longueur + ")\n";
        System.out.println(s);
    }
    /**
     * Methode de hachage.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((hag == null) ? 0 : hag.hashCode());
        result = prime * result + longueur;
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
        Carre other = (Carre) obj;
        if (hag == null) {
            if (other.hag != null) {
                return false;
            }
        } else if (!hag.equals(other.hag)) {
            return false;
        }
        if (longueur != other.longueur) {
            return false;
        }
        return true;
    }
}
