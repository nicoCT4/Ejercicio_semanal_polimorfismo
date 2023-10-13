import java.time.LocalDate;
public class Articulo extends Documento {
    private String contenido;
    private LocalDate fecha;

    public Articulo(int id, String titulo, String materia, int cantidadEjemplares, Estado estado, String contenido, LocalDate fecha) {
        super(id, titulo, materia, cantidadEjemplares, estado);
        this.contenido = contenido;
        this.fecha = fecha;
    }

    // Métodos GET
    public String getContenido() {
        return contenido;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    // Implementación del método abstracto prestar
    public void prestar() {
    }
}
