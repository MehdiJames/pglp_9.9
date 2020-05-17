package dessin;


/**
 * il s'agit de la classe qui fait le Dessin du cercle
 * @author Mehdi
 *
 */
public class Cercle extends Forme implements Dessin {
	  private Point centre;
      private int rayon;
      
      
      /**
      * Constructeur d'un cercle.
      * @param nom2 le nom du cercle
      * @param p le centre du cercle
      * @param ray le rayon du cercle
      */
      public Cercle(final String nom2, final Point pt, final int rayo) {
         this.nom = nom2;
         this.nomForme = "Cercle";
         this.centre = pt;
         this.rayon = rayo;
     }
   
      
      
      /**
      * utilisation de hashcode.
      */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((centre == null) ?  0 : centre.hashCode());
 
        result = prime * result + rayon;
        return result;
    }
    
    
    /**
     * comparaison.
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
        Cercle other = (Cercle) obj;
        if (centre == null) {
            if (other.centre != null) {
                return false;
            }
        } else if (!centre.equals(other.centre)) {
            return false;
        }
        if (rayon != other.rayon) {
            return false;
        }
        return true;
    }
    
    
    /**
     * deplacer cercle.
     * @param valeurx valeur a ajouter abscisse point
     * @param valeury la valeur a ajouter abscisse point
     */
    @Override
    public void deplace(final int valeurx, final int valeury) {
        this.centre.deplace(valeurx, valeury);
    }
    
    
    
    /**
     * nom de la forme.
     * @return le nom de la forme.
     */
    @Override
    public String getNomForme() {
        return this.nomForme;
    }
    
    
    
    /**
     * nom du cercle.
     * @return nom
     */
    @Override
    public String getNom() {
        return this.nom;
    }
    
    
    
    /**
     * Abscisse et ordonnee du centre
     * @return centre
     */
    public Point getCentre() {
        return this.centre;
    }
    
    
    
    
    /**
     * taille du rayon 
     * @return rayon
     */
    public int getRayon() {
        return this.rayon;
    }
    
    
    
    
    /**
     * informations du cercle.
     */
    public void affiche() {
        String s = this.nom + " = " + this.nomForme
                + "((" + this.centre.getX() + ", " + this.centre.getY()
                + "), " + this.rayon + ")\n";
        System.out.println(s);
    }
}
