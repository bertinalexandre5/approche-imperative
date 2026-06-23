package fr.algorithmie;

import java.util.Scanner;

public class InteractifChiffresSuivants {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        int nb = 0;
        System.out.println("Renseignez un nombre");
        nb = scanner.nextInt() ;

        for (int i = 1; i <= 10; i++){
            System.out.println(nb + i);
        }
    }
}
