public class Revista extends Documento {
    private int anio;
    private int numero;

    public Revista(int id, String titulo, String materia, int cantidadEjemplares, Estado estado, int anio, int numero) {
        super(id, titulo, materia, cantidadEjemplares, estado);
        this.anio = anio;
        this.numero = numero;
    }

    // Métodos GET
    public int getanio() {
        return anio;
    }

    public int getnumero() {
        return numero;
    }
    // Implementación del método abstracto prestar
    public void prestar() {
    }
}