import java.util.Scanner;
import java.util.LinkedList;

public class Problema11 {

    static boolean passTheTest(int n) {
        int sum = 0, aux = n;
        LinkedList<Integer> stack = new LinkedList<Integer>();

        for (; aux > 0; aux /= 10)
            stack.push(aux % 10);

        for (; !stack.isEmpty();)
            sum += Math.pow(stack.pop(), 3);

        return sum == n ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(passTheTest(153));

        for (int i = 1; i <= 5000; i++)
            if (passTheTest(i))
                System.out.println(i);
    }
}
