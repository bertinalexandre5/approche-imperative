package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = 0;
        int inconnu = (int) (Math.random() * 100 + 1);

        System.out.println("Choisir un nombre entre 1 et 100");

        int compteur = 0;

        do {
            nb = scanner.nextInt();
            if (nb < inconnu) {
                System.out.println("le chiffre à trouver est au dessus");
            } else if (nb > inconnu) {
                System.out.println("le chiffre à trouver est au dessous");
            }
            compteur++;
        }
            while (nb != inconnu) ;
            System.out.println("Bravo, vous avez trouvé en " + compteur + "coups");


    }
}
