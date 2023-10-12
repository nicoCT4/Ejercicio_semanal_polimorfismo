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

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }

    // Implementación del método abstracto prestar
    public void prestar() {
        if (getEstado() == Estado.DISPONIBLE && getCantidadEjemplares() > 0) {
            setEstado(Estado.AGOTADO);
            setCantidadEjemplares(getCantidadEjemplares() - 1);
            System.out.println("Revista prestada exitosamente.");
        } else {
            System.out.println("La revista no está disponible para préstamo.");
        }
    }
}