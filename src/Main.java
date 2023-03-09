public class Main {
    public static void main(String[] args) {
        System.out.println("Шахматная доска");

    int[] Array = {1, 2, 3, 4, 5, 6, 7, 8};

    String[] names = {"a", "b", "c", "d", "e", "f", "g", "h"};

        for (int i = 0; i < 8; i++) {
        System.out.println(" ");
        for (int j = 0; j < 8; j++ ) {
            System.out.print(names[j] + Array[i]);
            System.out.print(" ");
        }
    }
}}