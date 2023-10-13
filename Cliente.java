import java.util.ArrayList;
public class Cliente {
    private int carnet;
    private String nombre;
    private ArrayList<Documento> préstamos;
    private int límitePréstamos;

    public Cliente(int carnet, String nombre, int límitePréstamos) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.límitePréstamos = límitePréstamos;
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

    public int getLímitePréstamos() {
        return límitePréstamos;
    }
    public boolean puedeSolicitarMásPréstamos() {
        return préstamos.size() < límitePréstamos;
    }
    public boolean solicitarPréstamo(Documento documento) {
        if (préstamos.size() < límitePréstamos) {
            préstamos.add(documento);
            return true; // Préstamo exitoso
        } else {
            return false; // Límite de préstamos alcanzado
        }
    }
}

