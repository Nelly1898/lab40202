package ejercicios;

public class cintas {
	// Declaracion de atributos 
			String título;
			String director;
			String actores;
			int duracion;
			public cintas() {
				super();
			}
			public cintas(String título, String director, String actores, int duracion) {
				super();
				this.título = título;
				this.director = director;
				this.actores = actores;
				this.duracion = duracion;
			}
			public String getTítulo() {
				return título;
			}
			public void setTítulo(String título) {
				this.título = título;
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
				return "cintas [título=" + título + ", director=" + director + ", actores=" + actores + ", duracion="
						+ duracion + "]";
			}
			
}
