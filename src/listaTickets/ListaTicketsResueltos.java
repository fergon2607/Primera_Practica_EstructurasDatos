package listaTickets;
import ticket.Ticket;

public class ListaTicketsResueltos {

    private NodoTicket primero;

    public ListaTicketsResueltos() {
        primero = null;
    }

    public void insertar(Ticket ticket) {
        NodoTicket nuevo = new NodoTicket(ticket);

        if(primero == null) {
            primero = nuevo;
            return;
        }
        NodoTicket temp = primero;

        while(temp.getSiguiente() != null) {
            temp = temp.getSiguiente();
        }
        temp.setSiguiente(nuevo);
    }

    public Ticket buscar(int id) {
        NodoTicket temp = primero;
        while(temp != null) {
            if(temp.getTicket().getId() == id) {
                return temp.getTicket();
            }
            temp = temp.getSiguiente();
        }
        return null;
    }
}