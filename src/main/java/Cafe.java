public class Cafe {
	private String nombre;
	private double gramosDeCafe;
	private double mililitrosDeAgua;
	private String tamaño;
	private double precio;
	private Cafeteria cafeteria;
	public Cafe(String nombre, double gramosDeCafe, double mililitrosDeAgua, String tamaño, double precio) {
		this.nombre = nombre;
		this.gramosDeCafe = gramosDeCafe;
		this.mililitrosDeAgua = mililitrosDeAgua;
		this.tamaño = tamaño;
		this.precio = precio;
		this.cafeteria = null;
	}

	public double getGramosDeCafe() {
		return this.gramosDeCafe;
	}

	public void setGramosDeCafe(double gramosDeCafe) {
		this.gramosDeCafe = gramosDeCafe;
	}

	public double getMililitrosDeAgua() {
		return this.mililitrosDeAgua;
	}

	public void setMililitrosDeAgua(double mililitrosDeAgua) {
		this.mililitrosDeAgua = mililitrosDeAgua;
	}

	public String getTamaño() {
		return this.tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public Cafeteria getCafeteria() {
		return this.cafeteria;
	}
	public void setCafeteria (Cafeteria cafeteria) {
		this.cafeteria = cafeteria;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		return "Cafe [nombre=" + nombre + ", gramosDeCafe=" + gramosDeCafe + ", mililitrosDeAgua=" + mililitrosDeAgua
				+ ", tamaño=" + tamaño + ", precio=" + precio + "]";
	}
}