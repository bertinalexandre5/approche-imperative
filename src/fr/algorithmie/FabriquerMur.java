package fr.algorithmie;

public class FabriquerMur {
    static void main(String[] args) {
        verifier(3, 1, 8, true);
        verifier(3, 1, 9, false);
        verifier(3, 2, 10, true);
        verifier(3, 2, 8, true);
        verifier(3, 2, 9, false);
        verifier(6, 1, 11, true);
        verifier(6, 0, 11, false);
        verifier(1, 4, 11, true);
        verifier(0, 3, 10, true);
        verifier(1, 4, 12, false);
        verifier(3, 1, 7, true);
        verifier(1, 1, 7, false);
    }
    static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        boolean resultat = false;
        int nbGrosseBriqueUtilise = longueur / 5; //Variable a pour valeur la longeur divisée par le nombre de grande brique)
        if (nbGrosseBriqueUtilise > nbBig) { //si variable supérieur a nbBig alors variable = à nbBig
            nbGrosseBriqueUtilise = nbBig; //comparaison du nombre de grandes briques nécessaire pour atteindre la longueur
        }
        int longeurRestante = longueur - nbGrosseBriqueUtilise * 5;

        resultat = (longeurRestante <= nbSmall);
        System.out.println(resultat);
        return resultat;
    }
    private static void verifier(int nbSmall, int nbBig, int longueur, boolean b)
    {
        if (!fabriquerMur(nbSmall, nbBig, longueur) == b) {
            System.err.println("Test (" + nbSmall + ", " + nbBig + ", " +
                    longueur + ") NON passant.");
        }
    }
}




