/**
 * Class Sketch
 */
package uni1a;

// Subclase Sketch que extiende de ContenidoAudiovisual
public class Sketch extends ContenidoAudiovisual {
    private String estudio;
    private Actor actor;
    
    public Sketch(String titulo, int duracionEnMinutos, String genero, String estudio){
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Sketch:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + getEstudio());
        System.out.println();
    }
}