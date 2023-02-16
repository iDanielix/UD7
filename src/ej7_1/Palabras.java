package ej7_1;

import java.util.Random;

public class Palabras {
	
	//dos arrays con strings de palabras para el juego
	private String[] listaNormal = { "Triangulo", "Joven", "Esquizofrenia", "Bienvenido", "Gorila", "Puntos", "Detective",
			"Tubos", "Maullido", "Empacar", "Pedalear", "Mediano", "Bucear", "Mala", "Criticar", "Lunar" };

	private String[] listaDificil = { "Esternocleidomastoideo", "Otorrinolaringologo", "Idiosincrasia", "Desoxirribonucleico",
			"Paralelepipedo", "Electroencefalografista", "Hipopotomonstrosesquipedaliofobia",
			"Pneumonoultramicroscopicsilicovolcanoconiosis", "Pseudopseudohipoparatiroidismo",
			"Antidesestablecimiento" };


	public Palabras() {
	}


	//metodo que devuelve de la lista de palabras una palabra aleatoria 
	public String generarPalabra(int n) {
		if (n == 0) {
			Random rmd = new Random();
			int i = rmd.nextInt(0, listaNormal.length);
			return listaNormal[i];
		} else {
			Random rmd = new Random();
			int i = rmd.nextInt(0, listaDificil.length);
			return listaDificil[i];
		}
	}

}
