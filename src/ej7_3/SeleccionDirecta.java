package ej7_3;

import java.util.Scanner;

public class SeleccionDirecta {

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
		for (int i = 0; i < array.length - 1; i++) {
			int minimo = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[minimo]) {
					minimo = j;
				}
			}
			int temp = array[i];
			array[i] = array[minimo];
			array[minimo] = temp;
		}
	}
}
