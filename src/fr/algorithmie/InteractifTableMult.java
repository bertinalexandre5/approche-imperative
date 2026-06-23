package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        int nb = 0;
        while (nb < 1 || nb > 10) {
            System.out.println("Renseignez un chiffre entre 1 et 10");
            nb = scanner.nextInt() ;
        }

        System.out.println("Voici la table de " + nb);
        int result = 0;
        for (int i = 1; i <=10; i++) {
            result = nb * i;
            System.out.println(nb + " x " + i + " = " + nb * i);

        }
    }
}
