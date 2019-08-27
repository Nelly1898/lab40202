package ejercicios;

public class libros {
	// Declaracion de atributos 
		String título;
		String autor;
		int nropaginas;
		int nroisbn;
		
		public libros() {
			super();
		}

		public libros(String título, String autor, int nropaginas, int nroisbn) {
			super();
			this.título = título;
			this.autor = autor;
			this.nropaginas = nropaginas;
			this.nroisbn = nroisbn;
		}

		public String getTítulo() {
			return título;
		}

		public void setTítulo(String título) {
			this.título = título;
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

		public int getNroisbn() {
			return nroisbn;
		}

		public void setNroisbn(int nroisbn) {
			this.nroisbn = nroisbn;
		}

		@Override
		public String toString() {
			return "libros [título=" + título + ", autor=" + autor + ", nropaginas=" + nropaginas + ", nroisbn="
					+ nroisbn + "]";
		}
		
}
