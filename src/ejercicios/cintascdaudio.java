package ejercicios;

public class cintascdaudio {
			String t�tulo;
			String autor;
			String lugar;
			int duracion;
			public cintascdaudio() {
				super();
			}
			public cintascdaudio(String t�tulo, String autor, String lugar, int duracion) {
				super();
				this.t�tulo = t�tulo;
				this.autor = autor;
				this.lugar = lugar;
				this.duracion = duracion;
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
				return "cintascdaudio [t�tulo=" + t�tulo + ", autor=" + autor + ", lugar=" + lugar + ", duracion="
						+ duracion + "]";
			}
			
}
