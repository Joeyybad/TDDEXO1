package fr.ekod.calcul;

public class Calculatrice {
    public static int carre(int x) {
        return x * x;
    }

    public static int puissance(int base, int exposant) {
        int resultat = 1;
        for (int i = 0; i < exposant; i++) {
            resultat *= base;
        }
        return resultat;
    }

}
