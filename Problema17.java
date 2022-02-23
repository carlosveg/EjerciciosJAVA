import java.util.Scanner;

public class Problema17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int i;

        for (i = 0; i < 10; i++) {
            System.out.print("Numero " + i + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nImprimiendo los numeros...\n");
        for (i = 0; i < 10; i++)
            System.out.println(numbers[i]);
    }
}
