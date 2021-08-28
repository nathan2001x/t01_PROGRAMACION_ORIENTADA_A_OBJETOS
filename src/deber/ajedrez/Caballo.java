package deber.ajedrez;

public class Caballo extends PiezasDeTablero{
	
	public String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Caballo [color=" + color + "]";
	}
}
