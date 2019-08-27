package ejercicios;

public class cintascdaudio {
			String título;
			String autor;
			String lugar;
			int duracion;
			public cintascdaudio() {
				super();
			}
			public cintascdaudio(String título, String autor, String lugar, int duracion) {
				super();
				this.título = título;
				this.autor = autor;
				this.lugar = lugar;
				this.duracion = duracion;
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
			public String getLugar() {
				return lugar;
			}
			public void setLugar(String lugar) {
				this.lugar = lugar;
			}
			public int getDuracion() {
				return duracion;
			}
			public void setDuracion(int duracion) {
				this.duracion = duracion;
			}
			@Override
			public String toString() {
				return "cintascdaudio [título=" + título + ", autor=" + autor + ", lugar=" + lugar + ", duracion="
						+ duracion + "]";
			}
			
}
