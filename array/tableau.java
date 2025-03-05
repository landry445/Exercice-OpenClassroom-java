package array;

public class tableau {

    public static void main(String[] args) {
        int[] tableau = new int[5];
        tableau[0] = 1;
        tableau[1] = 2;
        tableau[2] = 3;
        tableau[3] = 4;
        tableau[4] = 5;

        for (int i = 0; i < tableau.length; i++) {
            System.out.println(tableau[i]);
        }
    }
}