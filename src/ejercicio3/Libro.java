package ejercicio3;

public class Libro {
	int id;
	String titulo;
	String autor;
	int nropaginas;
	int nrodeisbn;
	public Libro() {
		super();
	}
	public Libro(int id, String titulo, String autor, int nropaginas, int nrodeisbn) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.nropaginas = nropaginas;
		this.nrodeisbn = nrodeisbn;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getNropaginas() {
		return nropaginas;
	}
	public void setNropaginas(int nropaginas) {
		this.nropaginas = nropaginas;
	}
	public int getNrodeisbn() {
		return nrodeisbn;
	}
	public void setNrodeisbn(int nrodeisbn) {
		this.nrodeisbn = nrodeisbn;
	}
	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", nropaginas=" + nropaginas
				+ ", nrodeisbn=" + nrodeisbn + "]";
	}
	
}
