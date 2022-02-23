import java.util.Scanner;

public class Problema8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Valor a: ");
        a = sc.nextInt();

        System.out.print("Valor b: ");
        b = sc.nextInt();

        if (a % b == 0) System.out.println( a + " es multiplo de " + b);
        else if (b % a == 0) System.out.println( b + " es multiplo de " + a);
    }
}
