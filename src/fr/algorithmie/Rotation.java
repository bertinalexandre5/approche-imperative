package fr.algorithmie;

public class Rotation {

    static void main(String[] args) {
        int[] array = {1, 3, 6, 12, 6};

        int dernier = array[array.length - 1];

        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
    array[0] = dernier;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
