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

    // Otros métodos para interactuar con la biblioteca, como búsqueda, cálculos, etc.
}
