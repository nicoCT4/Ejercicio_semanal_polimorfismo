import java.util.ArrayList;
public class Cliente {
    private int númeroIdentidad;
    private String nombre;
    private String dirección;
    private ArrayList<Documento> préstamos;
    private int límitePréstamos;

    public Cliente(int númeroIdentidad, String nombre, String dirección, int límitePréstamos) {
        this.númeroIdentidad = númeroIdentidad;
        this.nombre = nombre;
        this.dirección = dirección;
        this.límitePréstamos = límitePréstamos;
        this.préstamos = new ArrayList<>();
    }

    // Métodos GET
    public int getNúmeroIdentidad() {
        return númeroIdentidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDirección() {
        return dirección;
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

