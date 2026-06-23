package fr.algorithmie;

public class InversionContenu {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
            int [] arrayCopy = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int indiceInverse = array.length - 1- i;
            arrayCopy[i] = array[indiceInverse];
        }

        System.out.println("tableau original : ");
        for (int a = 0; a < array.length; a++) {
            ;
            System.out.println(array[a]);
        }
        System.out.println("tableau inversé : ");
        for (int a = 0; a < arrayCopy.length; a++) {
            ;
            System.out.println(arrayCopy[a]);
        }
    }
}
