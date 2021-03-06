package dessin;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;
/**
 * Classe de tests de la fonction Rectangle.
 * @author Mehdi
 *
 */
public class TestRectangle {
    /**
     * Test de la fonction deplace de Rectangle.
     */
    @Test
    public void testDeplace() {
        Point p1 = new Point(15, 20);
        Point p2 = new Point(25, 10);
        Rectangle r = new Rectangle("r1", p1, p2);
        r.deplace(5, -5);
        
        Point p3 = new Point(20, 15);
        Point p4 = new Point(30, 5);
        Rectangle expected = new Rectangle ("exp", p3, p4);
        
        assertEquals(expected.getPointHG(), p3);
        assertEquals(expected.getPointBD(), p4);
        assertEquals("r1", r.getNom());
        assertEquals("Rectangle", r.getNomForme());
    }  
    /**
     * Test de la fonction affichage dans Rectangle.
     */
    @Test
    public void testAffichage() {
        Point p1 = new Point(15, 20);
        Point p2 = new Point(25, 10);
        Rectangle r = new Rectangle("r1", p1, p2);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        r.affiche();

        String expected = "r1 = Rectangle((15, 20), (25, 10))";

        assertEquals(expected, outContent.toString().trim());
    }
}
