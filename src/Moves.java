import java.util.Random;

public class Moves {
	String name = "";
	String type = "";
	String category = "";
	int pp = 0;
	int power = 0;
	double accuracy = 0.0;
	static int doDamage = 0;
	static Random rand = new Random();

	public Moves(String name, String type, String category, int pp, int power, double accuracy) {
		super();
		this.name = name;
		this.type = type;
		this.category = category;
		this.pp = pp;
		this.power = power;
		this.accuracy = accuracy;
	}

	//Gives a random damage within a range of the lowerbound and upperbound
	public static int calculateDamage(int lowerbound, int upperbound) {
		doDamage = rand.nextInt(upperbound - lowerbound) + lowerbound;
		return doDamage;
	}

	// complete move, works as intended
	//starter move
	public static void scratch(Pokemon user, Pokemon enemy, Moves move) {
		System.out.println(user.getName() + " Used " + move.getName() + " on " + enemy.getName());
		if (move.getPp() > 0) {
			enemy.setHp(enemy.getHp() - calculateDamage(4, 7));
			move.setPp(move.getPp() - 1);
		}
	}

	public void growl() {

	}

	//Moves with types
	public void waterGun(Pokemon user, Pokemon enemy, Moves move) {
		System.out.println(user.getName() + " Used " + move.getName() + " on " + enemy.getName());
		if (move.getPp() > 0) {
			if (enemy.getType() == "Fire") {
				enemy.setHp(enemy.getHp() - calculateDamage(8, 10));
				System.out.println("That was Super Effective!");
			} else if (enemy.getType() == "Grass") {
				enemy.setHp(enemy.getHp() - calculateDamage(4, 6));
				System.out.println("That wasnt very Effective!");
			} else {
				enemy.setHp(enemy.getHp() - calculateDamage(5, 7));
			}
			move.setPp(move.getPp() - 1);
		}
	}

	public void flameThrower(Pokemon user, Pokemon enemy, Moves move) {
		System.out.println(user.getName() + " Used " + move.getName() + " on " + enemy.getName());
		if (move.getPp() > 0) {
			if (enemy.getType() == "Grass") {
				enemy.setHp(enemy.getHp() - calculateDamage(8, 10));
				System.out.println("That was Super Effective!");
			} else if (enemy.getType() == "Water") {
				enemy.setHp(enemy.getHp() - calculateDamage(4, 6));
				System.out.println("That wasnt very Effective!");
			} else {
				enemy.setHp(enemy.getHp() - calculateDamage(5, 7));
			}
			move.setPp(move.getPp() - 1);
		}
	}

	public static void vineWhip(Pokemon user, Pokemon enemy, Moves move) {
		System.out.println(user.getName() + " Used " + move.getName()  + " on " + enemy.getName());
		if (move.getPp() > 0) {
			if (enemy.getType() == "Water") {
				enemy.setHp(enemy.getHp() - calculateDamage(8, 10));
				System.out.println("That was Super Effective!");
			} else if (enemy.getType() == "Fire") {
				enemy.setHp(enemy.getHp() - calculateDamage(4, 6));
				System.out.println("That wasnt very Effective!");
			} else {
				enemy.setHp(enemy.getHp() - calculateDamage(5, 7));
			}
			move.setPp(move.getPp() - 1);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPp() {
		return pp;
	}

	public void setPp(int pp) {
		this.pp = pp;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public double getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(double accuracy) {
		this.accuracy = accuracy;
	}

	@Override
	public String toString() {
		return "Moves [name=" + name + ", type=" + type + ", category=" + category + ", pp=" + pp + ", power=" + power
				+ ", accuracy=" + accuracy + "]";
	}

}
