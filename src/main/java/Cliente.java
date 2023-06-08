public class Cliente {
	private String nombre;
	private double cuenta;
	private double dinero;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCuenta() {
		return this.cuenta;
	}

	public void setCuenta(double cuente) {
		this.cuenta = cuente;
	}

	public double getDinero() {
		return this.dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public void comprarCafe(Cafe cafe) {
		throw new UnsupportedOperationException();
	}

	public void comprarPizza(Pizza pizza) {
		throw new UnsupportedOperationException();
	}

	public void comprarKuchen(Kuchen kuchen) {
		throw new UnsupportedOperationException();
	}
}