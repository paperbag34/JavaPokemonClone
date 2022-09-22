
public class Pokemon {

	String name = "";
	String type = "";
	String type2 = "";
	int hp = 0;
	boolean isActive = false;

	// int maxMoves = 4;

	public Pokemon(String name, String type,String type2, int hp, boolean isActive) {
		super();
		this.name = name;
		this.type = type;
		this.type2 = type2;
		this.hp = hp;
		this.isActive = isActive;
	}

	public Boolean hasFainted(Pokemon pokemon) {
		if (pokemon.getHp() <= 0) {
			return true;
		} else
			return false;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	

	public String getType2() {
		return type2;
	}

	public void setType2(String type2) {
		this.type2 = type2;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Pokemon [name=" + name + ", type=" + type + ", hp=" + hp + "]";
	}

}
