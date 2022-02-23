import java.util.Scanner;

public class Problema10 {

    /*static int factorial(int n) {
        if (n == 0 || n == 1) return 1;

        return n * factorial(n-1);
    }*/

    static int factorial(int n) {
        int fact = 1;

        for (; n > 0; n--) fact *= n;

        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Valor de n: ");
        n = sc.nextInt();

        System.out.println(factorial(n));
    }
}
