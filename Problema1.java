/*
    Dados los valores del radio de un círculo y su altura, calcular:
        - el volumen del cono
        - el volumen del cilindro
    Indicar la diferencia de volumen entre ambos.
    Mostrar los resultados en pantalla con 4 decimales.
*/

import java.util.Scanner;

class Problema1 {

    static double getCircleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    static double getCylinderVolume(double r, double h) {
        return getCircleArea(r) * h;
    }

    public static void main(String args[]) {
        double radius;
        double height;
        double coneVolume;
        double cylinderVolume;

        Scanner sc = new Scanner(System.in);

        System.out.print("Valor del radio: ");
        radius = sc.nextDouble();

        System.out.print("Valor de la altura: ");
        height = sc.nextDouble();

        cylinderVolume = getCylinderVolume(radius, height);
        coneVolume = cylinderVolume / 3;

        System.out.println("\n------------RESULTADOS------------");
        System.out.printf("Volumen del cilindro: %.4f\n", cylinderVolume);
        System.out.printf("Volumen del cono: %.4f\n", coneVolume);
        System.out.printf("Diferencia entre los volúmenes: %.4f\n", cylinderVolume - coneVolume);
    }
}
