public abstract class Documento {
    protected int id;
    protected String titulo;
    protected String materia;
    protected int cantidadEjemplares;
    protected Estado estado;

    public Documento(int id, String titulo, String materia, int cantidadEjemplares, Estado estado) {
        this.id = id;
        this.titulo = titulo;
        this.materia = materia;
        this.cantidadEjemplares = cantidadEjemplares;
        this.estado = estado;
    }

    protected enum Estado {
        DISPONIBLE,
        AGOTADO
    }
    
    // Métodos GET
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMateria() {
        return materia;
    }

    public int getCantidadEjemplares() {
        return cantidadEjemplares;
    }

    public Estado getEstado() {
        return estado;
    }

    // Método abstracto
    public abstract void prestar();
}
