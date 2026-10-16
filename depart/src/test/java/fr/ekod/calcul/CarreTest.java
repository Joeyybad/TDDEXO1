package fr.ekod.calcul;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarreTest {

    // Red
    @Test
    public void testCarre() {

        assertEquals(9, Calculatrice.carre(3));
    }

    @Test
    public void testCarreNegatif() {

        assertEquals(16, Calculatrice.carre(-4));
    }

    @Test
    public void testCarreZero() {

        assertEquals(0, Calculatrice.carre(0));
    }

    @Test
    public void testCarreGrandNombre() {

        assertEquals(2147488281, Calculatrice.carre(46341));
    }

}
