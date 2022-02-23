/* 
    Escribe un programa que calcule el área de un trapecio de lados a y b y altura h

    Formula: ((a + b) / 2) * h
*/

import java.util.Scanner;

class Problema2 {
    public static void main(String[] args) {
        double a, b, h;
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor del lado a: ");
        a = sc.nextDouble();

        System.out.print("Valor del lado b: ");
        b = sc.nextDouble();

        System.out.print("Valor de la altura: ");
        h = sc.nextDouble();

        System.out.println("\n------------RESULTADOS------------");
        System.out.println("Area: " + ((a + b) / 2) * h);
    }
}