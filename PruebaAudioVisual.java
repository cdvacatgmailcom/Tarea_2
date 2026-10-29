
import uni1a.*;

public class PruebaAudioVisual {
	public static void main(String[] args) {
        
        // Crear instancias de las subclases
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];
        contenidos[0] = new Pelicula("Avatar", 125, "Accion", "20th Century Studios","Jake Sully");
        contenidos[1] = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        contenidos[2] = new Documental("Cosmos", 45, "Science", "Astronomy","Carl Sagan");
        contenidos[3] = new Sketch("DerBez en Cuando", 50, "Comedy", "XHDRBZ");
        contenidos[4] = new NovelaDeTv("Teresa", 40, "Romance", 152);
        
        
        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}