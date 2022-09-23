import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import app.Items;



public class GameMechanics {

	static void pokemonBattle(Trainer trainer, Trainer enemyTrainer, ArrayList<Pokemon> pokemonParty,
			ArrayList<Pokemon> enemyParty) {
		
		readFromPokemonParty("PokemonParty.json");
		Scanner scan = new Scanner(System.in);
		boolean done = false;

		while (!done) {
			System.out.println(trainer.getName() + " Has begun a battle with " + enemyTrainer.getName());
			System.out.println(trainer.getName() + " sent out " + pokemonParty.get(0).getName());
			readFromPokemonMoveList("Pokemon0Moves.json");
			done = true;
		}
	}

	@SuppressWarnings("unlikely-arg-type")
	Pokemon selectStarter() {
		boolean pick = false;
		while (!pick) {
			try {
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine();
				if (input.equals("bulbasaur") || input.equals("Bulbasaur")) {
					pick = true;
					return Game.bulbasaur;
				}
				if (input.equals("charmander") || input.equals("Charmander")) {
					pick = true;
					return Game.charmander;
				}
				if (input.equals("squirtle") || input.equals("Squirtle")) {
					pick = true;
					return Game.squirtle;
				}
			} catch (Exception e) {
				System.out.println("I dont recognize that one, Can you try again?");
			}
		}
		return null;
	}
	
	
	
	private static ArrayList<Pokemon> readFromPokemonParty(String filename) {
		ArrayList<Pokemon> items = new ArrayList<Pokemon>();
		try {
			// open the file to read
			File file = new File(filename);
			Scanner s = new Scanner(file);

			while (s.hasNext()) {
				String json = s.nextLine();

				ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
				Pokemon item = objectMapper.readValue(json, Pokemon.class);
				Game.pokemonParty.add(item);
			}
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return items;
	}

	private static ArrayList<Moves> readFromPokemonMoveList(String filename) {
		ArrayList<Moves> items = new ArrayList<Moves>();
		try {
			// open the file to read
			File file = new File(filename);
			Scanner s = new Scanner(file);

			while (s.hasNext()) {
				String json = s.nextLine();

				ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
				Moves item = objectMapper.readValue(json, Moves.class);
				Game.activePokemonMoves.add(item);
			}
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return items;
	}
	
	public static void saveToPokemonParty(String filename, Pokemon item, boolean append) {
		PrintWriter pw;
		try {
			File file = new File(filename);
			FileWriter fw = new FileWriter(file, append);
			pw = new PrintWriter(fw);

			// write car as json
			ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writeValueAsString(item);
			pw.println(json);

			// cleanup
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void saveToPokemonMoveList(String filename, Moves item, boolean append) {
		PrintWriter pw;
		try {
			File file = new File(filename);
			FileWriter fw = new FileWriter(file, append);
			pw = new PrintWriter(fw);

			// write car as json
			ObjectMapper objectMapper = new ObjectMapper();
			String json = objectMapper.writeValueAsString(item);
			pw.println(json);

			// cleanup
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public void addAllMoves(ArrayList<Moves> pokemonMoves) {
		// This function will fill the game with all of the moves
		// String name, String type, String category, int pp, int power, double accuracy
		pokemonMoves.add(new Moves("Pound", "Normal", "Physical", 35, 40, 100));
		pokemonMoves.add(new Moves("Scratch", "Normal", "Physical", 35, 40, 100));
		pokemonMoves.add(new Moves("Water Gun", "Water", "Physical", 35, 40, 100));
		pokemonMoves.add(new Moves("Flame Thrower", "Fire", "Physical", 35, 40, 100));
		pokemonMoves.add(new Moves("Vine Whip", "Grass", "Physical", 35, 40, 100));
	}

}
