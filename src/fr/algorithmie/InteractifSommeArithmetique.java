package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int nb = 0;
        System.out.println("Renseignez un nombre");
        nb = scanner.nextInt() ;

        System.out.println("Voici les entiers compris entre 1 et " + nb);
        int nbEntier = 0;
        for (int i = 1; i <= nb; i++) {
            nbEntier += i;
        }
        System.out.println("somme de tous les nombres entiers jusqu'à " + nb + " = " + nbEntier);;
    }
}
