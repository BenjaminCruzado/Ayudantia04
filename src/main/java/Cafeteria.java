import java.util.ArrayList;

public class Cafeteria {
	private String nombre;
	private String direccion;
	private ArrayList<String> redesSociales;
	private ArrayList<Kuchen> kuchenes = new ArrayList<Kuchen>();
	private ArrayList<Cafe> cafes = new ArrayList<Cafe>();
	private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	private ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return this.direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<String> getRedesSociales() {
		throw new UnsupportedOperationException();
	}

	public void setRedesSociales(ArrayList<String> redesSociales) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Cafe> getListaDeCafes() {
		throw new UnsupportedOperationException();
	}

	public void setListaDeCafes(ArrayList<Cafe> listaDeCafes) {
		throw new UnsupportedOperationException();
	}

	public Cafeteria(String nombre, String direccion) {
		throw new UnsupportedOperationException();
	}

	public void agregarCafe(Cafe cafe) {
		throw new UnsupportedOperationException();
	}

	public void agregarRedSocial(String redSocial) {
		throw new UnsupportedOperationException();
	}

	public void eliminarCafe(Cafe cafe) {
		throw new UnsupportedOperationException();
	}

	public Cafe buscarCafePorTamaño(String nombre) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Kuchen> getListaDeKuchenes() {
		throw new UnsupportedOperationException();
	}

	public void setListaDeKuchenes(ArrayList<Kuchen> listaDeKuchenes) {
		throw new UnsupportedOperationException();
	}

	public void agregarKuchen(Kuchen kuchen) {
		throw new UnsupportedOperationException();
	}

	public void eliminarKuchen(Kuchen kuchen) {
		throw new UnsupportedOperationException();
	}

	public Kuchen buscarKuchenPorNombre(String nombre) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Pizza> getListaDePizzas() {
		throw new UnsupportedOperationException();
	}

	public void setLisraDePizza(ArrayList<Pizza> listaDePizzas) {
		throw new UnsupportedOperationException();
	}

	public void agregarPizza(Pizza pizza) {
		throw new UnsupportedOperationException();
	}

	public void eliminarPizza(Pizza pizza) {
		throw new UnsupportedOperationException();
	}

	public Pizza buscarPizzaPorPrecio(double precio) {
		throw new UnsupportedOperationException();
	}

	public void agregarTrabajadores(Trabajador trabajador) {
		throw new UnsupportedOperationException();
	}
}