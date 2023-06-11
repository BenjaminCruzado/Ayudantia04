import java.util.ArrayList;
public class Pizza {
	private String nombre;
	private String tamaño;
	private double precio;
	private ArrayList<String> ingredientes;
	public Pizza(String nombre, String tamaño, double precio, ArrayList<String> ingredientes) {
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.precio = precio;
		this.ingredientes = ingredientes;
	}
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

	public ArrayList<String> getIngredientes() {
		return this.ingredientes;
	}

	public void setIngredientes(ArrayList<String> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String toString() {
		return "Pizza [nombre=" + nombre + ", tamaño=" + tamaño + ", precio=" + precio + ", ingredientes=" + ingredientes
				+ "]";
	}
}