package dessin;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;

/**
 * Classe de tests pour ComposantDessin.
 * @author Mehdi
 *
 */
public class TestComposantDessin {
    /**
     * Test de la fonction deplace de ComposantDessin.
     */
    @Test
    public void testDeplace() {
        Point p1 = new Point(15, 20);
        Point p2 = new Point(25, 10);
        Point p3 = new Point(15, 20);
        Rectangle r = new Rectangle("r1", p1, p2);
        Cercle c = new Cercle("c1", p3, 5);
        
        ComposantDessin cd = new ComposantDessin("cd1");
        cd.ajoute(r);
        cd.ajoute(c);
        cd.deplace(5, -5);
        
        p1 = new Point(20, 15);
        p2 = new Point(30, 5);
        r = new Rectangle("r1", p1, p2);
        c = new Cercle("c1", p1, 5);
        
        cd.affiche();
        
        ComposantDessin expected = new ComposantDessin("cd1");
        expected.ajoute(r);
        expected.ajoute(c);
        expected.affiche();
        
        assertEquals(expected, cd);
    }
    /**
     * Test de la fonction affichage dans ComposantDessin.
     */
    @Test
    public void testAffichage() {
        Point p1 = new Point(15, 20);
        Point p2 = new Point(25, 10);
        Rectangle r = new Rectangle("r1", p1, p2);
        Cercle c = new Cercle("c1", p1, 5);
        
        ComposantDessin cd = new ComposantDessin("cd1");
        cd.ajoute(r);
        cd.ajoute(c);
        cd.affiche();
        
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        cd.affiche();

        String expected = "cd1 = Composant du dessin:";
        String[] actual = outContent.toString().split("\n");
        assertEquals(expected, actual[0]);
        expected = "r1 = Rectangle((15, 20), (25, 10))";
        assertEquals(expected, actual[2]);
        expected = "c1 = Cercle((15, 20), 5)";
        assertEquals(expected, actual[4]);
    } 
    
}
