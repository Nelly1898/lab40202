package ejercicios;

public class cintas {
	// Declaracion de atributos 
			String t�tulo;
			String director;
			String actores;
			int duracion;
			public cintas() {
				super();
			}
			public cintas(String t�tulo, String director, String actores, int duracion) {
				super();
				this.t�tulo = t�tulo;
				this.director = director;
				this.actores = actores;
				this.duracion = duracion;
			}
			public String getT�tulo() {
				return t�tulo;
			}
			public void setT�tulo(String t�tulo) {
				this.t�tulo = t�tulo;
			}
			public String getDirector() {
				return director;
			}
			public void setDirector(String director) {
				this.director = director;
			}
			public String getActores() {
				return actores;
			}
			public void setActores(String actores) {
				this.actores = actores;
			}
			public int getDuracion() {
				return duracion;
			}
			public void setDuracion(int duracion) {
				this.duracion = duracion;
			}
			@Override
			public String toString() {
				return "cintas [t�tulo=" + t�tulo + ", director=" + director + ", actores=" + actores + ", duracion="
						+ duracion + "]";
			}
			
}
