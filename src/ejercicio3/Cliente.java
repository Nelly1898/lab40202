package ejercicio3;

public class Cliente {
	int id;
	String nombre;
	String tipo; 
	int calificacion;
	int limite_credito;
	public Cliente() {
		super();
	}
	public Cliente(int id, String nombre, String tipo, int calificacion, int limite_credito) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.calificacion = calificacion;
		this.limite_credito = limite_credito;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}
	public int getLimite_credito() {
		return limite_credito;
	}
	public void setLimite_credito(int limite_credito) {
		this.limite_credito = limite_credito;
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", calificacion=" + calificacion
				+ ", limite_credito=" + limite_credito + "]";
	}
	
 
}
