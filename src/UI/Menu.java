package UI;

import cola.Cola;
import listaTickets.ListaTicketsResueltos;
import ticket.Ticket;
import java.util.Scanner;

public class Menu {

    public static void iniciar(Cola pendientes, ListaTicketsResueltos resueltos) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("1. Crear ticket");
            System.out.println("2. Ver ticket pendiente");
            System.out.println("3. Resolver ticket");
            System.out.println("4. Buscar ticket resuelto");
            System.out.println("5. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1:
                    System.out.println("Nombre:");
                    String nombre = sc.nextLine();
                    System.out.println("Descripcion:");
                    String descripcion = sc.nextLine();
                    Ticket t = new Ticket(descripcion, nombre);
                    pendientes.insertar(t);
                    break;

                case 2:
                    System.out.println(pendientes.verFrente());
                    break;

                case 3:
                    Ticket res = pendientes.remover();
                    if(res != null){
                        res.resolver();
                        resueltos.insertar(res);
                    }
                    break;

                case 4:
                    System.out.println("Ingrese ID:");
                    int id = sc.nextInt();
                    Ticket encontrado = resueltos.buscar(id);
                    if(encontrado == null)
                        System.out.println("Ticket pendiente");
                    else
                        System.out.println(encontrado);
                    break;
            }
        } while(opcion != 5);
    }
}