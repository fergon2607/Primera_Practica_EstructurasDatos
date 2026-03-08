import cola.Cola;
import listaTickets.ListaTicketsResueltos;
import UI.Menu;

public class Main {
    public static void main(String[] args) {
        // =========================================
        // INICIALIZACION DE ESTRUCTURAS DE DATOS
        // =========================================

        // Cola de tickets pendientes
        Cola pendientes = new Cola();

        // Lista enlazada de tickets resueltos
        ListaTicketsResueltos resueltos = new ListaTicketsResueltos();

        // =========================================
        // INICIO DEL SISTEMA
        // =========================================
        System.out.println("====================================");
        System.out.println("   SISTEMA DE GESTION DE TICKETS");
        System.out.println("====================================");

        // Inicia el menu principal del sistema
        Menu.iniciar(pendientes, resueltos);

        // =========================================
        // FIN DEL PROGRAMA
        // =========================================

        System.out.println("\n====================================");
        System.out.println("  El sistema ha finalizado.");
        System.out.println("====================================");
    }
}