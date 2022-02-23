import java.util.Scanner;

class Problema4 {
	public static void main(String[] args) {
		double a, b, c, x1, x2;
		double raiz, discriminante;
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor a: ");
		a = sc.nextDouble();

		System.out.print("Valor b: ");
		b = sc.nextDouble();

		System.out.print("Valor c: ");
		c = sc.nextDouble();

		discriminante = Math.pow(b, 2) - 4 * a * c;

		if (discriminante < 0) {
			System.out.println("No hay soluciones reales");
			return;
		}

		x1 = (((-1) * b) + Math.sqrt(discriminante)) / (2 * a);
		x2 = (((-1) * b) - Math.sqrt(discriminante)) / (2 * a);

		System.out.printf("x1 = %.3f\n", x1);
		System.out.printf("x2 = %.3f\n", x2);
	}
}
