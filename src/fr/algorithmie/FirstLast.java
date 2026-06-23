package fr.algorithmie;

public class FirstLast {

    public static void main(String[] args) {
        int[] array1 = {1, 3, 6, 12, 6};

        boolean verif = array1.length >= 1 && (array1[0] == array1[array1.length - 1]);
        System.out.println(verif);
}
}
