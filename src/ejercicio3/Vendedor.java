package ejercicio3;

public class Vendedor {
	int id;
	String nombre;
	int sueldo_basico;
	int comision;
	public Vendedor() {
		super();
	}
	public Vendedor(int id, String nombre, int sueldo_basico, int comision) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.sueldo_basico = sueldo_basico;
		this.comision = comision;
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
	public int getSueldo_basico() {
		return sueldo_basico;
	}
	public void setSueldo_basico(int sueldo_basico) {
		this.sueldo_basico = sueldo_basico;
	}
	public int getComision() {
		return comision;
	}
	public void setComision(int comision) {
		this.comision = comision;
	}
	@Override
	public String toString() {
		return "Vendedor [id=" + id + ", nombre=" + nombre + ", sueldo_basico=" + sueldo_basico + ", comision="
				+ comision + "]";
	}
	
}
