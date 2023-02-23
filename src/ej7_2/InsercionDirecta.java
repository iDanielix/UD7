package ej7_2;

import java.util.Scanner;

public class InsercionDirecta {

	static Scanner l = new Scanner(System.in);

	public static void main(String[] args) {
		char menu;
		do {
			lector();
			System.out.print("¿Quieres continuar? (s/n): ");
			menu = l.nextLine().toLowerCase().charAt(0);
		} while (menu == 's');
	}

	public static void lector() {
		System.out.print("Longitud de array: ");
		int n = l.nextInt();
		l.nextLine();
		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			System.out.print("Numero " + (i + 1) + ": ");
			array[i] = l.nextInt();
			l.nextLine();
		}
		System.out.print("ARRAY ORIGINAL: [");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		algoritmo(array);
		System.out.print("ARRAY ORDENADO: [");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static void algoritmo(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int valor = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > valor) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = valor;

		}

	}
}
