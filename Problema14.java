import java.util.Scanner;

public class Problema14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        System.out.print("Numero: ");
        input = sc.nextInt();

        while (input <= 150) {
            System.out.println(input);
            input += 5;
        }
    }
}
