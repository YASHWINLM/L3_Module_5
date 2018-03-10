package other;

public class Minion {
	String name;
	int eyes;
	String color;
	String master;

	public Minion(String name, int eyes, String color, String master) {
		this.name = name;
		this.eyes = eyes;
		this.color = color;

	}

	public String getName() {

		return name;
	}

	public int getEyes() {

		return eyes;
	}

	public String getcolor() {

		return color;
	}

	public Object getMaster() {
		// TODO Auto-generated method stub
		return master;
	}

	public void setMaster(String string) {
		this.master = master;

	}
}
