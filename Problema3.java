/*
	Utilizando operaciones de división entera y módulo, convertir un número dado en segundos
	a su equivalente en horas, minutos y segundos.
*/

import java.util.Scanner;

class Problema3 {
	static int hours = 3600;
	static int minutes = 60;
	static int seconds = 1;

	public static void main(String[] args) {
		int input, h, m, s;
		Scanner sc = new Scanner(System.in);

		System.out.print("Segundos: ");
		input = sc.nextInt();

		h = input / hours;
		input %= hours;
		m = input / minutes;
		input %= minutes;
		s = input;

		System.out.println("Hours: " + h);
		System.out.println("Minutes: " + m);
		System.out.println("Seconds: " + s);
	}
}
