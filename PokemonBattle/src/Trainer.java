
public class Trainer {
	String name = "";
	String trainerId = "";
	int badgeCount = 0;
	int pokedexCount = 0;
	int pokeBucks = 0;

	public Trainer(String name, String trainerId, int badgeCount, int pokedexCount, int pokeBucks) {
		this.name = name;
		this.trainerId = trainerId;
		this.badgeCount = badgeCount;
		this.pokedexCount = pokedexCount;
		this.pokeBucks = pokeBucks;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTrainerId() {
		return trainerId;
	}

	public void setTrainerId(String trainerId) {
		this.trainerId = trainerId;
	}

	public int getBadgeCount() {
		return badgeCount;
	}

	public void setBadgeCount(int badgeCount) {
		this.badgeCount = badgeCount;
	}

	public int getPokedexCount() {
		return pokedexCount;
	}

	public void setPokedexCount(int pokedexCount) {
		this.pokedexCount = pokedexCount;
	}

	public int getPokeBucks() {
		return pokeBucks;
	}

	public void setPokeBucks(int pokeBucks) {
		this.pokeBucks = pokeBucks;
	}
}
