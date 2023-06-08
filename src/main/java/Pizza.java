import java.util.ArrayList;
public class Pizza {
	private String nombre;
	private String tamaño;
	private double precio;
	private ArrayList<String> ingredientes;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTamaño() {
		return this.tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public ArrayList<String> getIngredientes() {
		throw new UnsupportedOperationException();
	}

	public void setIngredientes(ArrayList<String> ingredientes) {
		throw new UnsupportedOperationException();
	}

	public Pizza(String nombre, String tamaño, double precio, ArrayList<String> ingredientes) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}
}