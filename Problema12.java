public class Problema12 {

    public static void main(String[] args) {
        int inversion = 500;
        int total = 0;

        for (int i = 1; i <= 20; i++) {
            // en los primeros 10 años
            if (i <= 10) {
                // invierto 500 en los primeros 10 años
                total += 500;
                /* 
                 * reinvierto las ganancias
                 * a partir del segundo año que ya existen ganancias
                 */
                if (i >= 2) total *= 1.05;
            }
            else
                total *= 1.05;
        }

        System.out.println("Dinero total en cuenta: $" + total);
    }
}
