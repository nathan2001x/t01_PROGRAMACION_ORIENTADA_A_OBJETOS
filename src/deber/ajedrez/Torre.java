package deber.ajedrez;

public class Torre extends Tablero{
	
	public String color;

	@Override
	public String toString() {
		return "Torre [color=" + color + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
