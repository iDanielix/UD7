package ej7_1;

import java.util.Scanner;

public class ahorcado {

	static Scanner l = new Scanner(System.in);

	public static void main(String[] args) {
		int menu = 1;
		do {
			System.out.print("Elige una opcion:\n" + "1. Jugar en modo normal\n" + "2. Jugar en modo dificil\n"
					+ "3. Salir	\n" + "Seleccion: ");
			menu = l.nextInt();
			l.nextLine();
			System.out.println("");
			switch (menu) {
			case 1:
				juego(0);
				break;
			case 2:
				juego(1);
				break;
			}
		} while (menu != 3);

	}

	public static void juego(int dificultad) {
		// objetos que contienen la lista de palabras y los dibujos del ahorcado
		Dibujo dibujo = new Dibujo();
		Palabras lista = new Palabras();

		// array de caracteres con la palabra
		char[] palabraChars = lista.generarPalabra(dificultad).toLowerCase().toCharArray();
		// array vacio para ir guardando las letras de la palabra que se aciertan
		char[] chars = new char[palabraChars.length];

		// array y contador para guardar las letras usadas
		char[] letras = new char[30];
		int nIntroducidas = 0;
		// array y contador para guardar las letras usadas que no estan en la palabra
		char[] fallos = new char[30];
		int intentos = 0;

		// array para marcar la palabra como acertada y que acabe el juego
		boolean acertado = false;

		// bucles para que los arrays de caracteres tengan un valor por defecto, para
		// cuando se impriman por pantalla
		for (int i = 0; i < chars.length; i++) {
			chars[i] = '0';
		}
		for (int i = 0; i < letras.length; i++) {
			letras[i] = '0';
		}
		for (int i = 0; i < fallos.length; i++) {
			fallos[i] = '0';
		}

		// bucle que no acaba hasta que el usuario haya acertado o que se acaben los
		// intentos
		do {
			char letra;

			// se muestran todos los datos por pantalla
			System.out.println("Intentos Fallados: " + intentos);

			System.out.print("PALABRA : [");
			// con un bucle se imprimen los arrays de caracteres. Si esta marcado como 0 no
			// tiene valor y se pone un guion.
			// si el caracter tiene valor se imprime
			for (int i = 0; i < chars.length; i++) {
				if (chars[i] == '0') {
					System.out.print("-");
				} else {
					System.out.print(chars[i]);
				}
				if (i < chars.length - 1) {
					System.out.print(",");
				}
			}
			System.out.println("]");

			// dos bucles iguales que el anterior
			System.out.print("LETRAS USADAS : [");
			for (int i = 0; i < letras.length; i++) {
				if (letras[i] == '0') {
					System.out.print("");

				} else {
					System.out.print(letras[i]);
					if (i < letras.length - 1) {
						System.out.print(",");
					}
				}

			}
			System.out.println("]");

			System.out.print("FALLOS : [");
			for (int i = 0; i < fallos.length; i++) {
				if (fallos[i] == '0') {
					System.out.print("");

				} else {
					System.out.print(fallos[i]);
					if (i < fallos.length - 1) {
						System.out.print(",");
					}
				}
			}

			System.out.println("]");

			// syso que usa el metodo de los dibujos junto al contador de intentos
			System.out.println(dibujo.getDibujo(intentos));

			// lector de letra
			System.out.print("Letra: ");
			letra = l.nextLine().toLowerCase().charAt(0);

			// comprobacion de que la letra no haya sido usada
			boolean letraIntroducida = false;
			for (int i = 0; i < letras.length; i++) {
				if (letras[i] == letra) {
					letraIntroducida = true;
				}
			}

			// bucle para que si la letra esta repetida la vuelva a preguntar hasta que no lo sea
			while (letraIntroducida == true) {
				System.out.println("ERROR - Letra ya introducida");
				System.out.print("Letra: ");
				letra = l.nextLine().toLowerCase().charAt(0);
				letraIntroducida = false;
				for (int i = 0; i < letras.length; i++) {
					if (letras[i] == letra) {
						letraIntroducida = true;
					}
				}
			}

			boolean letraAcertada = false;

			// se comprueba que la letra introducida por el usuario este en la palabra
			for (int i = 0; i < palabraChars.length; i++) {
				if (palabraChars[i] == letra) {
					letraAcertada = true;
				}
			}

			// si ha fallado se coloca la letra en el array de caracteres usados y
			// en el de caracteres que no estan en la palabra, y se aumentan los intentos
			if (letraAcertada == false) {
				letras[nIntroducidas] = letra;
				fallos[intentos] = letra;
				intentos++;
				nIntroducidas++;

			}

			// si la letra esta en la palabra, en el array de caracteres vacios se rellenan los
			// espacios de las letras acertadas, y se coloca la letra en el array de
			// caracteres usados
			else if (letraAcertada == true) {
				letras[nIntroducidas] = letra;
				nIntroducidas++;
				for (int i = 0; i < palabraChars.length; i++) {
					if (palabraChars[i] == letra) {
						chars[i] = letra;
					}
				}

			}

			// con un bucle se comprueba que la palabra este acertada completamente
			acertado = true;
			for (int i = 0; i < palabraChars.length; i++) {
				if (palabraChars[i] != chars[i]) {
					acertado = false;
				}
			}

			System.out.println("");

		} while ((intentos < 7) && (acertado == false));

		//se imprimen los datos finales dependiendo de las condiciones en la que se acabo la partida
		System.out.println(dibujo.getDibujo(intentos));
		System.out.print("PALABRA: [");
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '0') {
				System.out.print("-");
			} else {
				System.out.print(chars[i]);
			}
			if (i < chars.length - 1 && acertado == false) {
				System.out.print(",");
			}
		}
		System.out.println("]");
		if (acertado == true) {
			System.out.println("Has ganado!");
		} else if (intentos >= 7) {
			System.out.println("Has perdido.");
			System.out.print("La palabra era: ");
			for (int i = 0; i < palabraChars.length; i++) {
				System.out.print(palabraChars[i]);
			}
			;
			System.out.println("");

		}
		System.out.println("");

	}

}
