package deber.ajedrez;

public class Reina extends Tablero{
	
	public String color;

	@Override
	public String toString() {
		return "Reina [color=" + color + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
