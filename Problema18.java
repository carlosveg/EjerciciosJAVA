import java.util.Scanner;

public class Problema18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arregloX = new int[10];
        int[] arregloY = new int[10];
        int[] result = new int[20];
        int i, j = 0;

        System.out.println("\nLlenando arregloX");
        for (i = 0; i < 10; i++) {
            System.out.print("Numero " + i + ": ");
            arregloX[i] = sc.nextInt();
        }

        System.out.println("\nLlenando arregloY");
        for (i = 0; i < 10; i++) {
            System.out.print("Numero " + i + ": ");
            arregloY[i] = sc.nextInt();
        }

        System.out.println("\nCreando arreglo resultante...");
        for (i = 0; i < 20; i++)
            result[i] = (i % 2 == 0) ? arregloX[j] : arregloY[j++];
        System.out.println("\n...Arreglo creado");

        System.out.println("\nMostrando arregloX");
        for (i = 0; i < 20; i++)
            System.out.println("Numero " + i + ": " + result[i]);
    }
}
