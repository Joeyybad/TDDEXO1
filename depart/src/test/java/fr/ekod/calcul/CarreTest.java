package fr.ekod.calcul;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CarreTest {

    // Red
    @Test
    public void testCarre() {

        assertEquals(9, Calculatrice.carre(3));
    }
}
