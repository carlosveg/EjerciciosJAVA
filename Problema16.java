import java.util.ArrayList;
import java.util.Scanner;

public class Problema16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int input = 1, suma = 0, i = 0;

        while (input != 0) {
            System.out.print("Introduce un numero: ");
            input = sc.nextInt();

            numbers.add(input);
        }

        while (i < numbers.size()) suma += Math.pow(numbers.get(i++), 2);

        System.out.println("Resultado: " + suma);
    }
}
