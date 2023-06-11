public class Trabajador {
	private String tipoDeTrabajador;
	private String nombre;
	private Cafeteria cafeteria;
	public Trabajador(String tipoDeTrabajador, String nombre) {
		this.tipoDeTrabajador = tipoDeTrabajador;
		this.nombre = nombre;
		this.cafeteria = null;
	}

	public Cafeteria getCafeteria() {
		return cafeteria;
	}

	public void setCafeteria(Cafeteria cafeteria) {
		this.cafeteria = cafeteria;
	}

	public String getTipoDeTrabajador() {
		return this.tipoDeTrabajador;
	}

	public void setTipoDeTrabajador(String tipoDeTrabajador) {
		this.tipoDeTrabajador = tipoDeTrabajador;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String toString() {
		String cafeteriaStr = (cafeteria != null) ? cafeteria.getNombre() : "Ninguna";
		return "Trabajador [tipoDeTrabajador=" + tipoDeTrabajador + ", nombre=" + nombre + ", cafeteria=" + cafeteriaStr + "]";
	}
}