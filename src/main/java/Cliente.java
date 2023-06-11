public class Cliente {
	private String nombre;
	private double dinero;
	public Cliente(String nombre, double dinero) {
		this.nombre = nombre;
		this.dinero = dinero;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDinero() {
		return this.dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public void comprarCafe(Cafe cafe) {
		if (dinero >= cafe.getPrecio()) {
			dinero -= cafe.getPrecio();
			System.out.println("El cliente " + nombre + " ha comprado un café: " + cafe.getNombre());
		} else {
			System.out.println("El cliente " + nombre + " no tiene suficiente dinero en la cuenta para comprar el café.");
		}
	}

	public void comprarPizza(Pizza pizza) {
		if (dinero >= pizza.getPrecio()) {
			dinero -= pizza.getPrecio();
			System.out.println("El cliente " + nombre + " ha comprado una pizza: " + pizza.getNombre());
		} else {
			System.out.println("El cliente " + nombre + " no tiene suficiente dinero en la cuenta para comprar la pizza.");
		}
	}

	public void comprarKuchen(Kuchen kuchen) {
		if (dinero >= kuchen.getPrecio()) {
			dinero -= kuchen.getPrecio();
			System.out.println("El cliente " + nombre + " ha comprado un kuchen: " + kuchen.getNombre());
		} else {
			System.out.println("El cliente " + nombre + " no tiene suficiente dinero en la cuenta para comprar el kuchen.");
		}
	}
	public String toString() {
		return "Cliente [nombre=" + nombre + ", dinero=" + dinero + "]";
	}
}