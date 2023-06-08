public class Kuchen {
	private String nombre;
	private double gramosDeHarina;
	private String tipoDeFruta;
	private double gramosDeAzucar;

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

	public Kuchen(String nombre, double gramosDeHarina, String tipoDeFruta, double gramosDeAzucar) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}
}