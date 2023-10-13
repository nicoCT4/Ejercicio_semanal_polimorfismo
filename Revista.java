public class Revista extends Documento {
    private int año;
    private int número;

    public Revista(int id, String titulo, String materia, int cantidadEjemplares, Estado estado, int año, int número) {
        super(id, titulo, materia, cantidadEjemplares, estado);
        this.año = año;
        this.número = número;
    }

    // Métodos GET
    public int getAño() {
        return año;
    }

    public int getNúmero() {
        return número;
    }
    // Implementación del método abstracto prestar
    public void prestar() {
    }
}