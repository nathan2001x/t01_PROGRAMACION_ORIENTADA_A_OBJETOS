package deber.ajedrez;

public class Alfil extends PiezasDeTablero{
	
	public String color;

	@Override
	public String toString() {
		return "Alfil [color=" + color + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
