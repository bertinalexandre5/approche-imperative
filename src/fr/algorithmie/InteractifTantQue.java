package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {
    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in) ;
        int nb = 0;
        while (nb < 1 || nb > 10) {
            System.out.println("Rentrez de nouveau un chiffre entre 1 et 10");
            nb = scanner.nextInt() ;
        }
        System.out.println(nb);

    }
}
