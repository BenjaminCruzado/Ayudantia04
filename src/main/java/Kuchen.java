public class Kuchen {
	private String nombre;
	private double gramosDeHarina;
	private String tipoDeFruta;
	private double gramosDeAzucar;
	private double precio;
	public Kuchen(String nombre, double gramosDeHarina, String tipoDeFruta, double gramosDeAzucar, double precio) {
		this.nombre = nombre;
		this.gramosDeHarina = gramosDeHarina;
		this.tipoDeFruta = tipoDeFruta;
		this.gramosDeAzucar = gramosDeAzucar;
		this.precio = precio;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getGramosDeHarina() {
		return this.gramosDeHarina;
	}

	public void setGramosDeHarina(double gramosDeHarina) {
		this.gramosDeHarina = gramosDeHarina;
	}

	public String getTipoDeFruta() {
		return this.tipoDeFruta;
	}

	public void setTipoDeFruta(String tipoDeFruta) {
		this.tipoDeFruta = tipoDeFruta;
	}

	public double getGramosDeAzucar() {
		return this.gramosDeAzucar;
	}

	public void setGramosDeAzucar(double gramosDeAzucar) {
		this.gramosDeAzucar = gramosDeAzucar;
	}

	public double getPrecio() {
		return this.precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String toString() {
		return "Kuchen [nombre=" + nombre + ", gramosDeHarina=" + gramosDeHarina + ", tipoDeFruta=" + tipoDeFruta
				+ ", gramosDeAzucar=" + gramosDeAzucar + ", precio=" + precio + "]";
	}
}