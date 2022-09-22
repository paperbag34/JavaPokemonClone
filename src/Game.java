import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

	static Pokemon bulbasaur = new Pokemon("Bulbasaur", "Grass", "Poison", 50, false);
	static Pokemon charmander = new Pokemon("Charmander", "Fire", null, 50, false);
	static Pokemon squirtle = new Pokemon("Squritle", "Water", null, 50, false);
	static Trainer trainer = new Trainer("Red", "", 0, 0, 0);
	static Trainer enemytrainer = new Trainer("Blue", "", 0, 0, 0);

	static ArrayList<Pokemon> pokemonParty = new ArrayList<Pokemon>();
	static ArrayList<Pokemon> enemyParty = new ArrayList<Pokemon>();

	static ArrayList<Moves> pokemonMoves = new ArrayList<Moves>();
	static ArrayList<Moves> bulbasaurMoves = new ArrayList<Moves>();
	static ArrayList<Moves> charmanderMoves = new ArrayList<Moves>();
	static ArrayList<Moves> squirtleMoves = new ArrayList<Moves>();

	public static void main(String[] args) {
		boolean done = false;
		Object startingPokemon = null;
		Scanner scan = new Scanner(System.in);

		// moves for each pokemon
		addAllMoves(pokemonMoves);
		addBulbasaurMoves(bulbasaurMoves, pokemonMoves);
		addCharmanderMoves(charmanderMoves, pokemonMoves);
		addSquirtleMoves(squirtleMoves, pokemonMoves);

		while (!done) {
			System.out.println("Welcome to the world of pokemon!");
			System.out.println("Please pick a starter. Bulbasaur,Charmander, or Squirtle.");
			pokemonParty.add(selectStarter());
			enemyParty.add(charmander);
			System.out.println("You chose " + pokemonParty.get(0).getName());
			// System.out.println(pokemonParty.get(0).getName());
			pokemonBattle(trainer, enemytrainer, pokemonParty, enemyParty);
			done = true;
		}

	}

	private static void pokemonBattle(Trainer trainer, Trainer enemyTrainer, ArrayList<Pokemon> pokemonParty,
			ArrayList<Pokemon> enemyParty) {
		Scanner scan = new Scanner(System.in);
		boolean done = false;

		while (!done) {
			System.out.println(trainer.getName() + " Has begun a battle with " + enemyTrainer.getName());
			System.out.println(trainer.getName() + " sent out " + pokemonParty.get(0).getName());
			pokemonParty.get(0).setActive(true);
			System.out.println(enemyTrainer.getName() + " sent out " + enemyParty.get(0).getName());
			enemyParty.get(0).setActive(true);
			gatherCombatResponse();
			done = true;
		}
	}

	

	private static void gatherCombatResponse() {
		// TODO Auto-generated method stub
		System.out.println("What would you like to do?");
		System.out.println("Fight");
		System.out.println("Check Pokemon");
		System.out.println("Item Bag");
		System.out.println("Run");
		
		try {
			Scanner scan = new Scanner(System.in);
			String input = scan.nextLine();
			if (input.equals("fight")) {
			
			}
			if (input.equals("check pokemon")) {
				
			}
			if (input.equals("item bag")) {
				
			}
			if (input.equals("run")) {
				
			}
			}
		catch(Exception e) {
			
		}
				
		
	}

	@SuppressWarnings("unlikely-arg-type")
	private static Pokemon selectStarter() {
		boolean pick = false;
		while (!pick) {
			try {
				Scanner scan = new Scanner(System.in);
				String input = scan.nextLine();
				if (input.equals("bulbasaur")) {
					pick = true;
					return Game.bulbasaur;
				}
				if (input.equals("charmander")) {
					pick = true;
					return Game.charmander;
				}
				if (input.equals("squirtle")) {
					pick = true;
					return Game.squirtle;
				}
			} catch(Exception e) {
				System.out.println("I dont recognize that one, Can you try again?");
			}
		}
		return null;
	}

	public static void addAllMoves(ArrayList<Moves> pokemonMoves) {
		// This function will fill the game with all of the moves
		pokemonMoves.add(new Moves("Pound", "Normal", "Physical", 35, 40, 100));
		pokemonMoves.add(new Moves("Scratch", "Normal", "Physical", 35, 40, 100));
		pokemonMoves.add(new Moves("Water Gun", "Water", "Physical", 35, 40, 100));
		pokemonMoves.add(new Moves("Flame Thrower", "Fire", "Physical", 35, 40, 100));
		pokemonMoves.add(new Moves("Vine Whip", "Grass", "Physical", 35, 40, 100));
	}

	public static void addBulbasaurMoves(ArrayList<Moves> bulbasaurMoves, ArrayList<Moves> pokemonMoves) {
		// scratch
		bulbasaurMoves.add(pokemonMoves.get(0));
		// vinewhip
		bulbasaurMoves.add(pokemonMoves.get(4));
	}

	public static void addCharmanderMoves(ArrayList<Moves> charmanderMoves, ArrayList<Moves> pokemonMoves) {
		// scratch
		charmanderMoves.add(pokemonMoves.get(0));
		// flamethrower
		charmanderMoves.add(pokemonMoves.get(3));
	}

	public static void addSquirtleMoves(ArrayList<Moves> squirtleMoves, ArrayList<Moves> pokemonMoves) {
		// scratch
		squirtleMoves.add(pokemonMoves.get(0));
		// vinewhip
		squirtleMoves.add(pokemonMoves.get(2));
	}

}
