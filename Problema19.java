import java.util.Scanner;

public class Problema19 {

    public static void main(String[] aegs) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        int i, aux;

        for (i = 0; i < array.length; i++) {
            System.out.print("Numero" + i + ": ");
            array[i] = sc.nextInt();
        }

        System.out.println("\nMoviendo una posicion el arreglo");

        aux = array[array.length - 1];
        for (i = array.length - 1; i > 0; i--) {
            array[i] = array[i-1];
        }
        array[0] = aux;

        System.out.println("\nMostrando arreglo");
        for (i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }
}
