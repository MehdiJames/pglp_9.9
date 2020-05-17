package dessin;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Classe qui se charge des interactions avec l'utilisateur.
 * @author Mehdi
 *
 */
public class DrawingTUI {
/**
     * Le scanner pour la console.
     */
    private Scanner scanner;
    /**
     * Le constructeur de la classe.
     */
    public DrawingTUI() {
        new HashMap<String, Command>();
        this.scanner = new Scanner(System.in, "UTF-8");
    }
    /**
     * Méthode qui analysera le texte saisi
     * par l’utilisateur et retournera un objet implémentant l’interface Commande
     * @param nom de la commande
     * @param commande l'instance
     */
    public Command nextCommand(final String nom,
            final Command commande) {
        Command com = null;
        
        while (!scanner.hasNext("quit") && scanner.hasNext()) {
            String ligne = scanner.next().toLowerCase();
            if (ligne.contains(("rectangle")) || (ligne.contains("cercle"))
                    || (ligne.contains("carre")) || (ligne.contains("triangle"))
                            || (ligne.contains("dessin"))) {
                        com = new CreateCommand(ligne);
                    }
        }
        
        return com;
    }
    
}
