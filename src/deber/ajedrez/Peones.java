package deber.ajedrez;

public class Peones extends Tablero{
	
	public String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Peones [color=" + color + "]";
	}
}
