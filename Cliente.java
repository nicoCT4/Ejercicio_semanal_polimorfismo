import java.util.ArrayList;
public class Cliente {
    private int carnet;
    private String nombre;
    private ArrayList<Documento> préstamos;
    private int Prestamos;

    public Cliente(int carnet, String nombre, int Prestamos) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.Prestamos = Prestamos;
        this.préstamos = new ArrayList<>();
    }

    // Métodos GET
    public int getcarnet() {
        return carnet;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Documento> getPréstamos() {
        return préstamos;
    }

    public int getPrestamos() {
        return Prestamos;
    }
    public boolean puedeSolicitarMásPréstamos() {
        return préstamos.size() < Prestamos;
    }
    public boolean solicitarPréstamo(Documento documento) {
        if (préstamos.size() < Prestamos) {
            préstamos.add(documento);
            return true; // Préstamo exitoso
        } else {
            return false; // Prestamos de préstamos alcanzado
        }
    }
}

