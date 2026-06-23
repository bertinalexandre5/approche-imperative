package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusGrand {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nb = 0;
        System.out.println("Renseignez 10 nombres");

        int max = 0;
        for (int i = 0; i < 10; i++) {
            nb = scanner.nextInt();
                    if (i == 0 || nb > max) {
                        max = nb;
                    }
        }
        System.out.println("Le plus grand nombre est : " + max);
    }
}
