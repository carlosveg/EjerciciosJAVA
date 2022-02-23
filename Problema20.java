public class Problema20 {

    public static void main(String[] args) {
        int[] array = new int[10];
        int mayor, menor;

        for (int i = 0; i < 10; i++)
            array[i] = (int)(Math.random() * 100);

        mayor = array[0];
        menor = array[0];

        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
            if (mayor < array[i]) mayor = array[i];
            if (menor > array[i]) menor = array[i];
        }

        System.out.println("\nMayor: " + mayor + "\nMenor: " + menor);
    }
}
