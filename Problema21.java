import java.util.Scanner;

public class Problema21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[3][3];
        int i, suma = 0;

        for (i = 0; i < array.length; i++)
            for (int j = 0; j < array.length; j++) {
                System.out.print("Numero[" + i + "][" + j + "]: ");
                array[i][j] = sc.nextInt();
            }

        for (i = 0; i < array.length; i++)
            suma += array[i][i];

        System.out.println("\nSuma de la diagonal principal: " + suma);
    }
}
