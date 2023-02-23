package ej7_5;

import java.util.Scanner;

public class OrdenarArray {

	static Scanner l = new Scanner(System.in);

	public static void main(String[] args) {
		char menu;
		do {
			lector();
			System.out.print("\n¿Quieres continuar? (s/n): ");
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
		
		int[] arrayog = new int[n];
		for (int i=0; i<arrayog.length;i++) {
			arrayog[i] = array[i];
		}
		
		int menu;
		System.out.println("\nElige el algoritmo: ");
		System.out.println("1. Insercion directa");
		System.out.println("2. Seleccion Directa");
		System.out.println("3. Intercambio directo");
		System.out.print("Seleccion: ");
		menu=l.nextInt(); l.nextLine();
		switch(menu) {
		case 1:
			Insercion(array);
			break;
		case 2:
			Seleccion(array);
			break;
		case 3:
			Intercambio(array);
			break;
		}
		
		System.out.print("\nARRAY ORIGINAL: [");
		for (int i = 0; i < arrayog.length; i++) {
			System.out.print(arrayog[i]);
			if (i < arrayog.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
		
		
		System.out.print("ARRAY ORDENADO: [");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static void Intercambio(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}
	}

	public static void Seleccion(int[] array) {
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
	
	public static void Insercion(int[] array) {
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
