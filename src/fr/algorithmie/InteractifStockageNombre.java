package fr.algorithmie;

import java.util.Scanner;

public class InteractifStockageNombre {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Ajouter un nombre");
        System.out.println("2. Affichez les nombres existants");

        int nb = 0;
        int[] array = new int[5];
        int nbTab = 0;
        int choix;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Ajouter un nombre");
            System.out.println("2. Afficher les nombres existants");
            choix = scanner.nextInt();


            switch (choix) {
                case 1:
                    if (nbTab == array.length) {
                        //aggrandir le tableau
                        int[] nouveauTableau = new int[array.length * 2];

                        for (int i = 0; i < array.length; i++) {
                            nouveauTableau[i] = array[i];
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    if (nbTab == 0) {
                        System.out.println("Aucun nombre enregistré.");
                    } else {
                        System.out.println("Nombres enregistrés :");
                        for (int i = 0; i < nbTab; i++) {
                            System.out.print(array[i] + " ");
                        }
                        System.out.println();
                    }
                    break;

                default:
                    System.out.println("Choix invalide !");

            }
        }        while (choix != 0);


        scanner.close();

    }
}
