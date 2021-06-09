package Vista;
import  Controller.ClienteController;
import java.util.Scanner;
import Model.Cliente;
public class ClienteVista {
     public ClienteController ConCli;
    public Scanner teclado;
    public ClienteVista(){
        ConCli = new ClienteController();
        teclado = new Scanner(System.in);
    }
    public void menu(){
        int opcion = 0;
        do {            
            System.out.println("1. Crear");
            System.out.println("2. Actualizar");
            System.out.println("3. Buscar");
            System.out.println("4. Eliminar");
            System.out.println("5. Listar");
            System.out.println("6. Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: crear(); break;
                case 2: actualizar(); break;
                case 3: buscar(); break;
                case 4: eliminar(); break;
                case 5: listar(); break;
            }
        } while (opcion<6);
    }
    public void crear(){
        System.out.println("Ingrese el nombre");
        String Nombre = teclado.next();
        System.out.println("Ingrese la cedula");
        String Cedula = teclado.next();
        System.out.println("Resultado: " + ConCli.crear(Nombre, Cedula));
    }
    public Cliente buscar(){
        System.out.println("Ingrese la cedula");
        String cedula = teclado.next();
        Cliente cliente = ConCli.buscar(cedula);
        ConCli.setCliente(cliente);
        System.out.println(cliente);
        return cliente;
    }
    public void actualizar(){
        Cliente cliente = buscar();
        if(cliente != null){
            System.out.println("Ingrese el nuevo nombre");
            String nombre = teclado.next();
            System.out.println("Resultado: " +ConCli.actualizar(nombre,cliente.getCedula()));
        }
    }
    public void eliminar(){
        Cliente cliente = buscar();
        if(cliente != null)
            System.out.println("Resultado: " + ConCli.eliminar(cliente.getCedula()));
    }
    public void listar(){
        for (Cliente cliente: ConCli.getLisCli()) 
            System.out.println(cliente);
    }

    public ClienteController getConCli() {
        return ConCli;
    }

    public void setConCli(ClienteController ConCli) {
        this.ConCli = ConCli;
    }

}
