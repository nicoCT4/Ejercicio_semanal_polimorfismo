import java.util.ArrayList;
public class Biblioteca {
    private ArrayList<Documento> documentos;

    public Biblioteca() {
        documentos = new ArrayList<>();
    }

    // Método para agregar nuevos documentos a la lista de publicaciones
    public void agregarDocumento(Documento documento) {
        documentos.add(documento);
    }

    public int contarLibros() {
        int contador = 0;
        for (Documento documento : documentos) {
            if (documento instanceof Libro) {
                contador++;
            }
        }
        return contador;
    }

    public int contarRevistas() {
        int contador = 0;
        for (Documento documento : documentos) {
            if (documento instanceof Revista) {
                contador++;
            }
        }
        return contador;
    }

    public int contarArticulos() {
        int contador = 0;
        for (Documento documento : documentos) {
            if (documento instanceof Articulo) {
                contador++;
            }
        }
        return contador;
    }
    public void devolverDocumento(int id) {
        for (Documento documento : documentos) {
            if (documento.getId() == id && documento.getEstado() == Documento.Estado.AGOTADO) {
                documento.setEstado(Documento.Estado.DISPONIBLE);
                documento.setCantidadEjemplares(documento.getCantidadEjemplares() + 1);
                System.out.println("Documento devuelto con éxito.");
                return;
            }
        }
        System.out.println("El documento con ID " + id + " no se puede devolver o no se encuentra en la biblioteca.");
    }
    public Documento buscarDocumentoPorID(int id) {
        for (Documento documento : documentos) {
            if (documento.getId() == id) {
                return documento;
            }
        }
        return null; // Si no se encuentra el documento
    }
    public ArrayList<Libro> obtenerLibros() {
        ArrayList<Libro> libros = new ArrayList<>();
        for (Documento documento : documentos) {
            if (documento instanceof Libro) {
                libros.add((Libro) documento);
            }
        }
        return libros;
    }
    
}
