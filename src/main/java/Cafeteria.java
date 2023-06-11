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
	public Cafeteria(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.redesSociales = new ArrayList<>();
		this.cafes = new ArrayList<>();
		this.kuchenes = new ArrayList<>();
		this.pizzas = new ArrayList<>();
		this.trabajadores = new ArrayList<>();
		this.clientes = new ArrayList<>();
	}
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
		return redesSociales;
	}

	public void setRedesSociales(ArrayList<String> redesSociales) {
		this.redesSociales = redesSociales;
	}

	public ArrayList<Cafe> getListaDeCafes() {
		return cafes;
	}

	public void setListaDeCafes(ArrayList<Cafe> listaDeCafes) {
		this.cafes = listaDeCafes;
	}

	public ArrayList<Kuchen> getListaDeKuchenes() {
		return kuchenes;
	}

	public void setListaDeKuchenes(ArrayList<Kuchen> listaDeKuchenes) {
		this.kuchenes = kuchenes;
	}

	public ArrayList<Pizza> getListaDePizzas() {
		return pizzas;
	}

	public void setLisraDePizza(ArrayList<Pizza> listaDePizzas) {
		this.pizzas = pizzas;
	}

	public ArrayList<Trabajador> getTrabajadores() {
		return trabajadores;
	}

	public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
		this.trabajadores = trabajadores;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public void agregarRedSocial(String redSocial){
		this.redesSociales.add(redSocial);
	}
	public void eliminarRedSocial(String redSocial){
		this.redesSociales.remove(redSocial);
	}

	public void agregarCafe(Cafe cafe){
		this.cafes.add(cafe);
	}

	public void eliminarCafe(Cafe cafe){
		this.cafes.remove(cafe);
	}

	public Cafe buscarCafePorTamano(String tamaño) {
		for (Cafe cafe : cafes) {
			if (cafe.getTamaño() == tamaño) {
				return cafe;
			}
		}
		return null;
	}

	public void agregarKuchen(Kuchen kuchen){
		this.kuchenes.add(kuchen);
	}

	public void eliminarKuchen(Kuchen kuchen){
		this.kuchenes.remove(kuchen);
	}

	public Kuchen buscarKuchenPorNombre(String nombre) {
		for (Kuchen kuchen : kuchenes) {
			if (kuchen.getNombre() == nombre) {
				return kuchen;
			}
		}
		return null;
	}
	public void agregarPizza(Pizza pizza) {
		this.pizzas.add(pizza);
	}

	public void eliminarPizza(Pizza pizza) {
		this.pizzas.remove(pizza);
	}

	public Pizza buscarPizzaPorPrecio(double precio) {
		for (Pizza pizza : pizzas) {
			if (pizza.getPrecio() == precio) {
				return pizza;
			}
		}
		return null;
	}

	public void agregarTrabajador(Trabajador trabajador) {
		this.trabajadores.add(trabajador);
	}

	public String toString() {
		return "Cafeteria [nombre=" + nombre + ", direccion=" + direccion + "]";
	}
}