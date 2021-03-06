package dessin;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Classe de tests de Point.
 * @author Mehdi
 *
 */
public class TestPoint {
    /**
     * Test de la fonction deplace de Point.
     */
    @Test
    public void testDeplace() {
        Point p1 = new Point(15, 20);
        p1.deplace(5, -5);
        
        Point p2 = new Point(20, 15);
        
        assertEquals(p1, p2);
    }
}
