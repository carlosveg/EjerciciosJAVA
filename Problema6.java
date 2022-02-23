import java.util.Scanner;

public class Problema6 {

    static boolean isValidName(String name) {
        boolean isValid = false;
        String nameLC = name.toLowerCase();

        if (nameLC.equals("teresa") || nameLC.equals("tere") || nameLC.equals("teresita"))
            isValid = true;

        return isValid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorCompra;
        String nombre;
        int edad;
        char sexo;
        double descuento;

        System.out.print("Valor de la compra: ");
        valorCompra = sc.nextDouble();

        System.out.print("Nombre del cliente: ");
        nombre = sc.next();

        System.out.print("Edad: ");
        edad = sc.nextInt();
 
        System.out.print("Sexo (M/F): ");
        sexo = sc.next().charAt(0);

        if ((edad >= 16 || edad <= 22) && isValidName(nombre) && Character.toLowerCase(sexo) == 'f') {
            descuento = valorCompra * 0.07;
            System.out.println("\nUsted es acreedora de un descuento del 7% en su compra");
            System.out.println("\n\n******** TICKET ********\n");
            System.out.println("Total sin descuento: " + valorCompra);
            System.out.printf("Descuento: %.2f\n", descuento);
            System.out.printf("Total a pagar: %.2f\n", (valorCompra - descuento));
        }
        else
            System.out.println("Sin descuento :c");
    }
}
