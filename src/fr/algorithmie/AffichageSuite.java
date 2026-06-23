package fr.algorithmie;

public class AffichageSuite {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        for (int b = 0; b <= 10; b++) {
            if (b % 2 == 0) {
                System.out.println(b);
            }
        }


        for (int c = 1; c < 10; c++) {
            if (c % 2 != 0) {
                System.out.println(c);
            }
        }

        int entier = 1;
        while (entier <= 10) {
        System.out.println(entier);
        entier++;
    }

        int entierBis = 1;
        while (entierBis <= 10) {
            if (entierBis % 2 == 0) {
            System.out.println(entierBis);
        }
            entierBis++;

        }

        int entier3 = 1;
        while (entier3 < 10) {
            if (entier3 % 2 != 0) {
                System.out.println(entier3);
            }
            entier3++;

        }

    }}
