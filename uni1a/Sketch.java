/**
 * Class Sketch
 */
package uni1a;

// Subclase Sketch que extiende de ContenidoAudiovisual
public class Sketch extends ContenidoAudiovisual {
    private String categoria;
        
    public Sketch(String titulo, int duracionEnMinutos, String genero, String categoria){
        super(titulo, duracionEnMinutos, genero);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del Sketch:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Categoría: " + this.categoria);
        System.out.println();
    }
}