// Clase Préstamo
public class Prestamo<Fecha> {
    private Cliente cliente;
    private Documento documento;
    private Fecha fechaSolicitud;
    private Fecha fechaDevolución;

    public Prestamo(Cliente cliente, Documento documento, Fecha fechaSolicitud, Fecha fechaDevolución) {
        this.cliente = cliente;
        this.documento = documento;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaDevolución = fechaDevolución;
    }

    // Métodos GET
    public Cliente getCliente() {
        return cliente;
    }

    public Documento getDocumento() {
        return documento;
    }

    public Fecha getFechaSolicitud() {
        return fechaSolicitud;
    }

    public Fecha getFechaDevolución() {
        return fechaDevolución;
    }

    // Otros métodos específicos de Préstamo
}

