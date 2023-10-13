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

    
    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    public void setCantidadEjemplares(int cantidadEjemplares) {
        this.cantidadEjemplares = cantidadEjemplares;
    }
    // Método abstracto
    public abstract void prestar();{
    if (getEstado() == Estado.DISPONIBLE && getCantidadEjemplares() > 0) {
        setEstado(Estado.AGOTADO);
        setCantidadEjemplares(getCantidadEjemplares() - 1);
        System.out.println("Revista prestada exitosamente.");
    } else {
        System.out.println("La revista no está disponible para préstamo.");
    }
    }
    // Nuevo campo para almacenar al cliente que tiene el documento prestado
    protected Cliente clientePrestamo;

    // Constructor y métodos existentes

    public Cliente getClientePrestamo() {
        return clientePrestamo;
    }

    public void setClientePrestamo(Cliente cliente) {
        this.clientePrestamo = cliente;
    }
}
