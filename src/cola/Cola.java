package cola;

import ticket.Ticket;
import java.util.ArrayList;

public class Cola {

    private ArrayList<Ticket> cola;

    public Cola() {
        cola = new ArrayList<>();
    }

    private boolean estaVacia() {
        return cola.isEmpty();
    }

    public void insertar(Ticket ticket) {
        cola.add(ticket);
    }

    public Ticket verFrente() {
        if(estaVacia()) {
            System.out.println("No hay tickets pendientes.");
            return null;
        }
        return cola.get(0);
    }

    public Ticket remover() {
        if(estaVacia()) {
            System.out.println("No hay tickets pendientes.");
            return null;
        }
        return cola.remove(0);
    }
}
