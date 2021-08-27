package deber.ajedrez;

public class Rey extends Tablero{
	
	public String color;

	@Override
	public String toString() {
		return "Rey [color=" + color + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
