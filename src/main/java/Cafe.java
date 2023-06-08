public class Cafe {
	private double gramosDeCafe;
	private double mililitrosDeAgua;
	private String tamaño;
	private Cafeteria cafeteria;

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

	public Cafe(double gramosDeCafe, double mililitrosDeAgua, String tamaño) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}
}