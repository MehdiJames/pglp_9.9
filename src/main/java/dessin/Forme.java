package dessin;

public abstract class Forme {
	 
	
	
	/**
     * Le nom de la forme dessin�e.
     */
    
	protected String nom;
       /**
     * La forme dessin�e.
      */
      protected String nomForme;
     /**
     * M�thode pour deplacer une forme.
     * @param valx valeur a ajoute a x
     * @param valy valeur a ajoute a y
     */
    public abstract void deplace(int valx, int valy);
    /**
     * Methode pour recuperer le nom de la forme.
     * @return le nom
     */
    public abstract String getNomForme();
    
    /**
     * Methode pour recuperer le nom.
     * @return le nom de la forme
     */
   
    public abstract String getNom();
}

