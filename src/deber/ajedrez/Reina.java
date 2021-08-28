package deber.ajedrez;

public class Reina extends PiezasDeTablero{
	
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
