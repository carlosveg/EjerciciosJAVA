import java.util.Scanner;

public class Problema15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = 1;
        int max = 100, min = 1;
        int numRand = (int)Math.floor(Math.random() * (max - min + 1) + min);
        boolean isGuess = false;

        System.out.println("Adivina el numero generado en el rango (1-100) ");
        System.out.println("Adivina el numero o ingresa 0 para finalizar el juego");

        while ((!isGuess) || (input != 0)) {
            System.out.print("Introduce un número: ");
            input = sc.nextInt();

            if (input == 0) break;
            if (input > numRand) System.out.println("Tu numero es mayor");
            if (input < numRand) System.out.println("Tu numero es menor");
            if (input == numRand) {
                System.out.println("¡¡FELICIDADES!! Ganaste");
                break;
            }
        }
    }
}
