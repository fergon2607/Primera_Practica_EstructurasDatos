package ticket;
import java.time.LocalDateTime;

public class Ticket {
    // aTRIBUTOS
    private static int cantidad = 0;

    private int id;
    private String descripcion;
    private String nombreCompleto;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaResolucion;

    // Metodos
    // Constructor
    public Ticket(String descripcion, String nombreCompleto) {
        cantidad++;
        this.id = cantidad;
        this.descripcion = descripcion;
        this.nombreCompleto = nombreCompleto;
        this.fechaCreacion = LocalDateTime.now();
        this.fechaResolucion = null;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public LocalDateTime getFechaResolucion() {
        return fechaResolucion;
    }

    public void resolver() {
        this.fechaResolucion = LocalDateTime.now();
    }

    // To String
    @Override
    public String toString() {
        return "Ticket #" + id +
                "\nUsuario: " + nombreCompleto +
                "\nDescripcion: " + descripcion +
                "\nFecha Creacion: " + fechaCreacion +
                "\nFecha Resolucion: " + fechaResolucion + "\n";
    }
}