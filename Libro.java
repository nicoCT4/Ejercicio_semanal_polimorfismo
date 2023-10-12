public class Libro extends Documento {
    private String autor;
    private String editorial;

    public Libro(int id, String titulo, String materia, int cantidadEjemplares, Estado estado, String autor, String editorial) {
        super(id, titulo, materia, cantidadEjemplares, estado);
        this.autor = autor;
        this.editorial = editorial;
    }

    // Métodos GET
    public String getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }
    
    // Implementación del método abstracto prestar
    public void prestar() {
        // Implementación específica para prestar un libro
    }
}
