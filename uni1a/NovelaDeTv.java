/**
 * Class NovelaDeTV
 */
package uni1a;

// Subclase NovelaDeTV que extiende de ContenidoAudiovisual
public class NovelaDeTv extends ContenidoAudiovisual {
    private int capitulos;

    public NovelaDeTv(String titulo, int duracionEnMinutos, String genero, int capitulos){
        super(titulo, duracionEnMinutos, genero);
        this.capitulos = capitulos;
    }

    public int getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(int capitulos) {
        this.capitulos = capitulos;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la Novela De TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Capítulos: " + this.capitulos);
        System.out.println();
    }
}