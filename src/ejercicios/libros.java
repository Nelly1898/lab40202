package ejercicios;

public class libros {
	// Declaracion de atributos 
		String t�tulo;
		String autor;
		int nropaginas;
		int nroisbn;
		
		public libros() {
			super();
		}

		public libros(String t�tulo, String autor, int nropaginas, int nroisbn) {
			super();
			this.t�tulo = t�tulo;
			this.autor = autor;
			this.nropaginas = nropaginas;
			this.nroisbn = nroisbn;
		}

		public String getT�tulo() {
			return t�tulo;
		}

		public void setT�tulo(String t�tulo) {
			this.t�tulo = t�tulo;
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
			return "libros [t�tulo=" + t�tulo + ", autor=" + autor + ", nropaginas=" + nropaginas + ", nroisbn="
					+ nroisbn + "]";
		}
		
}
