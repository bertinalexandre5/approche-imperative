package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 6, 12, 6};
        int[] array2 = {1, 3, 6, 12, 7};

        boolean verif = array1.length >= 1 && (array1[0] == 6 || array1[array1.length - 1] == 6);
        boolean verif2 = array2.length >= 1 && (array2[0] == 6 || array2[array2.length - 1] == 6);


        System.out.println(verif);
        System.out.println(verif2);

    }

    }

