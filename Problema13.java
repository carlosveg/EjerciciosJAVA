import java.util.Scanner;

public class Problema13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder inputReverse = new StringBuilder();
        String input = "";

        System.out.print("Cadena a invertir: ");
        input = sc.nextLine();

        inputReverse.append(input);
        inputReverse.reverse();

        System.out.println(inputReverse);
    }
}
