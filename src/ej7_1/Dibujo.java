package ej7_1;

public class Dibujo {
	private String[] dibujos = {
			""
			+ "  +---+\n"
			+ "      |\n"
			+ "      |\n"
			+ "      |\n"
			+ "      |\n"
			+ "      |\n", 
			""
			+ "  +---+\n"
			+ "  |   |\n"
			+ "      |\n"
			+ "      |\n"
			+ "      |\n"
			+ "      |\n", 
			""
			+ "  +---+\n"
			+ "  |   |\n"
			+ "  O   |\n"
			+ "      |\n"
			+ "      |\n"
			+ "      |\n", 
			""
			+ "  +---+\n"
			+ "  |   |\n"
			+ "  O   |\n"
			+ "  |   |\n"
			+ "      |\n"
			+ "      |\n", 
			""
			+ "  +---+\n"
			+ "  |   |\n"
			+ "  O   |\n"
			+ " /|   |\n"
			+ "      |\n"
			+ "      |\n", 
			""
			+ "  +---+\n"
			+ "  |   |\n"
			+ "  O   |\n"
			+ " /|\\  |\n"
			+ "      |\n"
			+ "      |\n", 
			""
			+ "  +---+\n"
			+ "  |   |\n"
			+ "  O   |\n"
			+ " /|\\  |\n"
			+ " /    |\n"
			+ "      |\n", 
			""
			+ "  +---+\n"
			+ "  |   |\n"
			+ "  O   |\n"
			+ " /|\\  |\n"
			+ " / \\  |\n"
			+ "      |\n"
			};
	
	public Dibujo() {
		
	}
	
	public String getDibujo(int i) {
		return dibujos[i];
	}
}
