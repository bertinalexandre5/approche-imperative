package fr.algorithmie;

public class SommeDeTableauxDiff {
   public static void main(String[] args) {

        int[] tab1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] tab2 = {-1, 12, 17, 14, 5, -9, 0, 18 } ;

        int tailleMax = tab1.length;
        if (tab2.length > tailleMax) {
            tailleMax = tab2.length;
        }

        int[] tab3 = new int[tailleMax];

        for (int i = 0; i < tailleMax; i++) {
            int val1 = 0;
            int val2 = 0;

            if (i < tab1.length) {
                val1 = tab1[i];
            }

            if (i < tab2.length) {
                val2 = tab2[i];
            }

        tab3[i] = val1 + val2;
        }
        for (int i = 0; i < tab3.length; i++) {
            System.out.println(tab3[i]);

        }
     }
}
