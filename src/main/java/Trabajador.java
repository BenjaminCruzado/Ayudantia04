public class Trabajador {
	private String tipoDeTrabajador;
	private String nombre;
	private Cafeteria cafeteria;

	public String getTipoDeTrabajador() {
		return this.tipoDeTrabajador;
	}

	public void setTipoDeTrabajador(String tipoDeTrabajador) {
		this.tipoDeTrabajador = tipoDeTrabajador;
	}

	public Trabajador(String tipoDeTrabajador, String nombre) {
		throw new UnsupportedOperationException();
	}

	public String toString() {
		throw new UnsupportedOperationException();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}